package th.ac.kmitl.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieFantasyController {
    @RequestMapping("/Fantasy")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee");
        // return home.html
        return "Fantasy";
    }
}
