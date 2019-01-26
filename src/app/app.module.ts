import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AgmCoreModule } from '@agm/core';
import { AppComponent } from './app.component';
import { ParkComponent } from './park/park.component';

@NgModule({
  declarations: [
    AppComponent,
    ParkComponent
  ],
  imports: [
    BrowserModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyARmJOK4ppjJjhYVhxP-JgbqB6Kt4FCB6A'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
