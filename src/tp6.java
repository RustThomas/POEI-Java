import java.sql.SQLOutput;
import java.util.Scanner;

public class tp6 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Entrer un nombre a : ");
        double a = kbInput.nextDouble();

        System.out.print("Entrer un nombre b : ");
        double b = kbInput.nextDouble();

        System.out.print("Entrer un nombre c : ");
        double c = kbInput.nextDouble();

        double delta = Math.pow(b,2) -4*a*c;

        if (delta > 0) {
            double x1 = -b-Math.sqrt(delta)/2*a;
            double x2 = -b+Math.sqrt(delta)/2*a;

            System.out.printf("Les solutions sont x1 = %f et x2 = %f", x1,x2);
        }

        else if (delta==0) {
            double x0 = -b/2*a;
            System.out.printf("La solution est x0 = %f",x0);
        }

        else {
            System.out.print("Pas de solution réelle");
        }

    }
}
