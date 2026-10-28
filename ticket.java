 class ticket {
    ticket() {
        System.out.println("Welcome to the Bus Booking System");
 }
 ticket(int i){
    System.out.println("Booking for one person");
 }
 ticket(int i, int j){
    System.out.println("Booking for two person");
 }
 ticket(int i, int j, int k){
    System.out.println("Booking for three person");
 }
 public static void main(String [] args){
    ticket t1=new ticket (50);
    ticket t2= new ticket (50,50);
    ticket t3= new ticket (50,50,50);
    
}
 }
 
