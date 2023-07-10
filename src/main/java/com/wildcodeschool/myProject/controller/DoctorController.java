package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctors/1")
    @ResponseBody
    public String getDoctorName() {
        return "William Hartnell";
    }

    @GetMapping("/doctors/10")
    @ResponseBody
    public String getDoctorName2() {
        return "David Tennant";
    }

    @GetMapping("/doctors/11")
    @ResponseBody
    public String getDoctorName3() {
        return "Jodie Whittaker";
    }
}
