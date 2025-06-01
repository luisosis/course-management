package com.tuempresa.gestioncursos.infrastructure.persistence.mapper;

import com.tuempresa.gestioncursos.domain.model.Course;
import com.tuempresa.gestioncursos.domain.model.CourseDto;
import com.tuempresa.gestioncursos.infrastructure.persistence.entity.CourseEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseEntityMapper {
    Course toDomain(CourseEntity course);
}
