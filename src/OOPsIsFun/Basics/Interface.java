package OOPsIsFun.Basics;

public class Interface implements Car {
    public static void main(String[] args) {

    }
    public void start(){
        System.out.println("my car is starting ");
    }
}
interface Car {
    void start();
}


//interface ke andar bydefault abstruct mehord ban jate hai
// for ex : abstruct void start();

//abstruct class ke andar hmm other function bhi bana sakte hai but interface ke andar only abstruct mehord hi banayege .



// java multiple class provide nahi karta hai

//ex:ek class ke multiple parents nahi ho sakte hai