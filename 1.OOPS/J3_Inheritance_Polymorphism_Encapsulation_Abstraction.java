// Inheritance:

// child class inheriting properties from parent class is inheritance
// the ineherited class uses the properties using the super keyword
// it is actually the refrence variable which tells which members to be accesed 

// Single Inheritance : one class extends another class
// Multilevel Inheritance : the extended class is a parent of another class (class -> subclass -> subclass)
// Multiple Inheritance ; when one class extends more than one class (not allowed in java)
// Hierarchial Inheritance : one class is inherted from many class
// Hybrid inheritance : Combination of single and multiple inheritance




// Polymorphism : many ways to represent a single entity

// 1. Compile time / Static polymorphism : 
// Achieved via method overloading (same name of the method but types / args / return types / order is diffrent)
// ex : multiple constructors with diffrent arguments / return types

// 2. Run time / Dynamic polymorphism :
// Achieved by method overriding
// the name, return types all are same only the body is different 
// this is an example of method overriding (same method overridden by classes)
// class shapes{
//     void area(){
//         System.out.println("i exist is shapes class");
//     }
// }
// class circle extends shapes{
//     void area(){
//         System.out.println("area is 3.14 * radius * radius");
//     }
// }
// class triangle extends shapes{
//     void area(){
//         System.out.println("area is 0.5 * base * height");
//     }
// }
// class square extends shapes{
//     void area(){
//         System.out.println("area is side * side");
//     }
// }


// public class J3_Inheritance_Polymorphism_Encapsulation_Abstraction {
//     public static void main(String[] args) {
//         // shapes s = new shapes();
//         // circle c = new circle();
//         // triangle t = new triangle();
//         // square sq = new square();

//         // s.area();
//         // c.area();
//         // t.area();
//         // sq.area();

//         shapes sq = new square();
//         sq.area();

//     }
// }

// How overriding works:
// Parent obj = new child();
// now which method will be called depends on the class after the new keyword 
// this is called upcasting 

// Dynamic method dispatch : 
// Mechanism by which a call to an overridden method is done during run time 
// that is why it is called run time polymorphism


// Final keyword :
// prevents overriding / inheritance
// declaring a class final, implicitly declares all of the methods final too



// Encapsulation :
// wrapping up the implementation of the data members and methods in a class

// Abstraction :
// Hiding uneccesary details and only sharing valuable information