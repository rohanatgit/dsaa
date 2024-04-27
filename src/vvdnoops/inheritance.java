package vvdnoops;

public class inheritance {
    // child class assess all the properties of parent class by using extends keyword .
    void eat (){
        System.out.println("eating");
    }

}
class Dog extends inheritance{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}


// types of inheritance in java
// Single
//Multilevel
// Heirarical
