import { Component, OnInit } from '@angular/core';
import { CategoriesService } from './../categories/categories.service';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-cartes-categorie',
  templateUrl: './cartes-categorie.component.html',
  styleUrls: ['./cartes-categorie.component.css']
})
export class CartesCategorieComponent implements OnInit {
  cartes;
  constructor(private service: CategoriesService,
              private route: ActivatedRoute,
              private router: Router) {
                router.events.subscribe(event=>{
                  if(event instanceof NavigationEnd){
                    let url = atob(route.snapshot.params.urlCartes);
                    this.getCartes(url);
                  }
                });
              }

  ngOnInit(): void {
  }
  getCartes(url){
    this.service.onGetCartesCategorie(url)
    .subscribe(data => {
      this.cartes = data;
    }, err => {})
  }
}
