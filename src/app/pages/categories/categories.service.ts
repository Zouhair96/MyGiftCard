import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoriesService {
  host = 'http://localhost:9090';
  constructor(private http: HttpClient) { }

  getCartegories() {
     return this.http.get(this.host + '/categories');
  }
  onDeleteCartegorie(id) {
    return this.http.delete(this.host + `/categories/${id}`);
  }

  onInsertCategorie(postData){
    return this.http.post(this.host + '/categories', postData);
  }


}
