package ss18_string_and_regex.thuc_hanh;

import java.util.Scanner;

public class AccountChecker {
    private static final String ACCOUNT_REGEX = "^[\\_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Vui Lòng Nhập Tên Tài Khoản");
            name = scanner.nextLine();
        } while (!name.matches(ACCOUNT_REGEX));
        System.out.println("Đúng dùi");
    }
}
