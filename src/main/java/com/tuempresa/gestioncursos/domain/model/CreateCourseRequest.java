package com.tuempresa.gestioncursos.domain.model;

public record CreateCourseRequest(String nombre,String descripcion,int duracionHoras, String tipo) {}
