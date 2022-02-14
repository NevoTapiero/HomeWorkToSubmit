import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("give me your identification number pls (Q1) ");
        number = s.nextInt();
        int finalnumber = numbers(number);
        int finalfinalnumber = numbers(finalnumber);
        System.out.println(finalfinalnumber);
        idprinter();
    }
    public static int numbers(int number){
        int num1, num2 = 0, num3 = number;
        num1 = num3%10;
        for (int i = number; i > 10; i = i / 10){
            num2 = num3/10;
            num3 = num3/10;
        }
        int num4 = (num2 + num1)%10;
        number = (number * 10) + num4;
        return number;
    }
    public static void idprinter(){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i <= 10; i++){
            System.out.println("give me your identification number pls (Q2)");
            int idnumber = s.nextInt();
            int finalnumber = numbers(idnumber);
            int finalfinalnumber = numbers(finalnumber);
            System.out.println(finalfinalnumber);
        }
    }
}
