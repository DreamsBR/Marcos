import javax.swing.JOptionPane;

public class EjercicioCuatro {

    public static void main(String[] args)throws Exception {

        double  area , radio ;
        

        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Radio De ciruclo"));


        //pi * area 

        area =  Math.PI * Math.pow(radio,2);

        JOptionPane.showMessageDialog(null ,"El area del ciruclo es :" +area );


    }
}
