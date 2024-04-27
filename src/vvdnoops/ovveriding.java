package vvdnoops;

public class ovveriding {
    void rum(){
        System.out.println("runing");
    }

}
class dog extends ovveriding{
    void rum(){
        System.out.println("runningdddd");
    }

    public static void main(String[] args) {
        ovveriding b=new ovveriding();
        b.rum();
    }
}
