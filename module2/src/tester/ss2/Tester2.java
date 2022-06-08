package tester.ss2;

public class Tester2 {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(c + "\t");// nhớ là chú ý cái ln
            }
            System.out.println();// println thì in ra sẽ xuống dòng cho mình == print("\n")
        } System.out.println();

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(c+"\t");
            }
            System.out.println();
        }




        System.out.println();


        for(int i=5;i>=1;i--){
            for (int j = 1; j <=i ; j++) {
                System.out.print(c+"\t");
            }
            System.out.println();
        }


        
        
        
        
        
    }
}
