package fr.kevindvz.breizhvideo.service;

import fr.kevindvz.breizhvideo.model.Film;
import fr.kevindvz.breizhvideo.repository.FilmRepository;
import fr.kevindvz.breizhvideo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmServiceImpl implements FilmService{

    @Autowired
    FilmRepository repository;

    @Override
    public List<Film> listFilms() {
        return repository.findAll();
    }


}
