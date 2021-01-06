import java.util.Scanner;
public class serieNumeri_01 {
    
    
    
    
public static void main(String[] args) {
   
int num = 0,num_p = 0,cont = 0;
    
Scanner inp = new Scanner(System.in);

while(num >= num_p ){
System.out.println("inserisci numero: ");
num_p = num;
num = inp.nextInt();
cont += 1;
}

    System.out.println("numeri inseriti:"+ (cont-1));

}
}
