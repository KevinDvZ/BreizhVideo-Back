package fr.kevindvz.breizhvideo.model;

import javax.persistence.*;

@Entity


public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String postCode;
}
