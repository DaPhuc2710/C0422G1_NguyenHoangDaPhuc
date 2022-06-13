package ss5_access_modifier.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // gọi phương thức change
        // tạo obj
        Student s1=new Student(111,"Nam");
        Student s2=new Student(222,"Hoàng");
        Student s3=new Student(333,"Việt");
        // Gọi hàm display
        s1.display();
        s2.display();
        s3.display();
    }
}
