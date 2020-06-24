import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoriesService {
  host = 'http://localhost:9090';
  constructor(private http: HttpClient) { }


  getCartegorie(id) {
    return this.http.get(this.host + `/categories/${id}`);
  }
  getAllCartegorie() {
    return this.http.get(this.host + `/categories`);
  }
  onDeleteCartegorie(id) {
    return this.http.delete(this.host + `/categories/${id}`);
  }

  onInsertCategorie(postData){
    return this.http.post(this.host + '/categories', postData);
  }

  onGetCartesCategorie(url){
    return this.http.get(url);
  }
  onUpdateCategorie(id, postData){
    return this.http.put(this.host + `/categories/${id}`, postData);
  }

  getCartegories(mc:string,page:number,size:number){
    return this.http.get(this.host + `/categories/search/cat?mc=`+mc+"&size="+size+"&page="+page);
  }


}
