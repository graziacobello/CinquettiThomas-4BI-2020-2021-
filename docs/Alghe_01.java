
import java.util.Scanner;

public class Alghe_01 {
public static void main(String[] args) {
    
    int popolo_ini, popolo_end, cont = 0;
    
    Scanner inp = new Scanner(System.in);
    System.out.println("popolazione iniziale:");
    popolo_ini = inp.nextInt();
    
    System.out.println("popolazione da raggiungere:");
    popolo_end = inp.nextInt();
    
    do{
        if (cont % 2 == 0){
            popolo_ini = popolo_ini * 2;
            cont += 1;           
        }else{
            popolo_ini = popolo_ini - ((popolo_ini *30 )/100);
            cont += 1;
            }
      
    }while(popolo_ini <= popolo_end);
    
        System.out.println("hanno raggiunto la popolazionie in"+" "+cont+" "+"anni");
    }
}
