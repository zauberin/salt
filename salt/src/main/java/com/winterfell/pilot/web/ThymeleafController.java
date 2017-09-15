package com.winterfell.pilot.web;

import com.winterfell.pilot.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    private static Logger logger = LoggerFactory.getLogger(ThymeleafController.class);

    private static List<Car> carList = new ArrayList<Car>();

    static {
        carList.add(new Car("Honda1", "Civic"));
        carList.add(new Car("Toyota1", "Camry"));
        carList.add(new Car("Nissan1", "Altima"));
    }

    @RequestMapping(value = "/cars2", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("carList", carList);
        return "/cars2";
    }

    @RequestMapping(value = "/add2", method = RequestMethod.POST)
    public String addCar(@ModelAttribute("car22") Car car) {
        if (null != car && null != car.getMake() && null != car.getModel()) {
            carList.add(car);
        }
        return "redirect:/cars2";
    }

}
