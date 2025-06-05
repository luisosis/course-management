package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.port.in.Curso;

public class CursoPresencial implements Curso {

    private String nombre;

    public CursoPresencial(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void detalles() {
        System.out.println("Curso online: "+nombre);
    }
}
