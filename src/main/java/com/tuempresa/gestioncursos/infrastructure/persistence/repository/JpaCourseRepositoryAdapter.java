package com.tuempresa.gestioncursos.infrastructure.persistence.repository;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.port.out.CourseRepositoryPort;
import com.tuempresa.gestioncursos.infrastructure.persistence.mapper.CourseEntityMapper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaCourseRepositoryAdapter implements CourseRepositoryPort {

    private final SpringDataCourseRepository springDataCourseRepository;
    private final CourseEntityMapper mapper;

    @Override
    public Observable<Course> findAll() {
        return Observable.fromIterable(springDataCourseRepository.findAll())
                .subscribeOn(Schedulers.io())
                .map(mapper::toDomain);
    }
}
