
public class SolutionFinder {
    public static void main(String[] args) {
        double a = 4, b = 8, c = 3;
        double x11 = Math.pow(b,2) - 4*(a*c);
        double x1 = (-b + Math.sqrt(x11)) / (2*a);
        double x2 = (-b - Math.sqrt(x11)) / (2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
