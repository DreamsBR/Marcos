package semana02;

import java.io.BufferedReader;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Metodos7 {
    public static void main(String[] args) {
        

        int radio;
        double area;
        double res ; 
        
        DecimalFormat df = new DecimalFormat("0.0");

        radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1 "));        
        res = Area(radio);

        JOptionPane.showMessageDialog(null,"El numero mayo es " + df.format(res));
    }

    static double Area(int a) {
        return  Math.PI * (a * a);
    
    }
}