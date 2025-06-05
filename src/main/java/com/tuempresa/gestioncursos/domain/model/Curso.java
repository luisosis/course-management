package com.tuempresa.gestioncursos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Curso {
    private Long id;
    private String nombre;
    private String descripcion;
    private int duracionHoras;
    private String tipo; // 'online', 'presencial'
}
