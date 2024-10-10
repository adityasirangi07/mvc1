package com.aditya.spring.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String home(Model model) {
        // Add attributes to the model to be displayed on the JSP page
        model.addAttribute("id", 101);
        model.addAttribute("name", "John Doe");
        model.addAttribute("salary", 5000.00);

        // Return the view name (JSP file without the extension)
        return "hello";  // This will resolve to /WEB-INF/views/hello.jsp
    }
}
