import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {Student} from './student.model';

@Injectable()
export class StudentService {

  private resourceUrl = 'api/student';

  constructor(private http: Http) {

  }

  create(student: Student) {
    return this.http.post(this.resourceUrl, student);
  }

  query() {
    return this.http.get(this.resourceUrl);
  }

  find(id: number) {
    // return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => res.json());
  }

  update(student: Student) {
    return this.http.put(this.resourceUrl, student);
  }

  delete(id: number) {
    return this.http.delete(`${this.resourceUrl}/${id}`);
  }

}
