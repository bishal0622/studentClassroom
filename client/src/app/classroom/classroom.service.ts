import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {Classroom} from './classroom.model';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
@Injectable()
export class ClassRoomService {

  private resourceUrl = 'http://localhost:9000/api/classroom';

  constructor(private http: Http) {

  }

  create(classroom: Classroom) {
    return this.http.post(this.resourceUrl, classroom).map((res) => res.json());
  }

  query() {
    return this.http.get(this.resourceUrl);
  }

  find(id: number) {
    return this.http.get(`${this.resourceUrl}/${id}`).map((res) => res.json());
  }

  update(classroom: Classroom) {
    return this.http.put(this.resourceUrl, classroom);
  }

  delete(id: number) {
    return this.http.delete(`${this.resourceUrl}/${id}`);
  }

}
