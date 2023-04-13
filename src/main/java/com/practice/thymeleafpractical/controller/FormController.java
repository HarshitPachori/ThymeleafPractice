package com.practice.thymeleafpractical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.thymeleafpractical.models.LoginData;

import jakarta.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/loginform")
    public String validateForm(Model model) {
        System.out.println("opening form.....");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    // handler for processing form
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
        // model attribute ki wajah se process form ka saara data object logindata me
        // chala gaya
        // @valid ki wajah se validations trigger honge jo hamne models me lagaye aur
        // iska data store hoga binding result ke object me
        if (result.hasErrors()) {
            System.out.println(result);
            // agar error aajaye to form page par hi raho
            return "form";
        }
        System.out.println(loginData);
        return "success";
    }
}
