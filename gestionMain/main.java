package gestionMain;

import java.util.Scanner;

import gestionApp.Cliente;
import gestionApp.Evento;
import gestionApp.Registro;


public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
    

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
                            registro();
                            break;
                        case 2: 
                            eventos();
                        case 3: 
                            clientes();
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
    public static  void registro() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU REGISTRO " + "\n1. Registrar Contacto " + "\n2. Registrar Empleados " + "\n3. Registrar Empresa " + "\n4. Registrar Servicios: " + "\n5. Registrar Promocion: "+ "\n6. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        //Registro.registrarCliente(id, nombre, cedula, cel_num)
                        break;
                    case 2: 
                        //Registro.registrarEmpleado(nombre, apellido, cedula, edad, correo, celular, fechaInicioContrato)
                        break;
                    
                    case 3: 
                        //Registro.registrarEmpresa(cargo, negociosAbiertos, negociosCerrados, etapaVenta, valor)
                        break;
                    case 4:
                        //Registro.registrarEmpresa(cargo, negociosAbiertos, negociosCerrados, etapaVenta, valor)
                        break;
                    case 5:
                        Registro.registrarPromocion();
                        break;
                    case 6:
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);
    

    }
    public static  void eventos() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU EVENTOS " + "\n1. Anadir Eventos: " + "\n2. Estado de Eventos: " + "\n3. Modificar Eventos: " + "\n4. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        Evento.anadirEvento();
                        break;
                    case 2: 
                        Evento.cursoEvento();
                        break;
                    case 3: 
                        Evento.modificarEvento();
                        break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 4);
    

    }
    public static  void clientes() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               

        do {
            try {
                System.out.print("\t MENU CLIENTES " + "\n1. Consultar Clientes: " + "\n2. Clientes Potenciales: " + "\n3. Consultar Ventas: "+ "\n4. Servicio de Clientes: " + "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        Cliente.consultarClientes();
                        break;
                    case 2: 
                        Cliente.clientesPotenciales();
                        break;
                    case 3: 
                        Cliente.consultarVentas();
                        break;
                    case 4: 
                        Cliente.serviciosClientes();
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);
    

    }
    
    
}
