import { Injectable } from '@angular/core';
import { HttpClient, HttpEvent, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class CartesService {
  host = 'http://localhost:9090';
  constructor(private http: HttpClient) { }


  getCartes(mc:string,page:number,size:number){
    return this.http.get(this.host + `/cartes/search/cartes?mc=`+mc+"&size="+size+"&page="+page);
  }
  deleteCarte(id) {
    return this.http.delete(this.host + `/cartes/${id}`);
  }
  onInsertCarte(postData){
    return this.http.post(this.host + '/cartes', postData);
  }

  uploadPhotoCarte(file: File): Observable<HttpEvent<{}>> {
    let formdata: FormData = new FormData();
    formdata.append('file', file);
    const req = new HttpRequest('POST', this.host + '/uploadPhoto/', formdata, {
      reportProgress: true,
      responseType: 'text'
    });

    return this.http.request(req);
  }


}
