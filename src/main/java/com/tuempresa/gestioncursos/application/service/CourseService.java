package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.model.Usuario;
import com.tuempresa.gestioncursos.domain.port.in.CourseUseCase;
import com.tuempresa.gestioncursos.domain.port.out.CourseRepositoryPort;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class CourseService implements CourseUseCase {

    private final CourseRepositoryPort courseRepositoryPort;

    private Map<Integer, Usuario> baseDatos = new HashMap<>();
    {
        baseDatos.put(1, new Usuario(1, "Ana"));
        baseDatos.put(2, new Usuario(2, "Carlos"));
    }

    @Override
    public Observable<Course> getAllCourses() {
        log.info("Starting getAllCourses in service");
        return courseRepositoryPort.findAll();
    }

    // Método que puede o no encontrar un usuario
    public Optional<Usuario> buscarPorId(int id) {
        return Optional.ofNullable(baseDatos.get(id));
    }

    Optional<Usuario> usuarioOpt = buscarPorId(4);

//    // Forma 1: ifPresent
//        usuarioOpt.ifPresent(usuario ->
//            System.out.println("Usuario encontrado: " + usuario.getNombre())
//            );
//
//    // Forma 2: orElse
//    String nombre = usuarioOpt
//            .map(Usuario::getNombre)
//            .orElse("Desconocido");
//        System.out.println("Nombre: " + nombre);
//
//    // Forma 3: orElseThrow
//    Usuario usuario = usuarioOpt.orElseThrow(() ->
//            new NoSuchElementException("Usuario no encontrado con id " + id)
//    );

}
