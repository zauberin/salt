package com.winterfell.pilot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ThymeleafController {

    @RequestMapping("thymeHello")
    public String sayHello(Model model) {
        model.addAttribute("msg", "This is Thymeleaf Template!!");
        return "thymeHello";
    }
}
