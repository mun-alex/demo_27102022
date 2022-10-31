package kz.bitlab.first.demo.controllers;

import kz.bitlab.first.demo.db.DBManager;
import kz.bitlab.first.demo.models.Magazine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping
    String getIndex(Model model) {
        List<Magazine> allMagazines = DBManager.getMagazineList();
        model.addAttribute("magazineList", allMagazines);
        return "index";
    }

    @GetMapping(value = "/magazines")
    String getMagazines() {
        return "magazines";
    }
}
