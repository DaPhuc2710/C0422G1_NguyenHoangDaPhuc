package ss5_access_modifier.CRUD;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Jackson", "DN", true, "JS@2312");
        students[1] = new Student(2, "Lodon", "QN", true, "LDtv567");
        students[2] = new Student(3, "Mud", "QD", true, "M@555");
    }

    //CRUD
    public void display() { // mình trình diễn nó ra
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }

        }
    }

    public void add() {
        System.out.println("Enter your ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        System.out.println("Enter your gender");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        Student student = new Student(id, name, address, gender, email);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rollno need to Delelte");
        int rollCheck = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            if (rollCheck == students[i].getId()) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        System.out.println("Press 1 to display");
        System.out.println("Press 2 to add");
        System.out.println("Press 3 to delete");
        System.out.println("Press 4 to exit");
        int n = Integer.parseInt(scanner.nextLine());
        do {
            switch (n) {
                case 1:
                    studentManager.display();
                    break;
                case 2:
                    studentManager.add();
                    break;
                case 3:
                    studentManager.delete();
                    break;
                case 4:
                default:
                    break;
            }
        } while (n < 5);
    }
}
