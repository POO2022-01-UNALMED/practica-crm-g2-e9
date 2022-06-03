package gestionMain.uiMain;

import java.util.Scanner;

import gestionApp.Empresa;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionMain.FuncionesInterfaz;

public class uiEmpleado {
    public static void empleado() {
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
