package semana02;

import javax.swing.JOptionPane;

public class Ejericio02 {
    
    public static void main(String[] args) {
        String calcu="";
        int i=0 ;
        int numero ;
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        do{            
            calcu = calcu + numero + "x" + i + "="+ numero * i +"\n"; 
            i++;
            
        }
        while ( i <= 12);                    
        JOptionPane.showMessageDialog(null,calcu);
        
    }
}
