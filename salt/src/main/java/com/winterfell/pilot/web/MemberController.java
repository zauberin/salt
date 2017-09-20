package com.winterfell.pilot.web;

import com.winterfell.pilot.domain.MemberVO;
import com.winterfell.pilot.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.HashMap;


@Controller
@RequestMapping("/member")
public class MemberController {

    private static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService memberService;

    @RequestMapping("/input")
    public String goMemberInput() {
        return "member/memberInput";
    }

    @RequestMapping("/view")
    public String getMemberInfo(@RequestParam("id") String id, Model model) {
        model.addAttribute("memberInfo", memberService.getMemberInfo(id));
        return "member/memberInfo";
    }

    @RequestMapping("/list")
    public String getMemberList(@ModelAttribute MemberVO memberVO, Model model) {
        model.addAttribute("memberList", memberService.getMemberList(memberVO));
        return "member/memberList";
    }

    @RequestMapping("/inputAction")
    public String addMember(@ModelAttribute MemberVO memberVO) {
        logger.info("I'm here .. New One +");
        memberService.addMember(memberVO);
        return "redirect:/member/list";
    }

    @RequestMapping("/mod")
    public String goMemberMod(@RequestParam("id") String id, Model model) {
        model.addAttribute("memberInfo", memberService.getMemberInfo(id));
        return "member/memberInput";
    }

    @RequestMapping("/modAction")
    public String modMember(@ModelAttribute MemberVO memberVO) {
        logger.info("mod Action .....");
        memberService.modMember(memberVO);
        return "redirect:/member/list";
    }

    @RequestMapping("/del")
    public String deleteMember(@RequestParam("id") String id) {
        memberService.delMember(id);
        return "redirect:/member/list";
    }

    @ExceptionHandler({SQLException.class})
    public String databaseError(Model model) {
        // something to contain inform
        return "/err/dbError";
    }

}
