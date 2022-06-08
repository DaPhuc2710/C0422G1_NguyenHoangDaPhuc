package ss2_loop_statement.bai_tap;



import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        char c = '*';
        int choice = -1, i, j;
        Scanner inp = new Scanner(System.in);
        while (choice != 0){
            System.out.println("---------MENU---------");
            System.out.println("1 | Print the rectangle.");
            System.out.println("2 | Print the square triangle.");
            System.out.println("3 | Print isosceles triangle.");
            System.out.println("4 | Exit.");
            System.out.println("Enter Number:");
            choice = inp.nextInt();
            switch (choice){
                case 1:
                    for (i = 1; i <= 5; i++){
                        for (j = 1; j <= 7; j++){
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (i = 1; i <= 5; i++){
                        for (j = 1; j <= 5; j++){
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (i = 1; i <= 5; i++){
                        for (j = 1; j <= i; j++){
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("\n");
                    for (int a = 1; a <= 5; a++){
                        for (int b = 5; b >= a; b--){
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.print("no choice!");
            }
        }
    }
}














