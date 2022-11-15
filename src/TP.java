import java.sql.SQLOutput;
import java.util.Scanner;

public class TP {
    public static void main(String[] args) {
        //TP1
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Saisissez un diamètre ");
        double diametre = kbInput.nextDouble() ;

        double rayon = diametre/2;
        double surface = Math.pow(rayon,2)*Math.PI;

        System.out.printf("Surface = %f",surface);



    }
}
