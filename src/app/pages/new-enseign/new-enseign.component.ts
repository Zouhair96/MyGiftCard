import {Component, OnInit} from '@angular/core';
import { EnseignsService } from './../enseigns/enseigns.service';
@Component({
  selector: 'app-new-enseign',
  templateUrl: './new-enseign.component.html',
  styleUrls: ['./new-enseign.component.css']
})
export class NewEnseignComponent implements OnInit {
  private selectedFiles = true;

  constructor(private service: EnseignsService) { }

  ngOnInit(): void {
  }
  AddEnseign(postData){
    this.service.onInsertEnseign(postData)
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
