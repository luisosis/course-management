package com.tuempresa.gestioncursos.adapter.web;

import com.tuempresa.gestioncursos.domain.model.CourseDto;
import com.tuempresa.gestioncursos.domain.port.in.CourseUseCase;
import com.tuempresa.gestioncursos.infrastructure.persistence.mapper.CourseMapper;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
@Slf4j
public class CourseController {

    private final CourseUseCase courseUseCase;
    private final CourseMapper courseMapper;

    @GetMapping
    public Observable<CourseDto> getAllCourses() {
        log.info("Starting getAllCourses in controller");
        return courseUseCase.getAllCourses()
                .map(courseMapper::toDto)
                .doFinally(() -> log.info("log dentro del observable"));
    }
}
