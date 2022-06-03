package gestionMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import baseDatos.Serializador;
import gestionApp.Evento.Correo;
import gestionApp.Evento.Llamada;
import gestionApp.Evento.Reunion;
import gestionApp.Venta;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionApp.servicios.Servicio;
import gestionMain.uiMain.uiCliente;
import gestionMain.uiMain.uiEmpleado;
import gestionMain.uiMain.uiEmpresa;
import gestionMain.uiMain.uiNegocio;
import gestionMain.uiMain.uiRegistro;
import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;


public class Interfaz {


    public static void main(String[] args) {
        //Creacion de objetos
        Empleado empEncargado = new Empleado("Carlos Encargado", 1065468798, "300456479", "Encargado@gmail.com", "Supervisor", "10/9/1999");
        Empleado empleadoEjemplo1 = new Empleado("Eugenia", 102110321, "301546564", "Eugenia@gmail.com", "Razos", "15/3/2004");
        Empresa empresa01 = new Empresa("Empresa Defaut", 321, "descripcion");
        Cliente cl = new Cliente("Miguel Restrepo", empresa01, 1036688866, "3014654654" ,"miguel@gmail.com" ,"1001" ,true);
        Negocio negocioEje = new Negocio(empleadoEjemplo1, cl, 1000000);
        Evento Neg = new Evento(negocioEje, "descripcion del negocio" , null);

        Servicio s1 = new Servicio("Diseño web", 100, "digital", "Descripcion generica");
        Servicio s2 = new Servicio("Venta de anime", 100, "digital", "Descripcion generica");
        Servicio s3 = new Servicio("Hacking", 100, "digital", "Descripcion generica");
        Servicio s4 = new Servicio("Falsificación de documento", 100, "digital", "Descripcion generica");
        //Serializador.serializacion();



        Scanner scan = new Scanner(System.in);
        int opcion;




        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ PRINCIPAL\s|
                        ---------------------

                        1. Empresa
                        2. Cliente
                        3. Empleado
                        4. Registros
                        5. Negocios
                        6. Servicios
                        7. Salir
                        ingrese opción:\s""");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1: uiEmpresa.empresa(); break;//activa menú empresa
                    case 2: uiCliente.clientes(cl,empresa01);break; //activa menú cliente
                    case 3: uiEmpleado.empleado(empleadoEjemplo1,empresa01); break;//activa menú empleado
                    case 4: uiRegistro.registros(empleadoEjemplo1, cl, negocioEje); break; //activa menú negocios
                    case 5: uiNegocio.negocios(empleadoEjemplo1, cl, negocioEje); break; //activa menú registros
                    case 6: servicios(); break; //activa menú servicios
                    case 7: break; //Salir

                }
            }catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        }while (opcion != 7);


    }



 

    public static  void servicios() {
        Scanner scan = new Scanner(System.in);
        int opcion1;


        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ SERVICIOS\s|
                        ---------------------
                        1. Agregar servicios:\s
                        2. Consultar clientes de servicios:\s
                        3. Consultar servicios:\s
                        4. Eliminar servicios\s
                        5. Hacer promoción\s
                        6. Volver\s
                        ingrese opción:\s""");



                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        //Evento.anadirEvento();
                        break;
                    case 2:
                        Evento.cursoEvento();
                        break;
                    case 3:
                        //Evento.modificarEvento();
                        break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


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


    static class menuNegocio{

  


}

}