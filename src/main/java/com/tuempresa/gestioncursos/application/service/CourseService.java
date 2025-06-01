package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.model.CourseDto;
import com.tuempresa.gestioncursos.domain.port.in.CourseUseCase;
import com.tuempresa.gestioncursos.domain.port.out.CourseRepositoryPort;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CourseService implements CourseUseCase {

    private final CourseRepositoryPort courseRepositoryPort;

    @Override
    public Observable<Course> getAllCourses() {
        log.info("Starting getAllCourses in service");
        return courseRepositoryPort.findAll();
    }
}
