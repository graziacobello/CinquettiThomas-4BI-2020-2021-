
import java.util.Scanner;

public class asta_01 {

    public static void main(String[] args) {

        int compratore_1, compratore_2, partenza = 0, vincita = 0;

        Scanner inp = new Scanner(System.in);
           
        while(vincita == 0){
             
            
            System.out.println("inserisci offerta compratore_1: ");
            compratore_1 = inp.nextInt();
            if(compratore_1 > partenza){
            partenza = compratore_1;
            }
            
            System.out.println("inserisci offerta compratore_2: ");
            compratore_2 = inp.nextInt();
            if(compratore_2 > partenza){
                partenza = compratore_2;
            }
            
            if(compratore_1 == 0){
                vincita = 1;
                System.out.println("ha vinto il compratore_2");
            }if(compratore_2 == 0){
                vincita = 1;
                System.out.println("ha vinto il compratore_1");
            }
            
        }
       
    }
}
