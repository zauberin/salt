package com.winterfell.pilot.web;

import com.winterfell.pilot.domain.MemberVO;
import com.winterfell.pilot.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    /*@RequestMapping("/list")
    public String getMemberList(@ModelAttribute MemberVO memberVO, Model model) {

    }*/


}
