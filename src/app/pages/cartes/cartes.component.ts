import { Component, OnInit } from '@angular/core';
import { CartesService } from './cartes.service';
@Component({
  selector: 'app-cartes',
  templateUrl: './cartes.component.html',
  styleUrls: ['./cartes.component.css']
})
export class CartesComponent implements OnInit {
  cartes;
  constructor(private service: CartesService) { }

  ngOnInit() {
    this.service.getCartes()
    .subscribe(data => {
      this.cartes = data;
    }, err => {
      console.log(err);
    });
  }
  deleteCarte(id) {
    this.service.deleteCarte(id)
    .subscribe(data => {

    }, err => {
      console.log(err);
    });
  }

}
