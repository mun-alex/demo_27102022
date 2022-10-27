package kz.bitlab.first.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    String getIndex() {
        return "index";
    }
}
