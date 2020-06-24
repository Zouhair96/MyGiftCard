import { Component, OnInit } from '@angular/core';
import { CategoriesService } from './categories.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  currentCat;
  categories;
  mode ="list-cat";
  mc:string = "" ;
  page:number = 0;
  size:number = 5;
  constructor(private service: CategoriesService, private router: Router) { }

  ngOnInit() {
    this.onGetAllCategories();
  }
  onGetAllCategories(){
    this.service.getCartegories(this.mc,this.size,this.page)
    .subscribe(data => {
      this.categories = data;
    }, err => {
      console.log(err);
    });
  }


  getCartes(cat){
    let url = cat._links.cartes.href;
    this.router.navigateByUrl("/cartesCat/"+btoa(url));
  }

  onEditCat(cat){
    this.service.getCartegorie(cat)
    .subscribe( data =>{
      this.currentCat = data;
      this.mode="edit-cat";
    }, err =>{});
  }

  deleteCartegorie(id) {
    let c=confirm("Etes vous sur?");
    if(!c) return;
    this.service.onDeleteCartegorie(id)
    .subscribe(data => {
      this.mode ="list-ens"
      this.onGetAllCategories();
    }, err => {
      console.log(err);
    });
}
  EditCategorie(postData){
    this.service.onUpdateCategorie(this.currentCat.id, postData)
    .subscribe( postData => {
      this.mode="list-cat";
      this.onGetAllCategories();
    }, err => {
      console.log(err);
    });
  }

  chercher(){
    this.onGetAllCategories();
  }
}
