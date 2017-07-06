package org.itglance.docsea.repository;

import org.itglance.docsea.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bishal on 7/6/17.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
