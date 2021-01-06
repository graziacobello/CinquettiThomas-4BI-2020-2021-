import java.util.Scanner;
public class NumeroPrimo_01 {

public static void main(String[] args) {
    
    int num;    
    boolean primo = false;
    Scanner inp = new Scanner(System.in);

    System.out.println("inserisci numero:");
    num = inp.nextInt();
    
    
    for(int i = 2;i<num-1; i++){
        
        if(num % i ==0){
            primo = false;
            i = num;
            }else{
                primo = true;
            }
        }
    if(primo == false){
        System.out.println("non primo");
    }else{
        System.out.println("primo");
    }
    }
}