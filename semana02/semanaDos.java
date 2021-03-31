package semana02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class semanaDos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                
        String calcu="";
        int i=0 ;
        int numero ;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));

        while ( i <= 12){
            System.out.print("Ingresa un número: ");
            
            calcu = calcu + numero + "x" + i + "="+ numero * i +"\n"; 
            i++;
            
        }
        JOptionPane.showMessageDialog(null,calcu);
        
        
            
            
        
        
    }
    
}