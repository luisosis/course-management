package com.tuempresa.gestioncursos.adapter.web;

import com.tuempresa.gestioncursos.application.service.CursoFactory;
import com.tuempresa.gestioncursos.application.service.CursoOnlineFactory;
import com.tuempresa.gestioncursos.application.service.CursoPresencialFactory;
import com.tuempresa.gestioncursos.domain.model.CourseDtoResponse;
import com.tuempresa.gestioncursos.domain.model.CreateCourseRequest;
import com.tuempresa.gestioncursos.domain.port.in.CourseUseCase;
import com.tuempresa.gestioncursos.domain.port.in.Curso;
import com.tuempresa.gestioncursos.infrastructure.persistence.mapper.CourseMapper;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
@Slf4j
public class CourseController {

    private final CourseUseCase courseUseCase;
    private final CourseMapper courseMapper;

    @GetMapping
    public Observable<CourseDtoResponse> getAllCourses() {
        log.info("Starting getAllCourses in controller");
        return courseUseCase.getAllCourses()
                .map(courseMapper::toDtoResponse)
                .doFinally(() -> log.info("log dentro del observable"));
    }

    @PostMapping("/create")
    public Completable saveCourse(@RequestBody CreateCourseRequest request) {
        CursoFactory factory;
        if ("online".equalsIgnoreCase(request.tipo())) {
            factory = new CursoOnlineFactory();
        } else if ("presencial".equalsIgnoreCase(request.tipo())) {
            factory = new CursoPresencialFactory();
        } else {
            return Completable.complete();
        }
        Curso curso = factory.crearCurso(request.nombre());
        curso.detalles();
        // Aquí guardarías el curso en DB usando tu service/repository

        return Completable.complete();
    }
}
