package fr.kevindvz.breizhvideo.controller;

import fr.kevindvz.breizhvideo.model.Film;
import fr.kevindvz.breizhvideo.service.FilmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/films")
    public List<Film> getFilms(){
        return filmService.listFilms();
    }
}
