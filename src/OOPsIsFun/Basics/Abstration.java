package OOPsIsFun.Basics;

public class Abstration {
    public static void main(String[] args) {
      Audi a1=new Audi();
      a1.start();

      BMW b1=new BMW();
      b1.start();
    }
}

class Audi extends car{
    void start() {
        System.out.println("Audi starting");
    }
}
class BMW extends car{
   void start(){
       System.out.println("BMW starting");
   }
}

abstract class car{
    // String brand;
    int price;
    abstract void start();
   }



// abstruct not creating the objects


//abstruct function banaya hai toh uski class ko bhi abstruct karna jaruri hai
//2. abstruct class ka koi bhi children nahi bana sakte

