package com.tuempresa.gestioncursos.domain.port.out;

import com.tuempresa.gestioncursos.domain.model.Course;
import io.reactivex.rxjava3.core.Observable;

public interface CourseRepositoryPort {

    Observable<Course> findAll();
}
