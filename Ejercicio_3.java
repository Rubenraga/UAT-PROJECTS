/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package example;
import java.util.Scanner;
/**
 *
 * @author Raga
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  read = new Scanner (System.in);
        int max=0,min=10000,val=0,i=0;
        double valores=0,prom=0,desv=0,var=0;
        boolean resp=true;
        System.out.println("Introduzca valores:");
       while(resp==true) {
            i++;
            val = read.nextInt();
            if (val > max)
                max=val;
            if (val < min)
                min = val;
            valores+=val;
            prom=(valores/i);
            var +=(((val-prom)*(val-prom))/i);
            System.out.println("Otro numero (SI/NO)");
            if (read.next().equalsIgnoreCase("si")) 
                resp=true;
            else
                resp=false;            
       }
      /*  for (int j = 0; j < 5; j++) {
            
        }*/
        System.out.println("Mayor "+max);
        System.out.println("Menor "+min);        
        System.out.println("Media "+prom);
        System.out.println("Varianza "+var);
        
    }
}
