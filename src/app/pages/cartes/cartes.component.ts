import { Component, OnInit } from '@angular/core';
import { CartesService } from './cartes.service';
@Component({
  selector: 'app-cartes',
  templateUrl: './cartes.component.html',
  styleUrls: ['./cartes.component.css']
})
export class CartesComponent implements OnInit {
  cartes;
  mc:string = "" ;
  page:number = 0;
  size:number = 5;
  constructor(private service: CartesService) { }

  ngOnInit() {
    this.onGetAllCartes();
    this.chercher();
  }
  onGetAllCartes(){
    this.service.getCartes(this.mc,this.size,this.page)
    .subscribe(data => {
      this.cartes = data;
    }, err => {
      console.log(err);
    });
  }
  deleteCarte(id) {
    let c=confirm("Etes vous sur?");
    if(!c) return;
    this.service.deleteCarte(id)
    .subscribe(data => {
      this.onGetAllCartes();
    }, err => {
      console.log(err);
    });
  }

  chercher(){
    this.onGetAllCartes();
  }

}
