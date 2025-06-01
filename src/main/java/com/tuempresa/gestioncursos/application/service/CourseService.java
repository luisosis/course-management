package com.tuempresa.gestioncursos.application.service;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.model.CourseDto;
import com.tuempresa.gestioncursos.domain.port.in.CourseUseCase;
import com.tuempresa.gestioncursos.domain.port.out.CourseRepositoryPort;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService implements CourseUseCase {

    private final CourseRepositoryPort courseRepositoryPort;

    @Override
    public Observable<Course> getAllCourses() {
        return courseRepositoryPort.findAll();
        //return Observable.fromIterable(courses());
    }

    private List<Course> courses() {
        return Arrays.asList(new Course("Mate","5"),
                new Course("Algoritmica","3"));
    }
}
