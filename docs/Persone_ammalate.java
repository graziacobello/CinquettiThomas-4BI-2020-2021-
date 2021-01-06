

import java.util.Scanner;
public class Persone_ammalate {

    
    public static void main(String[] args) {
        
        int infettività, popolazione, cont = 0, ammalati = 1;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("inserisci numero contagiati giornalieri: ");
        infettività = inp.nextInt(); 
        
        System.out.println("inserisci numero popolazione: ");
        popolazione = inp.nextInt();  
        
        while(popolazione/2 >= ammalati ){
           ammalati = ammalati*infettività;
           cont += 1;
        }
        System.out.println("si è ammaltata metà della popolazione in:"+cont + " " +"giorni"); 
    }
    
}
