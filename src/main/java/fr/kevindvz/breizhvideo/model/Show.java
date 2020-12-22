package fr.kevindvz.breizhvideo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Date releaseDate;

    @ManyToOne @JoinColumn(name="village_id")
    private Village village;


}
