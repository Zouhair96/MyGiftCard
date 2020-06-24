import {Component, OnInit} from '@angular/core';
import {Validators} from '@angular/forms';


import { CartesService } from './../cartes/cartes.service';

import { HttpEventType, HttpResponse } from '@angular/common/http';
import { EnseignsService } from './../enseigns/enseigns.service';
import { CategoriesService } from './../categories/categories.service';
@Component({
  selector: 'app-newcarte',
  templateUrl: './newcarte.component.html',
  styleUrls: ['./newcarte.component.css']
})
export class NewcarteComponent implements OnInit {
  mode = 'new-carte';
  private selectedFiles = true;
  private addPhoto: boolean;
  private progress: number;
  private currentFileUpload: any;
  currentTime: Date;
  enseigns;
  categories;
  minprix = 5;
  maxprix = this.minprix ;
  constructor(
              private cartesService: CartesService,
              private enseigneService: EnseignsService,
              private categorieService: CategoriesService  ) {}

  ngOnInit() {
    this.enseigneService.getAllEnseignes()
    .subscribe(data =>{
        this.enseigns = data;
      }, error =>{
        console.log(error);
      }
    );


    this.categorieService.getAllCartegorie()
    .subscribe(data =>{
        this.categories = data;
      }, error =>{
        console.log(error);
      }
    );
  }

  AddCarte(postData){
    this.cartesService.onInsertCarte(postData)
    .subscribe( postData => {
      console.log(postData);
    }, err => {
      console.log(err);
    });
  }

  onGetPhoto(){
    this.addPhoto =true;
  }
  onSelectFile(event){
    this.selectedFiles = event.target.files;
  }
  /*upload(){
    this.progress = 0;
    this.currentFileUpload = this.selectedFiles.item(0);
    this.cartesService.uploadPhotoCarte(this.currentFileUpload).subscribe(event => {
      if (event.type === HttpEventType.UploadProgress) {
        this.progress = Math.round(100 * event.loaded / event.total);
      } else if (event instanceof HttpResponse) {

        alert("Problème de time");
      }
    },err=>{
      alert("Problème de chargement");
    })



    this.selectedFiles = undefined
  }*/
}
