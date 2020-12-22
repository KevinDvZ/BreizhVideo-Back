package fr.kevindvz.breizhvideo.repository;


import fr.kevindvz.breizhvideo.model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {

}
