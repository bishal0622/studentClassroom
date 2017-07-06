package org.itglance.docsea.domain;

import javax.persistence.*;

/**
 * Created by bishal on 7/6/17.
 */
@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public Integer section;
    @OneToOne(cascade = CascadeType.PERSIST)
    public Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", section='" + section + '\'' +
                ", student=" + student +
                '}';
    }
}
