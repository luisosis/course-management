package com.tuempresa.gestioncursos.infrastructure.persistence.mapper;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.model.CourseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseDto toDto(Course course);
}
