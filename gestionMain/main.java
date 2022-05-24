package gestionMain;

import java.util.Scanner;

import gestionMain.Clientes.Clientes;
import gestionMain.Eventos.Eventos;
import gestionMain.Registro.Registro;
/* Hola a todos*/
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
  //prueba      
               
        do {
            try {
                System.out.print("\t MENU MAIN "+"\n1. Registro "+"\n2. Navegar "+"\n3. Salir: \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        menuPrincipal();
                        break;
                    case 2: //menu para navegar
                    case 3: break;//SALIR

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 3);
    

    }

    private static void menuPrincipal() {
        {
            Scanner scan = new Scanner(System.in);
            int opcion1;
            
                   
            do {
                try {
                    System.out.print("\t MENU PRINCIPAL "+"\n1. Registro "+"\n2. Eventos "+"\n3. Clientes: "+"\n4. Salir. \n");
                    opcion1 = scan.nextInt();
                    switch (opcion1) {
                        case 1: 
                            Registro.registro();
                            break;
                        case 2: 
                            Eventos.eventos();
                        case 3: 
                            Clientes.clientes();
                            break;
                        case 4:

    
                    }
                } catch (Exception e) {
                    System.out.print("Ingrese una opcion nuevamente: ");
                    opcion1 = scan.nextInt();
                }
            } while (opcion1 != 4);
        
    
        }
    }
    
}
