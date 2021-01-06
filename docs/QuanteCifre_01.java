import java.util.Scanner;

public class QuanteCifre_01 {
    
public static void main(String[] args) {
    
    Scanner inp = new Scanner(System.in);
    int num, i = 1;
    
    System.out.println("inserisci numero:");
    num = inp.nextInt();
    
    while(num/10>0){
        num = num/10;
        i++;
    }
    System.out.println("è composto da:"+i+"cifre");
    }
}
