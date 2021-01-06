
import java.util.Scanner;




public class SerieNumerica_01 {
    
public static void main(String[] args) {
   
int num = 0,num_p =0;
    
Scanner inp = new Scanner(System.in);
do{
System.out.println("inserisci numero: ");
num_p = num;
num = inp.nextInt();

}while(num != num_p );

    } 
}
