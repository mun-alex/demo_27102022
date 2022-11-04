package kz.bitlab.first.demo.controllers;

import kz.bitlab.first.demo.db.DBManager;
import kz.bitlab.first.demo.models.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private Magazine magazine;

    @GetMapping
    String getIndex(Model model) {
        List<Magazine> allMagazines = DBManager.getMagazineList();
        model.addAttribute("magazineList", allMagazines);
        model.addAttribute("newMagazine", magazine);
        return "index";
    }

    @PostMapping(value = "/add-magazine")
    String addMagazine(@ModelAttribute(name = "newMagazine") Magazine magazine) {
        DBManager.addMagazine(magazine);
        List<String> list = new ArrayList<>();
        return "redirect:/";
    }
}