package org.itglance.docsea.service;

import org.itglance.docsea.domain.Classroom;
import org.itglance.docsea.domain.Student;
import org.itglance.docsea.repository.ClassroomRepository;
import org.itglance.docsea.repository.StudentRepository;
import org.itglance.docsea.service.dto.ClassroomDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by bishal on 7/6/17.
 */

@Service
public class ClassroomService {

    public ClassroomRepository classroomRepository;

    public StudentRepository studentRepository;

    public ClassroomService(ClassroomRepository classroomRepository, StudentRepository studentRepository) {
        this.classroomRepository = classroomRepository;
        this.studentRepository = studentRepository;
    }

    public Classroom insertClassRoom(ClassroomDTO classroomDTO){

        Student student = new Student();
        student.setFirstName(classroomDTO.getStudent().getFirstName());
        student.setLastName(classroomDTO.getStudent().getLastName());
        student.setGrade(classroomDTO.getStudent().getGrade());

        Classroom classroom = new Classroom();
        Long studentCount =studentRepository.count();
        int section = (int) (studentCount/30);
        classroom.setSection(section);
        classroom.setStudent(classroomDTO.getStudent());
        return classroomRepository.save(classroom);
    }

    public void deleteClassRoom(Long id){
        classroomRepository.delete(id);
    }

    public Classroom updateClassRoom(ClassroomDTO classroomDTO){
        Classroom classroom=classroomRepository.findOne(classroomDTO.getId());

        Student student = new Student();
        student.setFirstName(classroomDTO.getStudent().getFirstName());
        student.setLastName(classroomDTO.getStudent().getLastName());
        student.setGrade(classroomDTO.getStudent().getGrade());

        classroom.setStudent(student);
        classroom.setSection(classroomDTO.getSection());
        return classroomRepository.save(classroom);
    }

    public List<Classroom> getAllClassRoom(){
        return classroomRepository.findAll();
    }

    public Classroom getClassRoom(Long id){
        return classroomRepository.findOne(id);
    }

}
