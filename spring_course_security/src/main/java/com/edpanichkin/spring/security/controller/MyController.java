package com.edpanichkin.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view-for-all-employees";
    }

    @GetMapping("/hr-info")
    public String getInfoOnlyForHR(){
        return "hr-info";
    }
    @GetMapping("/manager-info")
    public String getInfoOnlyForManagers() {
        return "manager-info";
    }
}
