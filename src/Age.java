import java.sql.SQLOutput;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Quel est votre age ");
        int age = kbInput.nextInt();

        int annee = 2022 - age ;
        System.out.printf("Votre année de naissance est : %d",annee);
    }
}
