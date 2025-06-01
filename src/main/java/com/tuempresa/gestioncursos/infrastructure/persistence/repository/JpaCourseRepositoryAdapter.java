package com.tuempresa.gestioncursos.infrastructure.persistence.repository;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.port.out.CourseRepositoryPort;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaCourseRepositoryAdapter implements CourseRepositoryPort {

    private final SpringDataCourseRepository springDataCourseRepository;
    //private final CourseEntityMapper mapper;

    @Override
    public Observable<Course> findAll() {
        return Observable.fromIterable(springDataCourseRepository.findAll())
                .map(courseEntity ->
                        new Course(courseEntity.getName(), courseEntity.getCredits()));
    }
}
