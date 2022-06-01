
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
import gestionApp.servicios.Registro;
import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;


public class Interfaz {

 
    public static void main(String[] args) {
        //Creacion de objetos
        Empleado empleadoEncargado = new Empleado("Carlos Encargado", 102110321, "301546564", "Encargado@gmail.com", 60, "Supervisor", "10/9/1999");
        Empresa empresa01 = new Empresa("Empresa Defaut", 789456123, "descripcion");
        Cliente cl = new Cliente("Miguel Restrepo", empresa01, 1036688866, "3014654654" ,"miguel@gmail.com" ,"1001" ,true);
        Negocio necocio01 = new Negocio(empleadoEncargado, cl, 1000000);
        Evento evento01 = new Evento(necocio01, "descripcion del negocio" , null);
    


        Scanner scan = new Scanner(System.in);
        int opcion;


    

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ PRINCIPAL\s|
                        ---------------------

                        1. Clientes
                        2. Empresa
                        3. Empleado
                        4. Registros
                        5. Negocios
                        6. Servicios
                        7. Salir
                        ingrese opción:\s""");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1: clientes(cl,empresa01);break; //activa menú cliente
                    case 2: empresa(); break;
                    case 3: empleado(); break;
                    case 4: registros(); break; //activa menú negocios
                    case 5: negocios(); break; //activa menú registros
                    case 6: servicios(); break; //activa menú servicios
                    case 7: break; //Salir

                }
            }catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        }while (opcion != 7);


    }
    private static void empleado() {
    }
    public static  void empresa() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        String nit;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ EMPRESAS\s|
                        ---------------------
                        1. Mostrar Empresas:\s
                        2. Buscar Empresa:\s
                        3. Eliminar :\s
                        4. Agregar :\s
                        5. Mostrar Informacion Cliente\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                
                switch (opcion1) {
                    case 1:
                        System.out.print(Empresa.getAllEmpresas());
                    case 2:
                        System.out.print("Buscar Empresa: ");
                        nit = scan.next();
                        Registro.buscarCliente(nit);                        
                        break;
                    case 3:
                        //Cliente.clientesPotenciales();
                        
                        break;
                    case 4:
                        Cliente.consultarVentas();
                        break;
                    case 5:
                        Cliente.serviciosClientes();
                        break;
                    case 6:

                        break;
                        
                    case 7: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


    }



    public static  void clientes(Cliente cl,Empresa empresa01) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        String id;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ CLIENTES\s|
                        ---------------------
                        1. Mostrar Clientes:\s
                        2. Buscar Clientes:\s
                        3. Eliminar Cliente:\s
                        4. Agregar Clientes:\s
                        5. Mostrar Informacion Cliente\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                
                switch (opcion1) {
                    case 1:
                        System.out.print("\tLOS CLIENTES ACTUALES SON\s");
                        System.out.print(Cliente.getAllClientes());
                    case 2:
                        System.out.print("Buscar Cliente: ");
                        id = scan.next();
                        Registro.buscarCliente(id);                        
                        break;
                    case 3:
                        //Cliente.clientesPotenciales();
                        
                        break;
                    case 4:
                        Cliente.consultarVentas();
                        break;
                    case 5:
                        Cliente.serviciosClientes();
                        break;
                    case 6:
                        System.out.print(cl.toString());
                        System.out.print("\t"+empresa01.toString());
                        break;
                        
                    case 7: break;

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
                        1. Registrar Empresa\s
                        2. Registrar Empleado\s
                        3. Registrar Cliente\s
                        3. Registrar \s
                        4. Registrar :\s
                        5. Registrar :\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        System.out.print("\nIngrese el Nombre de la Empresa");
                        String nombreEmpresa = FuncionesInterfaz.entradaS();

                        System.out.print("\nIngrese el Nit de la Empresa");
                        int nitEmpresa = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese la descripcion");
                        String descripcionEmpresa = FuncionesInterfaz.entradaS();

                        Registro.registrarEmpresa(nombreEmpresa, nitEmpresa, descripcionEmpresa);
                        break;
                    case 2:
                        System.out.print("\nIngrese el Nombre del Empleado: ");
                        String nombreEmpleado = FuncionesInterfaz.entradaS();;

                        System.out.print("\nIngrese Cedula del Empleado: ");
                        int cedulaEmpleado = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Celular del Empleado: ");
                        String celEmpleado = FuncionesInterfaz.entradaS();

                        System.out.print("\nIngrese Correo del Empleado: ");
                        String correoEmpleado = FuncionesInterfaz.entradaS();

                        System.out.print("\nIngrese Edad del Empleado: ");
                        int edadEmpleado = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese cargo del Empleado: ");
                        String cargoEmpreado = FuncionesInterfaz.entradaS();

                        System.out.print("\nIngrese Fecha en la que incio el contrato dd/mm/aaaa: ");
                        String fechaInicioContratoEmpleado = FuncionesInterfaz.entradaS();

                        Registro.registrarEmpleado(nombreEmpleado, cedulaEmpleado, celEmpleado, correoEmpleado, edadEmpleado, cargoEmpreado, fechaInicioContratoEmpleado);

                        break;

                    case 3:
                        System.out.print("\nIngrese el Nombre del Cliente: ");
                        String nombreCliente = FuncionesInterfaz.entradaS();;

                        System.out.print("\nIngrese Cedula del Cliente: ");
                        int cedulaCliente = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Celular del Cliente: ");
                        String celCliente = FuncionesInterfaz.entradaS();

                        System.out.print("\nIngrese Correo del Cliente: ");
                        String correoCliente = FuncionesInterfaz.entradaS();

                        //El ID SE DEBE GENERAL SOLO
                        // System.out.print("\nIngrese ID del Clente: ");
                        // int idCliente = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Cargo del Cliente: ");
                        String cargoCliente = FuncionesInterfaz.entradaS();

                        System.out.print("\n¿El Cliente esta activo o no? Escriba SI o NO: ");
                        boolean activoCliente = FuncionesInterfaz.entradaBool();

                        System.out.print("\nIngrese nit del Cliente para la Empresa: ");
                        int nitCliente = FuncionesInterfaz.entradaInt();

                        Registro.registrarCliente(nombreCliente, cedulaCliente, celCliente, correoCliente, cargoCliente, activoCliente, nitCliente);
                        break;
                    // case 4:
                    //     Registro.registrarEmpresa(cargo, negociosAbiertos, negociosCerrados, etapaVenta, valor)
                    //     break;
                    // case 5:
                    //     Registro.registrarPromocion();
                    //     break;
                    // case 6:
                    //     break;

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

