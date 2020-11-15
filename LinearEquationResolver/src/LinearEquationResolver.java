import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();
        if (a != 0) {
            double sosulation = (c - b) / a;
            System.out.print("Equation pass with x = " + sosulation);

        } else if (b == 0) {
            System.out.println("The sosulation is all x!");
        } else {
            System.out.println("No sosulation");
        }
    }
}
