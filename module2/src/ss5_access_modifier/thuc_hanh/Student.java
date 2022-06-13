package ss5_access_modifier.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT"; // static dùng dể chia sẻ các phần tử của 1 class

    Student(int r,String n){
        //constructor to initialize the variable (hàm để khởi tạo biến)
        rollno=r;
        name=n;
    }
    //static method to change the value of static variable(phương thức để dổi giá trị của biến static)
    static void change(){
        college="CodeGym";
    }
    //method to display value
    void display(){
        System.out.println(rollno+""+name+""+college);
    }

}
