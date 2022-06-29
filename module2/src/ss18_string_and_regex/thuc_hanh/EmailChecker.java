package ss18_string_and_regex.thuc_hanh;

import java.util.Scanner;

public class EmailChecker {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z]+)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        do {
            System.out.println("Mời nhập Email");
            email = scanner.nextLine();
        } while (!email.matches(EMAIL_REGEX));
        System.out.println("Đúng định dạng");
    }
}
