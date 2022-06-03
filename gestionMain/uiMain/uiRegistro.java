package gestionMain.uiMain;

import java.util.Scanner;

import gestionApp.Negocio;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionMain.FuncionesInterfaz;

public class uiRegistro {
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
                        3. Registrar Negocio\s
                        4. Registrar :\s
                        5. Registrar :\s
                        6. Volver\s
                        7. Volver\s
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

                        System.out.print("\tREGISTRO NEGOCIO\s");
                        uiNegocio.registrarNegocio();

                        break;
                    case 5:
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
                       
                    case 6:

                        System.out.print("\tREGISTRO PROMOCION\s");

                        System.out.print("\nIngrese el descuento en valor decimal: ");
                        Double descuento = FuncionesInterfaz.entradaDouble();

                        System.out.print("\nIngrese el Nombre del Servicio para la Promocion: ");
                        String nombreServicioP = FuncionesInterfaz.entradaString();;

                        Registro.registrarPromocion(descuento,nombreServicioP );
                        break;
                    case 7: break;



                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


    }
    
}
