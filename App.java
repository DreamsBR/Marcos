import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        int n1, n2 , n3; 
        double p;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2"));
        
        if(n1 > n2) {
            JOptionPane.showMessageDialog(null,"El mayor es :" +n1);
        }else{
            JOptionPane.showMessageDialog(null,"El mayor es :" +n2);
        }

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
