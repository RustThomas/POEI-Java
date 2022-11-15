import java.util.Scanner;

public class tp7 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Entrer un entier entre 1 et 12 : ");
        int mois = kbInput.nextInt();

        System.out.printf("Mois : %d \nRésultat : ",mois);

        switch(mois) {
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Fevrier");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("Juillet");
                break;
            case 8:
                System.out.println("Août");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Décembre");
                break;

            default:System.out.println("Pas un entier entre 1 et 12!");
        }
    }
}
