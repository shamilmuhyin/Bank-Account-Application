import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from './customer';
import { Observable, Observer} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class RegisterCustomerService {
  baseURL = "http://localhost:8080/manager"
  constructor(private httpClient:HttpClient) { }

  registerCustomer(customer: Customer): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/registerCustomer`,customer);
  }
}
