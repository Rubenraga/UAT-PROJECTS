package Ejercicios_Traductores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author rgonzalez
 */
public class Ejercicio_2_archivo {

    public static void main(String[] args) throws IOException {
        String cadena = ReadFile.File("C:\\Archivo_ejercicio2.txt");
        int space = 0, a = 0, cn = 0, amp = 0;
        if (cadena.replaceAll(" ", "").equals("")) {
            System.out.println("Cadena vacia!!");
        } else {
            char caracteres[] = cadena.toLowerCase().trim().toCharArray();
            for (int i = 0; i < cadena.trim().length(); i++) {
                if (caracteres[i] == 32 && caracteres[i + 1] != 32) {
                    space++;
                }
                if (caracteres[i] == 97) {
                    a++;
                }
                if (caracteres[i] == 241) {
                    cn++;
                }
                if (caracteres[i] == 38) {
                    amp++;
                }
            }
            System.out.println("/////Facultad de Ingenieria Arturo Narro Siller/////");
            System.out.println("Total de Caracteres: " + cadena.replaceAll(" ", "").length());
            System.out.println("Total de palabras: " + (space + 1));
            System.out.println("Total de caracteres a: " + a);
            System.out.println("Total de caracteres ñ: " + cn);
            System.out.println("Total de caracteres &: " + amp);
        }
        
    }
}
