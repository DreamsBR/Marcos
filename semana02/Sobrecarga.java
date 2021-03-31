package semana02;

public class Sobrecarga {
    public static void main(String[] args) {
        
            int num1 = 25, num2 = 200;
            double nu1 = 125.45, nu2 = 34.25;
            
            System.out.println("Suma de enteros = " + adicion(num1, num2)); 
            System.out.println("Suma de reales = " + adicion(nu1, nu2));
            }
            static int adicion( int x, int y) { 
                return x + y;
            }
            static double adicion( double z, double w) { 
                return z + w;
            }
             // fin clase sobrecarga
}
        