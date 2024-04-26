package oops;

class pan{
    String color;
    String type;//ballpoint, gel

    public void write(){
        System.out.println("writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class one {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="aman";
        s1.age=23;

        s1.printInfo();

    }
}
