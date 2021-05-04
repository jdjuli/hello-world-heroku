package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HelloController {

    @GetMapping("/")
    public String getHelloWorld(Model model){
        model.addAttribute("today", new Date());
        return "t_helloWorld";
    }

}
