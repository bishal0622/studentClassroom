package org.itglance.docsea.service.dto;

import org.itglance.docsea.domain.Classroom;
import org.itglance.docsea.domain.Student;

/**
 * Created by bishal on 7/6/17.
 */
public class ClassroomDTO {

    public Long id;
    public Student student;
    public Integer section;

    public ClassroomDTO() {
    }

    public ClassroomDTO(Long id, Student student, Integer section) {
        this.id = id;
        this.student = student;
        this.section = section;
    }

    public ClassroomDTO(Classroom classroom){
        this(classroom.getId(),classroom.getStudent(),classroom.getSection());
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Integer getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "ClassroomDTO{" +
                "id=" + id +
                ", student=" + student +
                ", section=" + section +
                '}';
    }
}
