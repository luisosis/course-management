package com.tuempresa.gestioncursos.infrastructure.persistence.mapper;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.model.CourseDto;
import com.tuempresa.gestioncursos.domain.model.CourseDtoResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseDto toDto(Course course);

    CourseDtoResponse toDtoResponse(Course course);
}
