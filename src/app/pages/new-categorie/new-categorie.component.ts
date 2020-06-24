import {Component, OnInit} from '@angular/core';
import { CategoriesService } from './../categories/categories.service';
@Component({
  selector: 'app-new-categorie',
  templateUrl: './new-categorie.component.html',
  styleUrls: ['./new-categorie.component.css']
})
export class NewCategorieComponent implements OnInit {
  private selectedFiles = true;

  constructor(private service: CategoriesService) { }

  ngOnInit() {
  }
  AddCategorie(postData){
    this.service.onInsertCategorie(postData)
    .subscribe( postData => {
      console.log(postData);
    }, err => {
      console.log(err);
    });
  }
  onSelectFile(event){
    this.selectedFiles = event.target.files;
  }
}
