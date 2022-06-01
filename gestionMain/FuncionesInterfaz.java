package gestionMain;

import java.util.Scanner;


public class FuncionesInterfaz {
    public static int opcionInt; 
    public static String opcionString;
    public static int entradaInt (){
        Scanner scan = new Scanner(System.in);
        try {
            opcionInt = scan.nextInt();
            return opcionInt;
            
            
        } catch (Exception e) {
            System.out.print("Ingrese una opcion nuevamente: ");
            opcionInt = scan.nextInt();

        }
        return opcionInt;
    }
    public static String entradaS (){
        Scanner scan = new Scanner(System.in);
        try {
            opcionString = scan.next();
            return opcionString;
            
        } catch (Exception e) {
            System.out.print("Ingrese una opcion nuevamente: ");
            opcionString = scan.next();

        }
        return opcionString;
    }

    
}
