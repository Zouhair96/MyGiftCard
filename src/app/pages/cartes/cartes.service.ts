import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CartesService {
  host = "http://localhost:9090";
  constructor(private http: HttpClient) { }

  getCartes(){
     return this.http.get(this.host+"/cartes");
  }


}
