package com.tuempresa.gestioncursos.domain.port.in;

import com.tuempresa.gestioncursos.domain.model.Course;
import io.reactivex.rxjava3.core.Observable;

public interface CourseUseCase {

    Observable<Course> getAllCourses();
}
