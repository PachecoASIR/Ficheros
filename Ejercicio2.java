import java.io.*;

public class Ejercicio2 {

    public Ejercicio2() {

    }

    public StringBuffer leer(String ruta) {
        StringBuffer cadena = null;
        cadena = new StringBuffer();
        FileReader lectura;
        try {
            lectura = new FileReader("Ejercicio1.txt");
            int caracter = lectura.read();
            while (caracter != -1) {
                char imprimir = (char) caracter;
                System.out.print (imprimir);
                caracter = lectura.read();
            }
            lectura.close();

        } catch (IOException e) {
            System.out.println("FATAL ERROR");
            e.printStackTrace();
            cadena.setLength(0);
            cadena.append(e).toString();
        }
        return cadena;
    }
}