import java.sql.SQLOutput;
import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {

        String nom;
        String prenom;
        Double age;
        Double poids;

        Scanner kbInput = new Scanner(System.in);

        System.out.print("Insérer Nom ");
        nom = kbInput.next();

        System.out.print("Insérer Prénom ");
        prenom = kbInput.next();

        System.out.print("Insérer age ");
        age = kbInput.nextDouble();

        System.out.print("Insérer poids ");
        poids = kbInput.nextDouble();

        System.out.printf("Nom : %s \nPrénom : %s \nAge : %.0f ans \nPoids : %.0f kg", nom,prenom,age,poids);


    }
}
