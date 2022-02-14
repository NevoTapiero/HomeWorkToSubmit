import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give me any char that you want");
        char shape = s.next().charAt(0);
        System.out.println("give me any odd number that you want");
        int k = s.nextInt();
        charmaker(k, shape);
    }
    public static void charmaker(int k, char shape){
        int loops = 1;
        for(int r = 0; r < k; r++) {
            for (int i = 0; i < k; i++)
                System.out.printf(" ");
            for (int t = 0; t < loops; t++)
                System.out.printf(String.valueOf(shape));
            k = k - 1;
            loops = loops + 2;

            System.out.println("");
        }
    }
}
