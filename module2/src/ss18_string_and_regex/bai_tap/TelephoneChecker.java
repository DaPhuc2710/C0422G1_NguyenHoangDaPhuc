package ss18_string_and_regex.bai_tap;

import java.util.Scanner;

public class TelephoneChecker {
    private static final String TELE_NUM = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        do {
            System.out.println("Mời nhập sđt");
            num = scanner.nextLine();
        } while (!num.matches(TELE_NUM));
        System.out.println("Đúng rồi");
    }

}
