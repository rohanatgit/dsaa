package vvdnoops;

public class Polymorphism {

    // Polymorphism is means Poly mean many And phormism means forms .
    // polymorphism in java is a concept by which we can perform a single action in different ways .

    // we can achieve polymorphism in java by method overloading and overriding .
    //polymorphism are two types compiler type poly and run time poly.
    // Method overloading is a same name , same class but different arguments.
    //Method overriding is a same name , different class and same argument

    void show (){
        System.out.println("vvdn is the best company ");
    }
    void show (String name){
        System.out.println(name+"is the best company");
    }

    public static void main(String[] args) {
        Polymorphism poly=new Polymorphism();
        poly.show();
        poly.show("psi");
    }
}
