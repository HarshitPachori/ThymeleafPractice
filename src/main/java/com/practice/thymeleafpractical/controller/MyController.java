package com.practice.thymeleafpractical.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("inside about handler......");
        model.addAttribute("name", "Harshit Pachori");
        model.addAttribute("date", new Date().toLocaleString());
        return "about";
    }

    // handler for including the fragments
    @GetMapping("/service")
    public String serviceHandler(Model m) {
        m.addAttribute("title", "I like to eat samosa");
        m.addAttribute("subtitle", new Date().toLocaleString());

        return "service";
    }

    @GetMapping("/newabout")
    public String newAbout() {
        return "aboutnew";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
