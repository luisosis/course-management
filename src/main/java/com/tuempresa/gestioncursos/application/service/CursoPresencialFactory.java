package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.port.in.Curso;

public class CursoPresencialFactory extends CursoFactory{

    @Override
    public Curso crearCurso(String nombre) {

        return new CursoOnline(nombre);
    }
}
