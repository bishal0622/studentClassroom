import {Component, OnInit} from '@angular/core';
import {Student} from './student.model';
import {StudentService} from './student.service';
import {Classroom} from '../classroom/classroom.model';
import {ClassRoomService} from '../classroom/classroom.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html'
})

export class StudentComponent implements OnInit {

  classroom: Classroom;
  classrooms: Classroom[];
  checkS: boolean;
  checkU: boolean;


  constructor(private classroomService: ClassRoomService) {
    this.classroom = new Classroom();
    this.checkU = false;
    this.checkS = true;
  }

  ngOnInit() {
    this.classroomService.query().subscribe(res => this.onSuccess(res), () => console.log('error'));
  }

  onSuccess(res) {
    this.classrooms = res.json();
    console.log(res.json());
  }

  save() {
    console.log(this.classroom);
    this.classroomService.create(this.classroom).subscribe((res) => this.onSaveCR(res), () => console.log('error'));
  }

  onSaveCR(res) {
    console.log(res);
    this.classroomService.query().subscribe(response => this.onSuccess(response), () => console.log('error'));
  }

  delete(id) {
    this.classroomService.delete(id).subscribe(res => this.onsuccessDel(), () => console.log('error'));
  }

  onsuccessDel() {
    this.classroomService.query().subscribe(response => this.onSuccess(response), () => console.log('error'));
  }

  update(id) {
    this.checkU = !this.checkU;
    this.checkS = !this.checkS;
    this.classroomService.find(id).subscribe(response => this.onSuccessGet(response), () => console.log('error'));
  }

  onSuccessGet(response) {
    this.classroom = response;
  }

  change() {
    this.classroomService.update(this.classroom).subscribe(response => this.onSuccessUpdate(response), () => console.log('error'));
  }

  onSuccessUpdate(response) {
    this.classroomService.query().subscribe(res => this.onSuccess(res), () => console.log('error'));
  }
}
