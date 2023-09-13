package OOPsIsFun.Basics;

public class MainClass {
    public static void main(String[] args) {
            Person p1=new Person();
            p1.name=":Rohan Varshney";
            p1.age=23;

            Person p2=new Person();
            p2.age=34;
            p2.name=":shivanand jha";
            System.out.println(p2.age+" "+p2.name);
            System.out.println(p1.age+" "+p1.name);
            p1.eat();
            p2.walk();
            p1.walk(5);
        System.out.println(Person.count);




        child ch=new child();
        ch.papa();

        Person p3=new Person(34,"Prabal Kumar Sharma");

    }
}


class Person{
    String name;
    int age;
    static int count;

    Person(){
        count++;
        System.out.println("Person construtor is creating.");
    }

     public Person(int age,String name){
         this.name=name;
         this.age=age;

    }
//
//    Person(int data){
//        System.out.println(this.name+" "+data);
//    }


    void walk(){
        System.out.println(name+" is walking");
    }

    void eat(){
        System.out.println(name+" is eating");
    }


    void walk(int steps){
        System.out.println(name+" walked "+steps +".steps");
    }


}


/*
*
*
*
* polymorphism = multiple forms
* we have write two functions walk()
*
*
* constructor work is creating a new objects .
*
*
* default construcot are not take argument.
*
*
* static keyword is bascically use to not creating the objects static keyword access any class without creating the objects.
*
*
*
*
* This = this ki help se aap apni class k dusre constructor ko call kara sakte hai.
* 2.this keyword is basically use corrent instance of a class.

  */


class Parent{
    void papa(){
        System.out.println(":child says papa");
    }
}

class child extends Parent{
    void bacha(){
        System.out.println("papa says bacha");
    }
}


// super keyword is basically use to call the parent class constructor.





//Encapsulation = data binding or security reason