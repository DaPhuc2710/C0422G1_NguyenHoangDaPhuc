package ss2_loop_statement.bai_tap;

public class Integer100 {
    public static void main(String[] args) {
        int num = 2;
        int count;
        while (num < 100) {
            count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {  // kiểm tra xem có phải là số nguyên tố hay k
                    count++;// nếu có nhiều lần đếm count thì đó k phải là số nguyên tố
                }
            }if (count == 2) { // nghĩa là có 2 ước đó là chính nó và số 1
                System.out.println(num); // => in ra số nguyên tố
            }
            num++;
        }
    }
}
