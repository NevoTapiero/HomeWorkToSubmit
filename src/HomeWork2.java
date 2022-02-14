import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the hour");
        int h = s.nextInt();
        System.out.println("what is the minuets");
        int m = s.nextInt();
        int finalm = Time(h, m);
        System.out.println("all the time in minutes is " + finalm);


        System.out.println("give me the time by hour alone and minutes alone");
        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int timedif = Timedifference(h, m, h1, m1);
        System.out.println("the time difference is " + timedif + " minutes");

        int day = Workhours();
        System.out.println("the day with the highest number of working hours is " + day);
    }
    public static int Time(int h, int m){
        int htom, finalm;
        htom = h*60;
        finalm = htom + m;
        return finalm;
    }
    public static int Timedifference(int h, int m, int h1, int m1){
        int htom, h1tom, timedif;
        htom = h * 60;
        h1tom = h1 * 60;
        timedif = (htom + m) - (h1tom + m1);
        timedif = Math.abs(timedif);
        return timedif;
    }
    public static int Workhours(){
        Scanner s = new Scanner(System.in);
        int h, m, h1, m1, longesttime = 0, day = 0, longestday = 0, finaltime = 0, n = 1;
        for(int i = 0; i < 7; i++){
            System.out.println("when Ploni started to work today, hour alone and minuets alone");
            h = s.nextInt();
            m = s.nextInt();
            System.out.println("when Ploni finished to work today, hour alone and minuets alone");
            h1 = s.nextInt();
            m1 = s.nextInt();
            finaltime = Timedifference(h, m ,h1 ,m1);
            if(n > 0){
                longesttime = finaltime;
                n = 0;
            }
            day++;
            if (finaltime > longesttime) {
                longesttime = finaltime;
                longestday = day;
            }

        }
        return longestday;
    }
}
