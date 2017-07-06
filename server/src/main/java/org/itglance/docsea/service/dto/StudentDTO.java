package org.itglance.docsea.service.dto;

import org.itglance.docsea.domain.Student;

/**
 * Created by bishal on 7/6/17.
 */
public class StudentDTO {

    public Long id;
    public String firstName;
    public String lastName;
    public Integer grade;

    public StudentDTO() {
    }

    public StudentDTO(Long id, String firstName, String lastName,Integer grade){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.grade=grade;
    }

    public StudentDTO(Student student){
        this(student.getId(),student.getFirstName(),student.getLastName(),student.getGrade());
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGrade() {
        return grade;
    }


}
