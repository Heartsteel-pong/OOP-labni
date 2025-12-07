import java.util.Scanner;

public class asdfsdf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Price : ");
        double paid = sc.nextDouble();
        int stamp = (int) (paid / 50);
        System.out.println("You got "+stamp+" stamp");
    
    }
}
