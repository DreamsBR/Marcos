package semana02;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1,n2,opcion;
        double r;
        
        System.out.println(" 1)Suma \n 2)Resta \n 3)Multiplicación \n 4)Division \n ");
        System.out.println("Seleccione operacion");
        opcion = scanner.nextInt();
        
        
        
        if(opcion>4){
            System.out.println("Opcion incorrecta"); 
            return;
        }   
        
        System.out.println("Ingrese numero 1");
        n1 = scanner.nextInt();

        System.out.println("*************");
        
        System.out.println("Ingrese numero 2");
        n2 = scanner.nextInt();
    
        switch (opcion) {
        
            case 1:
                r= n1 + n2;
                System.out.println("La suma es : "+ r);
                break;
            case 2:
                r= n1 - n2;
                System.out.println("La resta es :"+ r);
                break;
            case 3:
                
                r= n1 * n2;
                System.out.println("La multi es :"+ r);
                break;
            case 4:
                r= (double) (n1 / n2);
                System.out.println("La division es :"+ r);
                break;
        
            default:
                break;
        }


    }
}