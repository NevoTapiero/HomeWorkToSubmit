import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int num = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("give me any number pls");
        num = s.nextInt();
        shape(num);
    }
    static public void shape(int num){
        int num1 = num, num2 = num;
        for(int i = num; i > 0; i--) {
            for (int t = num1 - 1; t < num; t++) {
                System.out.printf("*");
            }
            for (int r = 0; r < num2 - 1; r++) {
                System.out.printf("#");
            }
            System.out.println("");
            num++;
            num2--;
        }
    }
}
