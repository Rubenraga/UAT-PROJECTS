package Ejercicios_Traductores;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rgonzalez
 */
public class Concatenar {

    public static String concat(String texto) throws IOException {
        try (Scanner leer = new Scanner(System.in)) {
            while (leer.hasNextLine()) {
                Scanner Leer = new Scanner(leer.nextLine());
                if (!Leer.hasNextLine()) {
                    break;
                // Romper al final de linea                       
                }
                while (Leer.hasNextLine()) {  
                // Introducir operacion
                    texto += Leer.nextLine();
                }
            }
            //System.out.println("Cadena: " + texto);
            return texto;
        }
    }
}
