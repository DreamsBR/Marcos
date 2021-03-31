package semana02;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        
        int mes = 13 ;
        int año =2021, numdias = 30;
        
        if(mes>12){
            System.out.println("Este mes no existe"); 
            return;
        }                               
        switch (mes) {
            case 1:                            
            case 3:                            
            case 5:                            
            case 7:                
            case 8:            
            case 10:            
            case 12:
                numdias = 31;
            break;  
            case 4:  
            case 6:  
            case 9:           
            case 11:           
                numdias = 30;   
            break;
            case 2: 
                if((año%4==0)&& !(año % 100 == 0) || (año%400==0))
                    numdias = 29;
                else 
                    numdias = 28;
                break;
            default:            
            break;
        }
        System.out.println("El mes "+mes+" del año "+año+" tiene "+numdias+" dias");

    }
}
