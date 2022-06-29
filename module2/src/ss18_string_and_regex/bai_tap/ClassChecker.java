package ss18_string_and_regex.bai_tap;

import java.util.Scanner;

public class ClassChecker {
    private static final String NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        do {
            System.out.println("Nhập tên lớp");
            className = scanner.nextLine();

        } while (!className.matches(NAME_REGEX));
        System.out.println("Đúng rồi");
    }
}



