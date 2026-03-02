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



// ques 2
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



//ques 3
class area{
    double calcarea(double rad){
        return 3.14 * rad * rad;
    }
    double calcarea(double length, double width){
        return 2 * length * width;
    }
    double calcarea(double length,double height,String type){
        if(type == "triangle"){
            return 0.5 * length * height;
        }
        return 0;
    }
}
public class questions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        area a = new area();
        double area = 0;
        if (type.equals("Circle")) {
            double radius = sc.nextDouble();
            area = a.calcarea(radius);
        } else if (type.equals("Rectangle")) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            area = a.calcarea(length, width);
        } else if (type.equals("triangle")) {
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            area = a.calcarea(base, height, "triangle");
        }
        System.out.println(area);
        
    }

}
