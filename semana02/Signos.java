package semana02;

import java.util.Scanner;

public class Signos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int diax, mesx;

        System.out.println("Ingrese Dia");
        diax = scan.nextInt();
        
        System.out.println("Ingrese Mes");
        mesx = scan.nextInt();


        signo(diax, mesx);

        


    }
    static void signo(int dia, int mes) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia > 21) {
                    signo = "ACUARIO";
                } else {
                    signo = "CAPRICORNIO";
                }
                break;
            case 2:
                    if (dia > 19) {
                        signo = "PISCIS";
                    } else {
                        signo = "ACUARIO";
                    }
                    break;
            case 3:
                    if (dia > 20) {
                        signo = "ARIES";
                    } else {
                        signo = "PISCIS";
                    }
                    break;
            case 4:
                    if (dia > 20) {
                        signo = "TAURO";
                    } else {
                        signo = "ARIES";
                    }
                    break;
            case 5:
                    if (dia > 21) {
                        signo = "GEMINIS";
                    } else {
                        signo = "TAURO";
                    }
                    break;
            case 6:
                    if (dia > 20) {
                        signo = "CANCER";
                    } else {
                        signo = "GEMINIS";
                    }
                    break;
            case 7:
                    if (dia > 22) {
                        signo = "LEO";
                    } else {
                        signo = "CANCER";
                    }
                    break;
            case 8:
                    if (dia > 21) {
                        signo = "VIRGO";
                    } else {
                        signo = "LEO";
                    }
                    break;
            case 9:
                    if (dia > 22) {
                        signo = "LIBRA";
                    } else {
                        signo = "VIRGO";
                    }
                    break;
            case 10:
                    if (dia > 22) {
                        signo = "ESCORPION";
                    } else {
                        signo = "LIBRA";
                    }
                    break;
            case 11:
                    if (dia > 21) {
                        signo = "SAGITARIO";
                    } else {
                        signo = "ESCORPION";
                    }
                    break;
            case 12:
                    if (dia > 21) {
                        signo = "CAPRICORNIO";
                    } else {
                        signo = "SAGITARIO";
                    }
            break;
        }
        System.out.println(signo);
    }
    
}