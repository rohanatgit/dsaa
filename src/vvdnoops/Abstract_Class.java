package vvdnoops;

import javax.net.ssl.SNIMatcher;

abstract class Abstract_Class {
    abstract void sound();
}
class Dogd extends Abstract_Class{
    void sound(){
        System.out.println("Woof");
    }
}
class Cat extends Abstract_Class{
    void sound(){
        System.out.println("Meow");
    }
}
class Main{
    public static void main(String[] args) {
        Abstract_Class dog=new Dogd();
        dog.sound();
        Abstract_Class cat=new Cat();
        cat.sound();
    }
}
