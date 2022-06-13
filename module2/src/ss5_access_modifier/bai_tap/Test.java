package ss5_access_modifier.bai_tap;

public class Test {
    public static void main(String[] args) {
        Student student= new Student();
        student.setName("Ben");
        student.setClasses( "CR2");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
