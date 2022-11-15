import java.util.Scanner;

public class exo2 {
    //Point 2
    public static void main(String[] args) {
        Scanner keyboardInput =new Scanner(System.in);
        System.out.print("Entrer la longueur : ");
        double longeur = keyboardInput.nextDouble();

        System.out.print("Entrer la largeur : ");
        double largeur = keyboardInput.nextDouble();

        double Surface = longeur * largeur;
        double Perimetre = 2 * (longeur + largeur);

        System.out.printf("longeur : %.1f m \nlargeur : %.1f m \n" +
                        "Surface : %.1f m2 \nPerimetre : %.1f m", longeur
                , largeur, Surface, Perimetre);
    }
}
