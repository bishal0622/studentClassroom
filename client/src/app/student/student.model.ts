export class Student {
  public id?: number;
  public firstName?: string;
  public lastName?: string;
  public grade ?: number;

  constructor(id?: number,
              firstName?: string,
              lastName?: string,
              grade ?: number) {
    this.id = id ? id : null;
    this.firstName = firstName ? firstName : null;
    this.lastName = lastName ? lastName : null;
    this.grade = grade ? grade : null;
  }
}
