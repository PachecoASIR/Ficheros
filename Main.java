import java.util.*;


public class Main {
    public static void main(String[] args) {
        try (Scanner guardar = new Scanner(System.in)) {
            int eleccion = 0;

            do {
                System.out.println("\n"+"Que ejercicio desea realizar?"+"\n"+"1. Ejercicio 1"+"\n"+"2. Ejercicio 2"+"\n"+"3. Ejercicio 3"+"\n3. Salir");
                eleccion = guardar.nextInt();
                guardar.nextLine();

                switch (eleccion) {

                    case 1:
                        System.out.println("Ejercicio 1"+"\n");
                        System.out.println("Introduzca un texto para el ejercicio 1");
                        String texto1 = guardar.nextLine();
                        String ruta1 = "src\\Ejercicio1.txt";

                        Ejercicio1 ejercicio1 = new Ejercicio1();
                        ejercicio1.escribir(texto1, ruta1);

                        break;

                    case 2:
                        System.out.println("\n"+"Ejercicio 2"+"\n");
                        Ejercicio2 ejercicio2 = new Ejercicio2();

                        ejercicio2.leer("src\\Ejercicio1.txt");
                        System.out.println("\n");

                        break;
                }
            } 
            while (eleccion!=3);
        }
    }
}