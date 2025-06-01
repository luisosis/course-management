package com.tuempresa.gestioncursos.infrastructure.persistence.repository;

import com.tuempresa.gestioncursos.infrastructure.persistence.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCourseRepository extends JpaRepository<CourseEntity, Long> {
}
