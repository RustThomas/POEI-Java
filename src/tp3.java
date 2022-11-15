import java.util.Scanner;

public class tp3 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        System.out.print("Entrez la première valeur ");
        double a = kbInput.nextDouble();

        System.out.print("Entrez la deuxième valeur ");
        double b = kbInput.nextDouble();

        System.out.print("Entrez la troisième valeur ");
        double c = kbInput.nextDouble();

        System.out.printf("Les valeurs entrées sont a=%f, b=%f, c=%f \n",a,b,c);
        System.out.printf("Les valeurs permutées sont a=%f, b=%f, c=%f",c,a,b);



    }
}
