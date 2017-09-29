package com.winterfell.pilot.web;

import com.winterfell.pilot.domain.EmpVO;
import com.winterfell.pilot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

@Controller
public class EmpController {

    private EmpService empService;

    @Autowired
    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @RequestMapping(value = "/empList", method = RequestMethod.GET)
    public String getEmpList(@ModelAttribute EmpVO empVO, Model model) {
        model.addAttribute("empList", empService.getEmpList(empVO));
        return "/emp/empList";
    }

    @ExceptionHandler({SQLException.class})
    public String databaseError() {
        return "/err/dbError";
    }

}
