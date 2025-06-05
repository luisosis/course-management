package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.port.in.Curso;

public abstract class CursoFactory {

    public abstract Curso crearCurso(String nombre);
}
