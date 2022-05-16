package com.techniq.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("")
    public String getStart(){
        return "index";
    }

    @GetMapping("/index")
    public String getStart1(){
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/objects")
    public String getObjects(){
        return "objects";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }

    @GetMapping("/services")
    public String getServices(){
        return "services";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }

}
