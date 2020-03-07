import { Component, OnInit } from '@angular/core';
import { CategoriesService } from './categories.service';
@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {

  categories;
  constructor(private service: CategoriesService) { }

  ngOnInit() {
    this.service.getCartegories()
    .subscribe(data => {
      this.categories = data;
    }, err => {
      console.log(err);
    });
  }
  deleteCartegorie(id) {
    this.service.onDeleteCartegorie(id)
    .subscribe(data => {

    }, err => {
      console.log(err);
    });
  }
}
