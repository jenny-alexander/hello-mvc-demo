package com.hellomvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloMvcDemoController {
    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "greet";
    }
}

