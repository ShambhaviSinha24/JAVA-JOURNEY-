class ticket {
   String passengerName;
   int age;
   int seats;
   double fare;
    ticket() {
        System.out.println("Welcome to the Bus Booking System");
 }
 ticket(String name){
   passengerName=name;
    System.out.println("Booking for one person");
 }
 ticket(String name,int age){
   passengerName=name;
   this.age=age;
    System.out.println("Passenger details added");
 }
 ticket(String name,int age,int seats,double fare){
   passengerName=name;
   this.age=age;
   this.seats=seats;
   this.fare=fare;
    
 }
 void displayBooking(){
   System.out.println("\n----Booking Details----");
   System.out.println("Passenger Name:"+passengerName);
   System.out.println("Passenger age:"+age);
   System.out.println("Seats Booked:"+seats);
   System.out.println("Total fare: Rs."+(seats*fare));
   System.out.println("Booking Confirmed!");
 }

 public static void main(String [] args){
   ticket t0=new ticket();
    ticket t1=new ticket ("Rahul");
    ticket t2= new ticket ("Priya",25);
    ticket t3= new ticket ("Shambhavi",20,2,250);
    t3.displayBooking();
    
}
 }
 

 
