package ss18_string_and_regex.bai_tap;

import java.util.Scanner;

public class TelephoneChecker {
    private static final String TELE_NUM = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập sđt");
        do {
            String phone = scanner.nextLine();
            if (check(phone)) {
                System.out.println("Đúng rồi");
                break;
            }
            System.out.println("Mời nhập lại");
        } while (true);
    }


    public static Boolean check(String num) {
        return num.matches(TELE_NUM);
    }
}
