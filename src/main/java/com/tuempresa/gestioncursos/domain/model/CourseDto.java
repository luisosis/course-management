package com.tuempresa.gestioncursos.domain.model;


import lombok.*;

@Setter
@Getter
public class CourseDto {
    private String name;
    private String credits;

    public CourseDto(String name, String credits) {
        this.name = name;
        this.credits = credits;
    }
}
