package gestionMain;

import java.util.Scanner;

import baseDatos.Serializador;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionApp.servicios.Servicio;
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
        Negocio necocio01 = new Negocio(empleadoEjemplo1, cl, 1000000);
        Evento evento01 = new Evento(necocio01, "descripcion del negocio" , null);

        Serializador.serializacion();
    


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
                    case 1: empresa(); break;//activa menú empresa
                    case 2: clientes(cl,empresa01);break; //activa menú cliente
                    case 3: empleado(empleadoEjemplo1,empresa01); break;//activa menú empleado
                    case 4: registros(); break; //activa menú negocios
                    case 5: negocios(empEncargado,cl); break; //activa menú registros
                    case 6: servicios(); break; //activa menú servicios
                    case 7: break; //Salir

                }
            }catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        }while (opcion != 7);


    }

    public static  void empresa() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        int nit;


        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ EMPRESAS\s|
                        ---------------------
                        1. Mostrar Empresas: \s
                        2. Buscar Empresa: \s
                        3. Eliminar una Empresa :\s
                        4. Agregar Empresa :\s
                        5. Mostrar Informacion Cliente por Empresa\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                
                switch (opcion1) {
                    case 1:
                        Registro.listaEmpresas();
                        //System.out.print(Registro.listaEmpresas());
                        System.out.print("\n ");
                        


                        break;
                        
                    case 2:
                        System.out.print("Buscar Empresa por NIT: ");
                        nit = FuncionesInterfaz.entradaInt();
                        Registro.buscarEmpresas(nit);    

                        break;
                    case 3:
                        System.out.print("Ingrese el NIT de la Empresa que desea eliminar: ");
                        nit = FuncionesInterfaz.entradaInt();
                        Registro.eliminarEmpresa(nit);
        
                        break;
                    case 4:
                        System.out.print("\tREGISTRAR UNA EMPRESA: \s");

                        System.out.print("\nIngrese el Nombre de la Empresa: ");
                        String nombreEmpresa = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese el Nit de la Empresa: ");
                        int nitEmpresa = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese la descripcion: ");
                        String descripcionEmpresa = FuncionesInterfaz.entradaString();

                        Registro.registrarEmpresa(nombreEmpresa, nitEmpresa, descripcionEmpresa);

                        break;

                    case 5:
                        System.out.print("Ingrese el NIT de la Empresa para ver los Empleados asociados: ");
                        nit = FuncionesInterfaz.entradaInt();
                        Registro.buscarClientesEmpresa(nit);
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



    private static  void clientes(Cliente cl,Empresa empresa01) {
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
                        Registro.listaClientes();

                    case 2:
                        System.out.print("Buscar Cliente por Cedula: ");
                        int cedula= FuncionesInterfaz.entradaInt();
                        Registro.buscarCliente(cedula);                        
                        break;
                    case 3:
                        System.out.print("Eliminar Cliente por Cedula: ");
                        int ced = FuncionesInterfaz.entradaInt();
                        Registro.eliminarCliente(ced);      
                        
                        break;
                    case 4:
                        System.out.print("\tREGISTRAR UNA CLIENTE: \s");
                        System.out.print("\nIngrese el Nombre del Cliente: ");
                        String nombreCliente = FuncionesInterfaz.entradaString();;

                        System.out.print("\nIngrese Cedula del Cliente: ");
                        int cedulaCliente = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Celular del Cliente: ");
                        String celCliente = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Correo del Cliente: ");
                        String correoCliente = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Cargo del Cliente: ");
                        String cargoCliente = FuncionesInterfaz.entradaString();

                        System.out.print("\n¿El Cliente esta activo o no? Escriba SI o NO: ");
                        boolean activoCliente = FuncionesInterfaz.entradaBool();

                        System.out.print("\nIngrese nit del Cliente para la Empresa: ");
                        int nitCliente = FuncionesInterfaz.entradaInt();

                        Registro.registrarCliente(nombreCliente, cedulaCliente, celCliente, correoCliente, cargoCliente, activoCliente, nitCliente);

                        break;
                    case 5:
                        System.out.print("Infromacion asociada al Cliente por ID: ");
                        int Cedu = FuncionesInterfaz.entradaInt();
                        Registro.infoCliente(Cedu);
                        System.out.print(cl.toString());
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
    private static void empleado(Empleado empleadoEjemplo1,Empresa empresa) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        String id;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ EMPLEADO\s|
                        ---------------------
                        1. Mostrar Empleado:\s
                        2. Buscar Empleado:\s
                        3. Eliminar Empleado:\s
                        4. Agregar Empleado:\s
                        5. Mostrar Informacion Empleado\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                
                switch (opcion1) {
                    case 1:
                        System.out.print("\tLOS EMPLEADOS ACTUALES SON\s");
                        Registro.listaClientes();

                    case 2:
                        System.out.print("Buscar Empleado por ID: ");
                        int cedCliente = FuncionesInterfaz.entradaInt();
                        Registro.buscarCliente(cedCliente);                        
                        break;
                    case 3:
                        System.out.print("Eliminar Empleado por ID: ");
                        id = FuncionesInterfaz.entradaString();
                        Registro.eliminarEmpleado(id);      
                        
                        break;
                    case 4:
                        System.out.print("\tREGISTRAR UNA EMPLEADO: \s");
                        System.out.print("\nIngrese el Nombre del Empleado: ");
                        String nombreEmpleado = FuncionesInterfaz.entradaString();;

                        System.out.print("\nIngrese Cedula del Empleado: ");
                        int cedulaEmpleado = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Celular del Empleado: ");
                        String celEmpleado = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Correo del Empleado: ");
                        String correoEmpleado = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Cargo del Empleado: ");
                        String cargoEmpleado = FuncionesInterfaz.entradaString();
                    
                        System.out.print("\nIngrese Fecha de inicio del Contrato: ");
                        String fechaInicioContratoEmpleado = FuncionesInterfaz.entradaString();


                        Registro.registrarEmpleado(nombreEmpleado, cedulaEmpleado, celEmpleado, correoEmpleado, cargoEmpleado, fechaInicioContratoEmpleado);

                        break;
                    case 5:
                        System.out.print("Infromacion asociada al Empleado por ID: ");
                        String idEmpleado = FuncionesInterfaz.entradaString();
                        Registro.infoEmpleado(idEmpleado);
                        System.out.print(empleadoEjemplo1.toString());
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


    public static  void negocios(Empleado empEncargado,Cliente cliente) {
        Scanner scan = new Scanner(System.in);
        int opcion1;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ NEGOCIOS\s|
                        ---------------------
                        1. Hacer Negocio :\s
                        2. Buscar Negocio:\s
                        3. Consultar Negocios Abiertos:\s
                        4. Eliminar Negocio:\s
                        5. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        
                        System.out.print("Ingresa valor de Venta: ");
                        int valorVentaNegocio = FuncionesInterfaz.entradaInt();
                        Registro.registrarNegocio(empEncargado, cliente, valorVentaNegocio);
                        break;
                    case 2:
                        Registro.buscarNegocios(cliente);
                        break;
                    case 3:
                        Registro.negociosAbierto();
                        break;
                    case 4:
                        Registro.eliminarNegocio(cliente);
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

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ REGISTRO\s|
                        ---------------------
                        1. Registrar Empresa\s
                        2. Registrar Cliente\s
                        3. Registrar Empleado\s
                        3. Registrar \s
                        4. Registrar :\s
                        5. Registrar :\s
                        6. Volver\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        System.out.print("\tREGISTRO EMPRESA\s");
                        System.out.print("\nIngrese el Nombre de la Empresa: ");
                        String nombreEmpresa = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese el Nit de la Empresa: ");
                        int nitEmpresa = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese la descripcion de la Empresa: ");
                        String descripcionEmpresa = FuncionesInterfaz.entradaString();

                        Registro.registrarEmpresa(nombreEmpresa, nitEmpresa, descripcionEmpresa);
                        break;
                    case 2:
                        System.out.print("\tREGISTRO CLIENTE\s");
                        System.out.print("\nIngrese el Nombre del Cliente: ");
                        String nombreCliente = FuncionesInterfaz.entradaString();;

                        System.out.print("\nIngrese Cedula del Cliente: ");
                        int cedulaCliente = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Celular del Cliente: ");
                        String celCliente = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Correo del Cliente: ");
                        String correoCliente = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Cargo del Cliente: ");
                        String cargoCliente = FuncionesInterfaz.entradaString();

                        System.out.print("\n¿El Cliente esta activo o no? Escriba SI o NO: ");
                        boolean activoCliente = FuncionesInterfaz.entradaBool();

                        System.out.print("\nIngrese nit del Cliente para la Empresa: ");
                        int nitCliente = FuncionesInterfaz.entradaInt();

                        Registro.registrarCliente(nombreCliente, cedulaCliente, celCliente, correoCliente, cargoCliente, activoCliente, nitCliente);
                        
                        break;

                    case 3:
                        System.out.print("\tREGISTRO EMPLEADO\s");
                        System.out.print("\nIngrese el Nombre del Empleado: ");
                        String nombreEmpleado = FuncionesInterfaz.entradaString();;

                        System.out.print("\nIngrese Cedula del Empleado: ");
                        int cedulaEmpleado = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese Celular del Empleado: ");
                        String celEmpleado = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Correo del Empleado: ");
                        String correoEmpleado = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese cargo del Empleado: ");
                        String cargoEmpreado = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese Fecha en la que incio el contrato dd/mm/aaaa: ");
                        String fechaInicioContratoEmpleado = FuncionesInterfaz.entradaString();

                        Registro.registrarEmpleado(nombreEmpleado, cedulaEmpleado, celEmpleado, correoEmpleado, cargoEmpreado, fechaInicioContratoEmpleado);
                        break;
                    
                        
                    case 4:
                        System.out.print("\tREGISTRO SERVICIOS\s");
                        System.out.print("\nIngrese el Nombre del Servicio: ");
                        String nombreServicio = FuncionesInterfaz.entradaString();;

                        System.out.print("\nIngrese Valor del producto del servicio: ");
                        int valorProductoServicios = FuncionesInterfaz.entradaInt();

                        System.out.print("\nIngrese tipo de Servicio: ");
                        String tipoServicio = FuncionesInterfaz.entradaString();

                        System.out.print("\nIngrese descripcion del Servicio: ");
                        String descripcionServicio = FuncionesInterfaz.entradaString();

                        Registro.registrarServicios(nombreServicio, valorProductoServicios, tipoServicio, descripcionServicio);
                        break;
                    case 5:
                        System.out.print("\tREGISTRO PROMOCION\s");

                        System.out.print("\nIngrese el descuento en valor decimal: ");
                        Double descuento = FuncionesInterfaz.entradaDouble();

                        System.out.print("\nIngrese el Nombre del Servicio para la Promocion: ");
                        nombreServicio = FuncionesInterfaz.entradaString();;

                        Registro.registrarPromocion(descuento,nombreServicio );


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

