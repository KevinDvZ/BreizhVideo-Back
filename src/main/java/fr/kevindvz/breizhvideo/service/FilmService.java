package fr.kevindvz.breizhvideo.service;

import java.util.List;

import fr.kevindvz.breizhvideo.model.Film;
import org.springframework.stereotype.Service;

@Service
public interface FilmService {
     List<Film> listFilms();

}
