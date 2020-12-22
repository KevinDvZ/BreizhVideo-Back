package fr.kevindvz.breizhvideo.service;

import fr.kevindvz.breizhvideo.model.Film;
import fr.kevindvz.breizhvideo.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmServiceImpl implements FilmService{

    @Autowired
    FilmRepository repository;

    @Override
    public List<Film> listFilms() {
        return repository.findAll();
    }


}
