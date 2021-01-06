import java.util.Scanner;

public class LavandinoOtturato_01 {
    
public static void main(String[] args) {
    
int x, y, cap_lavandino, lvl_ini, sec = 0;    
    
Scanner inp = new Scanner(System.in);

 System.out.println("capacità di scarico:");
 x = inp.nextInt();
 System.out.println("perdità lavandino:");
 y = inp.nextInt();
 System.out.println("livello iniziale dell' acqua:");
 lvl_ini = inp.nextInt();
 System.out.println("capacità del lavandino:");
 cap_lavandino = inp.nextInt();
 
 for(int i = 0;i<20;i++){
     
     if(lvl_ini > 0){
         
        lvl_ini -= x;
        System.out.println(lvl_ini);
     
     if(lvl_ini >= cap_lavandino){
        System.out.println("lavandino ha strabordato");
        i += 20;
     }
     
     if (lvl_ini <= 0){
        System.out.println("lavandino vuoto");
        i += 20;
     }

     if (i % 3 == 0){
        lvl_ini += y;
        System.out.println(lvl_ini);
                    }
                }
            }
        }
    }


