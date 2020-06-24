
import {Component, OnInit} from '@angular/core';
import { EnseignsService } from './enseigns.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-enseigns',
  templateUrl: './enseigns.component.html',
  styleUrls: ['./enseigns.component.css']
})
export class EnseignsComponent implements OnInit {
  currentEns;
  enseigns;
  mode = "list-ens";
  mc:string = "" ;
  page:number = 0;
  size:number = 5;

  constructor(private service: EnseignsService,
               private router: Router) { }

  ngOnInit() {
    this.onGetAllEnseignes();
  }
  onGetAllEnseignes(){
    this.service.onGetEnseign(this.mc,this.size,this.page)
    .subscribe(data => {
      this.enseigns = data;
    }, err => {
      console.log(err);
    });
  }
  deleteEnseigne(id) {
    let c=confirm("Etes vous sur?");
    if(!c) return;
    this.service.onDeleteEnseign(id)
    .subscribe(data => {
      this.mode ="list-ens"
      this.onGetAllEnseignes();
    }, err => {
      console.log(err);
    });
}
onEditEnseigne(enseigne){
  this.service.getEnseigne(enseigne)
  .subscribe( data =>{
    this.currentEns = data;
    this.mode="edit-ens";
  }, err =>{});
}

EditEnseign(data){
  this.service.onUpdateEnseigne(this.currentEns.id, data)
  .subscribe( data => {
    this.mode="list-ens";
    this.onGetAllEnseignes();
  }, err => {
    console.log(err);
  });
}
getCartes(enseign){
  let url = enseign._links.carte.href;
  this.router.navigateByUrl("/cartesCat/"+btoa(url));
}
chercher(){
  this. onGetAllEnseignes();
}
}
