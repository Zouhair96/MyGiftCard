import {Component, OnInit} from '@angular/core';
import {Validators} from '@angular/forms';


import { CartesService } from './../cartes/cartes.service';
@Component({
  selector: 'app-newcarte',
  templateUrl: './newcarte.component.html',
  styleUrls: ['./newcarte.component.css']
})
export class NewcarteComponent implements OnInit {
  constructor(
              private cartesService: CartesService) {}

  ngOnInit() {
  }
  AddCarte(postData){
    this.cartesService.onInsertCarte(postData)
    .subscribe( postData => {
      console.log(postData);
    }, err => {
      console.log(err);
    });
  }
}
