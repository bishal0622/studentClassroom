import {Student} from '../student/student.model';

export class Classroom {
  public id ?: number;
  public section ?: number;
  public student ?: Student;

  constructor(id?: number,
              section?: number,
              student?: Student) {
    this.id = id ? id : null;
    this.section = section ? section : null;
    this.student = student ? student : new Student();
  }
}
