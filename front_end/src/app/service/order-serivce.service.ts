import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { Order } from '../model/order';

@Injectable({
  providedIn: 'root'
})
export class OrderSerivceService {

  private baseUrl = 'http://localhost:8080/api/allOrders';
  constructor(private http: HttpClient) { }

  getOrders(): Observable<Order[]> {
    return this.http.get<Order[]>(this.baseUrl).pipe(
      map(
        response => response
      )
    )
  }
}
