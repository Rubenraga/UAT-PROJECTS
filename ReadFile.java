package Ejercicios_Traductores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Raga
 */
public class ReadFile {

    public static String File(String archivo) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        String linea = "",cadena = "";;
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                cadena+=linea+" ";
            }
        } catch (Exception e) {
        } finally {
            if (fr != null) {
                fr.close();
            }
        }
        return cadena;
    }
}
