package com.techniq.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public String getStart(){
        return "services";
    }

}
