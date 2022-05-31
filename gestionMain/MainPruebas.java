/*
package gestionMain;

import gestionApp.Empresa;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Servicio;

import java.util.ArrayList;

public class MainPruebas {
    public static void main(String[] args) {
        Empleado Alex = new Empleado("Alex", 1003, "3123", "alex@unale.edu.co",
                25, "Asesor", "30/05/2022" );

        ArrayList<Servicio> servicios = new ArrayList<>();

        for (int i = 0; i < 10; i++ ){
            servicios.add(new Servicio("A"+i, 100+i*2,"web", "--"));
        }

        for (Servicio servicio: servicios){
            System.out.println(servicio.getNombre());
        }

        Empresa a = new Empresa( "google", 100,  "descripcion");
        Cliente cliente = new Cliente("Ferxxxo", 100, "3123123", "ferxxo@unal.edu.co", 100, a, "gerente", true );



    }
}
*/





package gestionMain;

import java.util.Scanner;

import gestionApp.personas.Cliente;
import gestionApp.Empresa;
import Evento.Evento;


public class MainPruebas {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int opcion1;



        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ PRINCIPAL\s|
                        ---------------------
                        1. Clientes
                        2. Negocios
                        3. Registros
                        4. Servicios
                        5. Salir
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: clientes();break; //activa menú cliente
                    case 2: negocios(); break; //activa menú negocios
                    case 3: registros(); break; //activa menú registros
                    case 4: servicios(); break; //activa menú servicios
                    case 5: break; //Salir

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);


    }



    public static  void clientes() {
        Scanner scan = new Scanner(System.in);
        int opcion1;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ CLIENTES\s|
                        ---------------------
                        1. Hacer venta a Cliente:\s
                        2. Consultar Clientes:\s
                        3. Consultar Clientes Potenciales:\s
                        4. Eliminar Cliente:\s
                        5. Agregar Clientes:\s
                        6. Volver\s
                        ingrese opción:\s""");
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

                    //case 6: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


    }

    public static  void negocios() {
        Scanner scan = new Scanner(System.in);
        int opcion1;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ NEGOCIOS\s|
                        ---------------------
                        1. Avanzar Negociación:\s
                        2. Hacer Negocio:\s
                        3. Consultar Negocios:\s
                        4. Eliminar Negocio:\s
                        5. Volver\s
                        ingrese opción:\s""");
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

    public static  void registros() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        Empresa empresa01 = new Empresa("Empresa Defaut", 789456123, "descripcion");
        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ REGISTRO\s|
                        ---------------------
                        1. Consultar registros de la empresa\s
                        2. Registrar cliente\s
                        3. Registrar empleado\s
                        3. Registrar empresa\s
                        4. Registrar promocion:\s
                        5. Registrar servicios:\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        Cliente cliente01 = new Cliente("Miguel Restrepo", 1036688863, "3006718392", "miguel@gmail.com", 1001, empresa01 ,"Mi propio jefe", true);
                        System.out.println(cliente01);
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
                    //case 6:
                        //break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


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

}

