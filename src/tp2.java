import java.sql.SQLOutput;
import java.util.Scanner;

public class tp2 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Veuillez entrer votre nom ");
        String nom = kbInput.next();

        System.out.print("Veuillez entrer votre prénom ");
        String prenom = kbInput.next();

        System.out.print("Veuillez entrer votre âge ");
        int age = kbInput.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.", nom,prenom,age);


    }
}
