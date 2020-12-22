package fr.kevindvz.breizhvideo.service;

import fr.kevindvz.breizhvideo.model.Village;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public interface VillageService {
    List<Village> listVillages(String search);
    Optional<Village> getVillage(Long id);
    Village insertVillage(Village Village);
    Village updateVillage(Long id, Village Village);
    void deleteVillage(Long id);
}
