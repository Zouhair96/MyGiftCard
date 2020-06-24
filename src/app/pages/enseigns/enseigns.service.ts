
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EnseignsService {

  host = 'http://localhost:9090';
  constructor(private http: HttpClient) { }

  onGetEnseign(mc:string,page:number,size:number){
    return this.http.get(this.host + `/enseigns/search/enseign?mc=`+mc+"&size="+size+"&page="+page);
  }
  getEnseigne(id) {
    return this.http.get(this.host + `/enseigns/${id}`);
  }
  onDeleteEnseign(id) {
    return this.http.delete(this.host + `/enseigns/${id}`);
  }
  getAllEnseignes(){
    return this.http.get(this.host + '/enseigns');

  }

  onInsertEnseign(postData){
    return this.http.post(this.host + '/enseigns', postData);
  }
  onGetCartesEnseigne(url){
    return this.http.get(url);
  }
  onUpdateEnseigne(id, data){
    return this.http.put(this.host + `/enseigns/${id}`, data);
  }

}
