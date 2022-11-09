import { Address } from "./address";

export class Customer {
    customerId!:Number;
    firstName!:String;
    lastName!:String;
    mobileNumber!:Number;
    dob!: Date;
    emailId!:String;
    password!:String;
    cPassword!:String;
    addressLine!: String;
    city!:String;
    state!:String;
    pincode!:Number;
    //address!:Address;
}
