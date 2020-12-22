package fr.kevindvz.breizhvideo.repository;


import fr.kevindvz.breizhvideo.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

}
