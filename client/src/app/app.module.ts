import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {StudentComponent} from './student/student.component';
import {StudentService} from './student/student.service';
import {ClassRoomService} from './classroom/classroom.service';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [StudentService, ClassRoomService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
