import {Component, OnInit} from '@angular/core';
import {FormControl, Validators} from '@angular/forms';
import { EnseignsService } from './../enseigns/enseigns.service';
@Component({
  selector: 'app-new-enseign',
  templateUrl: './new-enseign.component.html',
  styleUrls: ['./new-enseign.component.css']
})
export class NewEnseignComponent implements OnInit {
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);
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
}
