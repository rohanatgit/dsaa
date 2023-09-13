package OOPsIsFun.Basics.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
     Laptop l1=new Laptop();
     l1.setPrice(31);
    }

}
class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){

        //is the user admin
        boolean isAdmin=false;
        if(!isAdmin){
            System.out.println("You can't set the price .");
        }

        this.price=price;
    }
}
