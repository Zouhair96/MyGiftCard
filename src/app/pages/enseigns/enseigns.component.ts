
import { Component, OnInit } from '@angular/core';
import { EnseignsService } from './enseigns.service';
@Component({
  selector: 'app-enseigns',
  templateUrl: './enseigns.component.html',
  styleUrls: ['./enseigns.component.css']
})
export class EnseignsComponent implements OnInit {

  enseigns;
  constructor(private service: EnseignsService) { }

  ngOnInit() {
   this.service.onGetEnseign()
    .subscribe(data => {
      this.enseigns = data;
    }, err => {
      console.log(err);
    });
  }
  deleteEnseign(id) {
    this.service.onDeleteEnseign(id)
    .subscribe(data => {

    }, err => {
      console.log(err);
    });
}
}
