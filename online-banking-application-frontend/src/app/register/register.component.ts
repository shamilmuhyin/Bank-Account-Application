import { Component, OnInit } from '@angular/core';
import { Address } from '../address';
import { Customer } from '../customer';
import { RegisterCustomerService } from '../register-customer.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  customer:Customer = new Customer();
  constructor(private registerSerice: RegisterCustomerService) { }

  ngOnInit(): void {
  }

  customerRegister(){
    console.log(this.customer);
    this.registerSerice.registerCustomer(this.customer).subscribe(data=>{
      alert("Successfully registered.")
    },error=>alert("Unable to register.")
    )
  }
}
