package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InitController {

    @GetMapping("/")
    public String init(Model model,
            @RequestParam(defaultValue = "Hellow World") String message) {
        model.addAttribute("message", message);
        return "index";
    }
}
