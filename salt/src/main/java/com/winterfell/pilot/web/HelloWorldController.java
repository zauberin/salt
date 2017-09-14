package com.winterfell.pilot.web;

import com.winterfell.pilot.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("helloWorld")
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloWorld");
        mav.addObject("message", "Winter is coming!!");
        return mav;
    }

    @RequestMapping(value="step1/{id}", method=RequestMethod.GET)
    public String goStep1(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "step";
    }

    @RequestMapping("page/{var}")
    public String page(@PathVariable String var, Model model) {
        model.addAttribute("page", var);
        return var;
    }
    // 오류없이 나오긴 하지만 var가 미정변수라 그런지IDE 가 못 알아먹는다 (inspection x)

    @RequestMapping("member/test1")
    public String test(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String id   = request.getParameter("id");

        model.addAttribute("name", name);
        model.addAttribute("id", id);

        return "member/test1";
    } // 무식한 방법

    @RequestMapping("member/test2")
    public String test2(@RequestParam("name") String name, @RequestParam("id") String id, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "member/test2";
    } // 파라미터 받을 땐 이렇게

    @RequestMapping("member/join")
    public String personInfo(Person person, Model model) {
        logger.info(person.toString());

        person.setName("Haahahahahaahah");
        person.setId("zauberin");

        logger.info(person.toString());

        model.addAttribute("person", person);  // this line ... model 빼도 오류 없이 된다. 그런데 jsp 에서 ${person.xx} 을 IDE가 못알아 먹음.

        return "member/join";
    }



}
