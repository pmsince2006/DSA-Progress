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


// QUESTION 4
// class area{
//     double calcarea(double rad){
//         return 3.14 * rad * rad;
//     }
//     double calcarea(double length, double width){
//         return 2 * length * width;
//     }
//     double calcarea(double length,double height,String type){
//         if(type == "triangle"){
//             return 0.5 * length * height;
//         }
//         return 0;
//     }
// }
// public class questions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String type = sc.next();
//         area a = new area();
//         double area = 0;
//         if (type.equals("Circle")) {
//             double radius = sc.nextDouble();
//             area = a.calcarea(radius);
//         } else if (type.equals("Rectangle")) {
//             double length = sc.nextDouble();
//             double width = sc.nextDouble();
//             area = a.calcarea(length, width);
//         } else if (type.equals("triangle")) {
//             double base = sc.nextDouble();
//             double height = sc.nextDouble();
//             area = a.calcarea(base, height, "triangle");
//         }
//         System.out.println(area);
        
//     }
// }



//QUESTION 5
// class appliance{
//     void msg(){
//         System.out.println("I am in appliance class");
//     }
// }
// class ac extends appliance{
//     @Override
//     void msg(){
//         System.out.println("AC is on");
//     }
// }
// class fan extends appliance{
//     @Override
//     void msg(){
//         System.out.println("Fan is on");
//     }
// }
// class light extends appliance{
//     @Override
//     void msg(){
//         System.out.println("Light is on");
//     }
// }
// public class question{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String type = sc.next();

//         appliance app;
//         switch(type.toLowerCase()){
//             case "ac":
//                 app = new ac();
//                 break;
//             case "fan":
//                 app = new fan();
//                 break;
//             case "light":
//                 app = new light();
//                 break;
//             default:
//                 System.out.println("Invalid type");
//                 return;
//         }
//         app.msg();
//     }
// }




// QUESTION 6
// abstract class account{
//     double balance;

//     account(double balance){
//         this.balance = balance;
//     }

//     abstract double calcint();

//     public void processpay(){
//         double in = calcint();
//         System.out.printf("Total Interest generated: %.2f\n", in);
//     }
// }
// class saving extends account{
//     saving(double balance){
//         super(balance);
//     }
//     @Override
//     double calcint(){
//         return balance * 0.04;
//     }
// }
// class current extends account{
//     current(double balance){
//         super(balance);
//     }
//     @Override
//     double calcint(){
//         return balance * 0.01;
//     }
// }
// public class question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double balance = sc.nextDouble();
//         String acctype = sc.next();

//         account acc;
//         switch(acctype.toLowerCase()){
//             case "saving":
//                 acc = new saving(balance);
//                 break;
//             case "current":
//                 acc = new current(balance);
//                 break;
//             default:
//                 System.out.println("Invalid account type");
//                 return;
//         }
//         acc.processpay();
//     }
// }



// QUESTION 7
// class Vehicle {
//     int speed;
//     Vehicle(int speed) {
//         this.speed = speed;
//     }
//     void displayVehicle() {
//         System.out.println("Speed: " + speed + " km/h");
//     }
// }
// class TransportVehicle extends Vehicle {
//     int capacity;
//     TransportVehicle(int speed, int capacity) {
//         super(speed);
//         this.capacity = capacity;
//     }
//     void displayTransportDetails() {
//         System.out.println("Capacity: " + capacity + " kg");
//     }
// }
// class Truck extends TransportVehicle {
//     Truck(int speed, int capacity) {
//         super(speed, capacity); 
//     }
//     void displayDetails() {
//         displayVehicle();
//         displayTransportDetails();
//         System.out.println("Vehicle Type: Truck");
//     }
// }
// public class question {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int speed = sc.nextInt();
//         int capacity = sc.nextInt();

//         if (speed > 200) {
//             System.out.println("Speed exceeds limit");
//             return;
//         }

//         Truck truck = new Truck(speed, capacity);
//         truck.displayDetails();
//     }
// }
