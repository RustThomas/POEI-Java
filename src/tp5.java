import java.util.Scanner;

public class tp5 {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Entrer un nombre entier : ");
        int nombre = kbInput.nextInt();

        String parite;
        String signe;

        if (nombre <0) {
            signe="négatif";

        }
        else if (nombre>0) {
            signe="positif";
        }
        else {
            signe = "zéro";
        }

        if (nombre%2==0) {
            parite = "pair";
        }

        else {
            parite = "impair";
        }

        System.out.printf("Le nombre est %s et %s \n",signe,parite);
    }
}
