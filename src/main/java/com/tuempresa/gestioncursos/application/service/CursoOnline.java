package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.port.in.Curso;

public class CursoOnline implements Curso {

    private String nombre;

    public CursoOnline(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void detalles() {
        System.out.println("Curso online: "+nombre);

    }
}
