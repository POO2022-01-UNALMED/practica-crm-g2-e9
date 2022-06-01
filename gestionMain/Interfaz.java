
    // public static void main(String[] args) {
    //     Empleado Alex = new Empleado("Alex", 1003, "3123", "alex@unale.edu.co",
    //             25, "Asesor", "30/05/2022" );

    //     ArrayList<Servicio> servicios = new ArrayList<>();

    //     for (int i = 0; i < 10; i++ ){
    //         servicios.add(new Servicio("A"+i, 100+i*2,"web", "--"));
    //     }

    //     for (Servicio servicio: servicios){
    //         System.out.println(servicio.getNombre());
    //     }

    //     Empresa a = new Empresa( "google", 100,  "descripcion");
    //     Cliente cliente = new Cliente("Ferxxxo", 100, "3123123", "ferxxo@unal.edu.co", 100, a, "gerente", true );








package gestionMain;

import java.util.Scanner;

import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;


public class Interfaz {

 
    public static void main(String[] args) {
        //Creacion de objetos
        Empleado empleadoEncargado = new Empleado("Carlos Encargado", 102110321, "301546564", "Encargado@gmail.com", 60, "Supervisor", "10/9/1999");
        Empresa empresa01 = new Empresa("Empresa Defaut", 789456123, "descripcion");
        Cliente cl = new Cliente("Miguel Restrepo", empresa01, 1036688866, "3014654654" ,"miguel@gmail.com" ,"1001" ,"Mi propio jefe", true);
        Negocio necocio01 = new Negocio(empleadoEncargado, cl, 1000000);
        Evento evento01 = new Evento(necocio01, "descripcion del negocio" , null);
    


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
                    case 1: clientes(cl,empresa01);break; //activa menú cliente
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



    public static  void clientes(Cliente cl,Empresa empresa01) {
        Scanner scan = new Scanner(System.in);
        int opcion1;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ CLIENTES\s|
                        ---------------------
                        1. Consultar Clientes:\s
                        2. Consultar Clientes Potenciales:\s
                        3. Eliminar Cliente:\s
                        4. Agregar Clientes:\s
                        5. Mostrar Informacion Cliente\s
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
                    case 5:
                        System.out.print(cl.toString());
                        System.out.print("\t"+empresa01.toString());
                        
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

