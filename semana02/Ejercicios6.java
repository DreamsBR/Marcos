package semana02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Ejercicios6 {
    public static void main(String[] args) throws IOException {
        
        //Capturar una cadena de carateres 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String nombre; 

        System.out.println("Introduzca una cadena por el teclado");
        System.out.flush();
        nombre = read.readLine();
        System.out.println("Hola :" + nombre);




    }    
}