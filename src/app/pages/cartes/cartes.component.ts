import { Component, OnInit } from '@angular/core';
import { CartesService } from './cartes.service';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
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
    .subscribe(data=>{
      this.cartes = data;
    }, err =>{
      console.log(err);
    });
  }

}
