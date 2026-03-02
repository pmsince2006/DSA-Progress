import java.util.Scanner;
//QUESTION 1
// class car {
//     int baseFare;
//     int distance;

//     car(int baseFare, int distance) {
//         this.baseFare = baseFare;
//         this.distance = distance;
//     }

//     int calculateFare() {
//         return baseFare;
//     }
// }

// class Mini extends car {
//     Mini(int baseFare, int distance) {
//         super(baseFare, distance);
//     }

//     @Override
//     int calculateFare() {
//         return baseFare + (distance * 8);
//     }
// }

// class Sedan extends car {
//     Sedan(int baseFare, int distance) {
//         super(baseFare, distance);
//     }

//     @Override
//     int calculateFare() {
//         return baseFare + (distance * 10); 
//     }
// }

// class SUV extends car {
//     SUV(int baseFare,int distance) {
//         super(baseFare, distance);
//     }

//     @Override
//     int calculateFare() {
//         return baseFare + (distance * 15);
//     }
// }

// public class questions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String rideType = sc.next();
//         int baseFare = sc.nextInt();
//         int distance = sc.nextInt();
//         car ride;
//         if (rideType.equals("Mini")) {
//             ride = new Mini(baseFare, distance);
//         } else if (rideType.equals("Sedan")) {
//             ride = new Sedan(baseFare, distance);
//         } else {
//             ride = new SUV(baseFare, distance);
//         }
//         System.out.println(ride.calculateFare());
//     }
// }



// QUESTION 2
// class sal{
//     int salary;
//     int bonus;

//     sal(int salary,int bonus){
//         this.salary = salary;
//         this.bonus = bonus;
//     }

//     int calculatesal(){
//         return salary;
//     }
// }

// class bns extends sal{
//     bns(int salary,int bonus){
//         super(salary,bonus);
//     }

//     @Override
//     int calculatesal(){
//         return salary + bonus;
//     }
// }

// public class questions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sala = sc.nextInt();
//         int bon = sc.nextInt();

//         sal s = new bns(sala,bon);
//         System.out.println(s.calculatesal());
        
//     }
// }



//QUESTION 3
// abstract class payment{
//     double amount;

//     payment(double amount){
//         this.amount = amount;
//     }

//     abstract double calcfee();

//     public void processpay(){
//         double fee = calcfee();
//         System.out.printf("Fee: %.2f\n", fee);
//         System.out.printf("Total Amount debited: %.2f\n", amount + fee);
//     }
// }
// class Creditcard extends payment{
//     Creditcard(double amount){
//         super(amount);
//     }
//     @Override
//     double calcfee(){
//         return amount * 0.02;
//     }
// }
// class Debitcard extends payment{
//     Debitcard(double amount){
//         super(amount);
//     }
//     @Override
//     double calcfee(){
//         return amount * 0.01;
//     }
// }
// class UPI extends payment{
//     UPI(double amount){
//         super(amount);
//     }
//     @Override
//     double calcfee(){
//         return amount * 0.001;
//     }
// }
// public class question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double amount = sc.nextDouble();
//         String paymenttype = sc.next();

//         payment payment;
//         switch(paymenttype){
//             case "credit":
//                 payment = new Creditcard(amount);
//                 break;
//             case "debit":
//                 payment = new Debitcard(amount);
//                 break;
//             case "upi":
//                 payment = new UPI(amount);
//                 break;
//             default:
//                 System.out.println("Invalid payment type");
//                 return;
//         }
//         payment.processpay();
//     }
// }

