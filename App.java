import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    
    public static void main(String[] args) throws Exception {
        
        /*
        Declarar variables
            //Enteros
            int
            Integer

            //decima
            float
            double
            
            //Cadena
            String

            //boleanos
            True
            False      
            
            //operadores matematicos
             + - / * <> == !=               % <- resto

             &&  || 

             //condiciones 
             int i=1
             if(i>2){
             System.out.println("i es mayor que 2");
             
            }
            if(i<1){
                 System.out.println("i es manor que 1");
             } 
             else {
                // System.out.println("Es igual 1");

             }

        */
            Scanner scan = new Scanner(System.in);
             

            // int año;

            // System.out.println("Ingrese año :");
            // año = scan.nextInt();
            // System.out.println("El año ingresado es :" + año );
            
            // if(año > 2021){
            //     System.out.println("Estas en el futuro, eres un viajero");
            // }
            // else if(año < 2021) {
            //     System.out.println("Estas en el pasado");
            // }
            // else{
            //     System.out.println("Estas en cuaretena, no puedes viajar");
            // }

                //<= =>

            //int i = 0;
            // for (i = 0; i <= 10; i++) {                  
            //     System.out.println(i);                                                              
            // }
            // System.out.println("fuera de for");
            // System.out.println(i);                


            int i=0;
            while (i<10) {
                System.out.println("Vuelva ingresar un numero");
                i = scan.nextInt();                
            } 
            System.out.println("Ok");



















        // Scanner scanner = new Scanner(System.in);
        // DecimalFormat decimal = new DecimalFormat("0.00");
        // int n1, n2 , n3; 
        // double p;

        // n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1"));
        // n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2"));
        
        // if(n1 > n2) {
        //     JOptionPane.showMessageDialog(null,"El mayor es :" +n1);
        // }else{
        //     JOptionPane.showMessageDialog(null,"El mayor es :" +n2);
        // }

        //n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 3"));
        //p= (double) (n1+n2+n3)/3;


        //JOptionPane.showMessageDialog(null,"El primerio es :" + decimal.format(p) +'\n' );
        // System.out.println("Ingrese Nota 1 : ");
        // n1 = scanner.nextInt();
        // System.out.println("Ingrese Nota 2 : ");
        // n2 = scanner.nextInt();
        // System.out.println("Ingrese Nota 3 : ");
        // n3 = scanner.nextInt();

        // p = (n1+ n2 + n3) / 3;
        // System.out.println("El promedio es : "+p);
        
    }
}
