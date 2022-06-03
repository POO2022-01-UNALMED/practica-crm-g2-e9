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
                    case 1: empresa(); break;//activa menú empresa
                    case 2: clientes(cl,empresa01);break; //activa menú cliente
                    case 3: empleado(empleadoEjemplo1,empresa01); break;//activa menú empleado
                    case 4: registros(); break; //activa menú negocios
                    case 5: negocios(empleadoEjemplo1, cl, negocioEje); break; //activa menú registros
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
                        Registro.listaClientes();
                        System.out.print("Buscar Cliente por Cedula: ");
                        int cedula= FuncionesInterfaz.entradaInt();
                        System.out.print(Registro.buscarCliente(cedula));

                        break;
                    case 3:
                        System.out.print("Eliminar Cliente por Cedula: ");
                        cedula = FuncionesInterfaz.entradaInt();
                        Registro.eliminarCliente(cedula);

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
                        System.out.print("\tLOS EMPLEADOS ACTUALES SON\n");
                        Registro.listaEmpleados();

                    case 2:
                        Registro.listaEmpleados();
                        System.out.print("Buscar Empleado por ID: ");
                        String idEmpleado = FuncionesInterfaz.entradaString();
                        System.out.print(Registro.buscarEmpleado(idEmpleado));
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
                        idEmpleado = FuncionesInterfaz.entradaString();
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


    public static <list> void negocios(Empleado empEncargado, Cliente cliente, Negocio negocioEje ) {
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
                        3. Negocios Abiertos:\s
                        4. Eliminar Negocio:\s
                        5. Realizar Evento\s
                        6. Atras.\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        menuNegocio.registrar();
                        break;
                    case 2:
                        menuNegocio.buscarNegocio();
                        break;
                    case 3:
                        menuNegocio.negociosAbiertos();
                        break;
                    case 4:
                        menuNegocio.eliminarNegocio();
                        break;
                    case 5:
                        menuNegocio.realizarEvento();
                        break;
                    case 6: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


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

        public static void registrar(){
            Scanner apoyo = new Scanner(System.in);
            ArrayList<Integer> lista_servicios = new ArrayList<>();
            int iEmpleado;
            int iServicio = -2;
            int iCliente = -1;
            int valorVenta = 0;
            boolean vacio;

            System.out.println("----------------------------------------------");
            System.out.print("\tHACER NEGOCIO:\n");
            System.out.println("Seleccione el empleado que estará a cargo del negocio:");
            System.out.println("Indice\t"+"Empleado");
            for (int i = 0; i < Empleado.getAllEmpleados().size(); i++){System.out.println(i+1 +".   "+"\t"+Empleado.getAllEmpleados().get(i).getNombre());}
            System.out.println("Ingrese indice del empleado");
            System.out.print("Empleado: ");
            iEmpleado = FuncionesInterfaz.entradaInt();
            while (iEmpleado > Empleado.getAllEmpleados().size() || iEmpleado < 1){
                System.out.println("Numero inválido");
                System.out.print("Empleado: ");
                iEmpleado = FuncionesInterfaz.entradaInt();
            }

            System.out.println("----------------------------------------------");
            System.out.print("Seleccione los servicios que desea vender:\n");
            //imprime los servicios
            System.out.println("Indice\t"+"Servicio");
            for (int i = 0; i < Servicio.getAllServicios().size(); i++){System.out.println(i+1 +".   "+"\t"+Servicio.getAllServicios().get(i).getNombre());}
            System.out.println("Ingrese 0 cuando ya haya seleccionado todos los servicios");
            System.out.print("Servicio: ");
            iServicio = FuncionesInterfaz.entradaInt();

            while (iServicio == 0){
                System.out.println("-Ingrese al menos un servicio");
                System.out.print("Servicio: ");
                iServicio = FuncionesInterfaz.entradaInt();
            }
            while(true){
                if (iServicio == 0){break;}
                else if (iServicio > Servicio.getAllServicios().size() || iServicio < 0){
                    System.out.println("-Numero inválido");
                    System.out.println("Servicio: ");
                    iServicio = FuncionesInterfaz.entradaInt();
                }else{
                    lista_servicios.add(iServicio-1);
                    valorVenta += Servicio.getAllServicios().get(iServicio-1).getPrecio();
                    System.out.print("Servicio: ");
                    iServicio = FuncionesInterfaz.entradaInt();
                }
            }
            System.out.println("----------------------------------------------");
            System.out.println("Seleccione el cliente con quien intentará hacer el negocio:");
            System.out.println("Indice\t"+"Cliente");
            for (int i = 0; i < Cliente.allClientes.size(); i++){System.out.println(i+1 +".   "+"\t"+Cliente.allClientes.get(i).getNombre());}
            System.out.print("Cliente : ");
            iCliente = apoyo.nextInt();
            while (true){
                if (iCliente < 1 || iCliente > Cliente.getAllClientes().size()){
                    System.out.println("Numero Inválido");
                    System.out.print("Cliente: ");
                    iCliente = apoyo.nextInt();
                }else{break;}
            }

            Registro.registrarNegocio(Empleado.getAllEmpleados().get(iEmpleado-1), Cliente.getAllClientes().get(iCliente-1), valorVenta);
            System.out.println("----------------------------------------------");
            System.out.println("!El negocio se ha creado satisfactoriamente! ");
            System.out.println("Su ID es " + Negocio.getNegocios().get(Negocio.getNegocios().size()-1).getId());
            System.out.println("Realice eventos para avanzar la negociación ;)");
        }

        public static void buscarNegocio(){
            System.out.println("----------------------------------------------");
            System.out.print("\tBUSCAR NEGOCIO:\n");
            System.out.println("Seleccione el negocio que desea consultar:");
            System.out.println("Idice\t"+"ID   \t"+"Cliente");
            for (int i = 0; i < Negocio.getNegocios().size(); i++){System.out.println(i+1 +".   "+"\t"+Negocio.getNegocios().get(i).getId()+"   \t"+Negocio.getNegocios().get(i).getCliente().getNombre());}
            System.out.print("Negocio: ");
            int indice = FuncionesInterfaz.entradaInt();
            System.out.println("----------------------------------------------");
            System.out.println(Negocio.getNegocios().get(indice-1).toStringNegocio());
            System.out.print("Ingrese cualquier caracater: ");
            String esperador = FuncionesInterfaz.entradaString();

        }

        public static void negociosAbiertos(){
            System.out.println("----------------------------------------------");
            System.out.print("\tNEGOCIOS ABIERTOS:\n");
            System.out.println("Seleccione el negocio abierto que desea consultar:");
            System.out.println("Idice\t"+"ID   \t"+"Cliente");
            for (int i = 0; i < Negocio.getNegocios().size(); i++){
                if (!Negocio.getNegocios().get(i).getEtapa().equals("Cerrado")){
                    System.out.println(i+1 +".   "+"\t"+Negocio.getNegocios().get(i).getId()+"   \t"+Negocio.getNegocios().get(i).getCliente().getNombre());}
            }
            System.out.print("Negocio: ");
            int indice = FuncionesInterfaz.entradaInt();
            System.out.println("----------------------------------------------");
            System.out.println(Negocio.getNegocios().get(indice-1).toStringNegocio());
            System.out.print("Ingrese cualquier caracater: ");
            String esperador = FuncionesInterfaz.entradaString();

        }
        public static void eliminarNegocio(){
            String ID;
            System.out.println("----------------------------------------------");
            System.out.print("\tELIMINAR NEGOCIO:\n");
            System.out.println("Seleccione el negocio que desea eliminar:");
            System.out.println("Idice\t"+"ID   \t"+"Cliente");
            for (int i = 0; i < Negocio.getNegocios().size(); i++){
                if (!Negocio.getNegocios().get(i).getEtapa().equals("Cerrado")){
                    System.out.println(i+1 +".   "+"\t"+Negocio.getNegocios().get(i).getId()+"   \t"+Negocio.getNegocios().get(i).getCliente().getNombre());}
            }
            System.out.print("Negocio: ");
            int indice = FuncionesInterfaz.entradaInt();
            ID = Negocio.getNegocios().get(indice-1).getId();
            System.out.println("----------------------------------------------");
            Negocio.getNegocios().get(indice-1).eliminarNegocio(ID);
            System.out.print("El negocio identificado con ID "+ID+" se ha eliminado rey");


        }

        public static void realizarEvento(){
            System.out.println("----------------------------------------------");
            System.out.print("\tREALIZAR EVENTO:\n");
            System.out.println("Seleccione el negocio al que desea realizar un evento");
            System.out.println("Idice\t"+"ID   \t"+"Cliente");
            for (int i = 0; i < Negocio.getNegocios().size(); i++){
                if (!Negocio.getNegocios().get(i).getEtapa().equals("Cerrado")){
                    System.out.println(i+1 +".   "+"\t"+Negocio.getNegocios().get(i).getId()+"   \t"+Negocio.getNegocios().get(i).getCliente().getNombre());}
            }
            System.out.print("Negocio: ");
            int indice = FuncionesInterfaz.entradaInt();
            String nombreEmpleado = Negocio.getNegocios().get(indice-1).getEmpleadoEncargado().getNombre();
            String nombreCliente = Negocio.getNegocios().get(indice-1).getCliente().getNombre();
            System.out.println("----------------------------------------------");
            System.out.println("El empleado acargo de la gestion del negocio es "+nombreEmpleado);
            System.out.println("Seleccione el tipo de evento que realizará "+ nombreEmpleado +":");
            System.out.println("1. Correo");
            System.out.println("2. Llamada");
            System.out.println("3. Reunión");
            int iEvento = FuncionesInterfaz.entradaInt();
            switch (iEvento) {

                case 1:
                    System.out.println(nombreEmpleado + " enviará un correo electronico a " + nombreCliente);
                    System.out.print("Ingrese una breve descripción del correo: ");
                    String ds = FuncionesInterfaz.entradaString();
                    Correo correo = new Correo(Negocio.getNegocios().get(indice - 1), ds);
                    System.out.println("El evento se ha creado satisfactoriamente");
                    System.out.print("Ingrese cualquier tecla: "); ds = FuncionesInterfaz.entradaString();
                    break;
                case 2:
                    System.out.println(nombreEmpleado + " hará una llamada a " + nombreCliente);
                    System.out.print("Ingrese una breve descripción de la llamada: ");
                    ds = FuncionesInterfaz.entradaString();
                    Llamada llamada = new Llamada(Negocio.getNegocios().get(indice - 1), ds);
                    System.out.println("El evento se ha creado satisfactoriamente");
                    System.out.print("Ingrese cualquier tecla: "); ds = FuncionesInterfaz.entradaString();
                    break;
                case 3:
                    System.out.println(nombreEmpleado + " realizará una reunión con " + nombreCliente);
                    System.out.print("Ingrese una breve descripción de la reunión: ");
                    ds = FuncionesInterfaz.entradaString();
                    Reunion reunion = new Reunion(Negocio.getNegocios().get(indice - 1), ds);
                    System.out.println("El evento se ha creado satisfactoriamente");
                    System.out.print("Ingrese cualquier tecla: "); ds = FuncionesInterfaz.entradaString();
                    break;

            }

            //System.out.println(Negocio.getNegocios().get(indice-1).agregarEvento(););
            System.out.print("Ingrese cualquier caracater: ");
            String esperador = FuncionesInterfaz.entradaString();
        }

    }


}

