
import java.util.Scanner;

public class panino_pastina_01 {

    public static void main(String[] args) {

        double soldi, spesa_g = 0;
        int cibo = 0, cont = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("inserisci quanti soldi ha Mario: ");
        soldi = inp.nextFloat();

        do {
            Scanner sus = new Scanner(System.in);
            System.out.println("cosa mangia Mario:");
            System.out.println("1 pastina, 2 panino");
            cibo = sus.nextInt();
            cont += 1;
            switch (cibo) {
                case 1:
                    spesa_g = 1.0;
                    break;
                case 2:
                    spesa_g = 1.5;
                    break;
                default:
                    System.out.println("non esiste");
                    spesa_g = 0;

            }
            soldi -= spesa_g;
        } while (soldi > 0);

        System.out.println("ha magiato per:" + cont + " " + "giorni");
    }
}
