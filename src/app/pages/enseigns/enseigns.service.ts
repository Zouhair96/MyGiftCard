
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EnseignsService {

  host = 'http://localhost:9090';
  constructor(private http: HttpClient) { }

  onGetEnseign() {
     return this.http.get(this.host + '/enseigns');
  }
  onDeleteEnseign(id) {
    return this.http.delete(this.host + `/enseigns/${id}`);
  }

  onInsertEnseign(postData){
    return this.http.post(this.host + '/enseigns', postData);
  }


}
