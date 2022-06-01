/*
package gestionMain;

import java.util.Scanner;

import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;


public class MainAntiguio {
    //Creacion de objetos
    static {
        Empleado empleadoEncargado = new Empleado("Carlos Encargado", 102110321, "301546564", "Encargado@gmail.com", 60, "Supervisor", "10/9/1999");
        Empresa empresa01 = new Empresa("Empresa Defaut", 789456123, "descripcion");
        Cliente cl = new Cliente("Miguel Restrepo", empresa01, 1036688866, "3014654654" ,"miguel@gmail.com" ,"1001" ,"Mi propio jefe", true);
        Negocio necocio01 = new Negocio(empleadoEncargado, cl, 1000000);
        Evento evento01 = new Evento(necocio01, "descripcion del negocio" , null);
    
        
        
    }
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        int opcion1;

           
        
        

        do {
            try {
                System.out.print("\t MENU MAIN "+"\n1. Registro "+"\n2. Cliente "+"\n3. Salir: \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 

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

    public static  void registro() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU REGISTRO " + "\n1. Registrar Contacto " + "\n2. Registrar Empleados " + "\n3. Registrar Empresa " + "\n4. Registrar Servicios: " + "\n5. Registrar Promocion: "+ "\n6. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 

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
                        //Registro.registrarPromocion();
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
    public static  void clientes(Cliente cl) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
        Empresa empresa01 = new Empresa("Empresa Defaut", 789456123, "descripcion");
        //Cliente cl = new Cliente("Miguel Restrepo", empresa01, 1036688866, "3014654654" ,"miguel@gmail.com" ,"1001" ,"Mi propio jefe", true);

        do {
            try {
                System.out.print("\t MENU CLIENTES " + "\n1. Consultar Clientes: " + "\n2. Clientes Potenciales: " + "\n3. Consultar Ventas: "+ "\n4. Servicio de Clientes: " + "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        //Cliente.consultarClientes();
                        System.out.print(cl.toString());
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
    public static void Funcionalidades(){
        Scanner scan = new Scanner(System.in);
        int opcion1;
        do {
            try {
                System.out.print("\t MENU FUNCIONALIDADES " + "\n1. Match: " + "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                    //Funcion que permita match entre clientes y Empresa o empleado
                    break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);

    }

}

*/