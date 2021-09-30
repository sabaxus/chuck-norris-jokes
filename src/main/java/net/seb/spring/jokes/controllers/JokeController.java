package net.seb.spring.jokes.controllers;

import net.seb.spring.jokes.services.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final Service jokesService;

    public JokeController(Service jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
