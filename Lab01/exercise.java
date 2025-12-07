import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exercise time 1: ");
        int time1 = input.nextInt();
        System.out.print("Enter your exercise time 2: ");
        int time2 = input.nextInt();
        int total_time = time1+time2;
        int hr = total_time / 3600;
        int min = (total_time % 3600) / 60;
        int sec = total_time % 60;
        System.out.print("It is "+hr+" hours "+min+" minutes and "+sec+" seconds.");
        
    }
}
