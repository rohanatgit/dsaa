package vvdnoops;

public class construcor {
 String Emp_name;
 int Emp_id;
//
//    public static void main(String[] args) {
//        construcor ss=new construcor();
//        ss.Emp_id=23;
//        ss.Emp_name="Rohan";
//        construcor ss2=new construcor();
//        ss2.Emp_id=34;
//        ss2.Emp_name="don";
//        // This is code resubality
//    }
    construcor(String name, int Emp_id){
        this.Emp_name=name;
        this.Emp_id=Emp_id;
    }

    public static void main(String[] args) {
        construcor ss=new construcor("rohan", 3);

    }

}

