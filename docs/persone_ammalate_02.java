


import java.util.Scanner;
public class persone_ammalate_02 {
    
    
 public static void main(String[] args) {
     
    int contagiati, percent , cont = 0, guariti = 1;
      
     
    Scanner inp = new Scanner(System.in);
    System.out.println("inserisci numero contagiati: ");
    contagiati = inp.nextInt();
    System.out.println("inserisci percentuale guariti giornalmente: ");
    percent = inp.nextInt();
 
    while (contagiati > 100){
           
        contagiati -= (int)(contagiati * percent / 100.0 );
        cont += 1;
        
    }
     System.out.println("sono rimaste solo 100 persone infette in: "+ cont+ " "+ "giorni");
 }    
    
}
