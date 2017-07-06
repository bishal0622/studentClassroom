package org.itglance.docsea.web.rest;

import org.itglance.docsea.domain.Classroom;
import org.itglance.docsea.repository.ClassroomRepository;
import org.itglance.docsea.service.ClassroomService;
import org.itglance.docsea.service.dto.ClassroomDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bishal on 7/6/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ClassroomController {

    private ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @PostMapping("/classroom")
    public ResponseEntity<?> insertClassroom(@RequestBody ClassroomDTO classroomDTO){
        Classroom classroom=classroomService.insertClassRoom(classroomDTO);
        System.out.println("classroom  " +classroomDTO.toString());
        return new ResponseEntity<Classroom>(classroom, HttpStatus.OK);
    }

    @DeleteMapping("/classroom/{id}")
    public ResponseEntity<?> deleteClassroom(@PathVariable Long id){
        classroomService.deleteClassRoom(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/classroom")
    public ResponseEntity<?> updateClassroom(@RequestBody ClassroomDTO classroomDTO){
        Classroom classroom=classroomService.updateClassRoom(classroomDTO);
        return new ResponseEntity<Classroom>(classroom, HttpStatus.OK);
    }

    @GetMapping("/classroom")
    public ResponseEntity<?> getAllClassroom(){
        List<Classroom> classrooms = classroomService.getAllClassRoom();
        return new ResponseEntity<List<Classroom>>(classrooms,HttpStatus.OK);
    }

    @GetMapping("/classroom/{id}")
    public ResponseEntity<?> getClassroom(@PathVariable Long id){
        Classroom classroom = classroomService.getClassRoom(id);
        return new ResponseEntity<Classroom>(classroom,HttpStatus.OK);
    }
}
