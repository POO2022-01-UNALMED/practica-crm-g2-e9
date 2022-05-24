package gestionMain;

import java.util.Scanner;

import gestionApp.Clientes.ClientesPotenciales;
import gestionApp.Clientes.ConsultarClientes;
import gestionApp.Clientes.ConsultarVentas;
import gestionApp.Clientes.ServiciosClientes;
import gestionApp.Eventos.AñadirEvento;
import gestionApp.Eventos.EstadoEvento;
import gestionApp.Eventos.ModificarEvento;
import gestionApp.Registro.RegistroEmpleado;
import gestionApp.Registro.RegistroEmpresa;
import gestionApp.Registro.RegistroPromocion;
import gestionApp.Registro.RegistroServicios;



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
                System.out.print("\t MENU REGISTRO " + "\n1. Registrar Empleados " + "\n2. Registrar Empresa " + "\n3. Registrar Servicios: " + "\n4. Registrar Promocion: "+ "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        RegistroEmpleado.registrarEmpleado();
                        break;
                    case 2: 
                        RegistroEmpresa.registrarEmpresa();
                        break;
                    
                    case 3: 
                        RegistroServicios.registrarServicios();
                        break;
                    case 4:
                        RegistroPromocion.registrarProcion();
                        break;
                    case 5:
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);
    

    }
    public static  void eventos() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU EVENTOS " + "\n1. Añadir Eventos: " + "\n2. Estado de Eventos: " + "\n3. Modificar Eventos: " + "\n4. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        AñadirEvento.añadirEvento();
                        break;
                    case 2: 
                        EstadoEvento.cursoEvento();
                        break;
                    case 3: 
                        ModificarEvento.modificarEvento();
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
                        ConsultarClientes.consultarClientes();
                        break;
                    case 2: 
                        ClientesPotenciales.clientesPotenciales();
                        break;
                    case 3: 
                        ConsultarVentas.consultarVentas();
                        break;
                    case 4: 
                        ServiciosClientes.serviciosClientes();
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);
    

    }
    
    
}
