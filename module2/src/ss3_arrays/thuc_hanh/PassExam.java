package ss3_arrays.thuc_hanh;
import java.util.Arrays;
import java.util.Scanner;
public class PassExam {
    public static void main(String[] args) {
        int size, count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            int i, j;
            System.out.println("Enter a size:");
            size = scanner.nextInt();

            if (size <= 30 && size > 0) {
                double[] array = new double[size];
                for (i = 0; i < array.length; i++) {
                    System.out.println("Enter the point of student \t" + (i + 1));
                    array[i] = scanner.nextDouble();
                }
                System.out.println("point of \t" + size + "\t students" + Arrays.toString(array));
                for (j = 0; j < array.length; j++) {
                    if (array[j] > 5 && array[j] <= 10) {
                        count++;
                    }
                }
                System.out.println(" The number of students has passed the exam are : \t" + count);
            }
        } while (size > 30);
    }
}
