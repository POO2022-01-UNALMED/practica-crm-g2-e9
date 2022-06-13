package gestionMain;

import java.util.Scanner;


public class FuncionesInterfaz {
    public static int opcionInt; 
    public static String opcionString;
    public static double opcionDouble;
    public static int entradaInt (){
        Scanner scan = new Scanner(System.in);
        try {
            opcionInt = scan.nextInt();
            return opcionInt;
            
            
        } catch (Exception e) {
            System.out.print("Ingrese un dato invalido: ");


        }
        return opcionInt;
    }
    public static String entradaString (){
        Scanner scan = new Scanner(System.in);
        try {
            opcionString = scan.next();
            return opcionString;
            
        } catch (Exception e) {
            System.out.print("Ingrese un dato invalido: ");
            

        }
        return opcionString;
    }
    public static boolean entradaBool (){
        Scanner scan = new Scanner(System.in);
        try {
            opcionString = scan.next();
            if (opcionString == "SI" || opcionString == "si" || opcionString == "Si")   
                return true;
            else
                return false;

            
        } catch (Exception e) {
            System.out.print("Ingrese un dato invalido: ");
            

        }
        return false;

    }
    public static double entradaDouble (){
        Scanner scan = new Scanner(System.in);
        try {
            opcionDouble = scan.nextDouble();
            return opcionDouble;
            
        } catch (Exception e) {
            System.out.print("Ingrese un dato invalido: ");

        }
        return opcionDouble;

    }

    
}
