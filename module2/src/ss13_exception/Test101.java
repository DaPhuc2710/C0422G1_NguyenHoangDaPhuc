package ss13_exception;

import java.util.ArrayList;

public class Test101 {


    //    public static void main(String[] args) {
//        ArrayList<String> lis = new ArrayList<>();
//        lis.add("My");
//        lis.add("Name"); // index lúc này là 0,1
//        System.out.println(lis.get(2)); // mình lấy index tại 2 nên k có chương trình báo lỗi
//    }

//}
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        for (int num : arr) {
//            System.out.println(num);
//        }
//    }
//}
//    public static void main(String[] args) {
//        int ar[] = {1, 2, 3, 4, 5};
//        try {
//            for (int i = 0; i <= ar.length; i++)
//                System.out.print(ar[i] + " ");
//        } catch (Exception e) {
//            System.out.println("\nException caught");
//        }
//    }
//}
public static void main(String[] args) {
    try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
    } catch (Exception e) {
        System.out.println("Something went wrong.");
    } finally {
        System.out.println("The 'try catch' is finished.");
    }
}
}
