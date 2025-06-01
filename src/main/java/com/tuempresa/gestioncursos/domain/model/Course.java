package com.tuempresa.gestioncursos.domain.model;


import lombok.*;

@Getter
@Setter
public class Course {
    private String name;
    private String credits;

    public Course(String name, String credits) {
        this.name = name;
        this.credits = credits;
    }
}
