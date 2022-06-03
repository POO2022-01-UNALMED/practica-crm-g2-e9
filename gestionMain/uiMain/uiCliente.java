package gestionMain.uiMain;

import java.util.Scanner;

import gestionApp.Empresa;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionMain.FuncionesInterfaz;

public class uiCliente {
    
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
    
}
