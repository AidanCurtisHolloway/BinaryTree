package com.trees.springboottree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnterNumbersController {

    @GetMapping("/enter-numbers")
    public String showEnterNumbersPage() {
        return "enter-numbers"; // HTML page for entering numbers
    }
}
