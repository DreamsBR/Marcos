package semana02;

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num, i = 0; 

        System.out.println("Ingrese Numero a multiplicar");
        num = scan.nextInt();

        for (i = 0; i <=12; i++){
            
            System.out.println(num+ "*" +i+ "=" + i * num);
        }




    }
}