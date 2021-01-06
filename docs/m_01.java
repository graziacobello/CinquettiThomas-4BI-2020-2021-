import java.util.Scanner;

public class m_01 {
    
public static void main(String[] args) {

    int num,num1,i = 2;
    
    Scanner inp = new Scanner(System.in);
    System.out.println("inserisci numero:");
    num = inp.nextInt();
    System.out.println("inserisci numero:");
    num1 = inp.nextInt();
    
    while(i % num == 0 && i % num1 == 0){
        i++;
    }
    System.out.println(i);
}
    
}
