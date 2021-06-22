package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //renders the homepage. Handler returns /index and renders the index.html template
    @GetMapping
    public String index() {
        return "index";
    }
}
