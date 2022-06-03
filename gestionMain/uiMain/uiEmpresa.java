package gestionMain.uiMain;

import java.util.Scanner;

import gestionApp.servicios.Registro;
import gestionMain.FuncionesInterfaz;

public class uiEmpresa {
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
                        System.out.print("\tLAS EMPRESAS ACUTALES SON\n");
                        Registro.listaEmpresas();
                        System.out.print("\n ");
                        break;
                    case 2:
                        Registro.listaEmpresas();
                        System.out.print("\n ");
                        int nitEmpresa = FuncionesInterfaz.entradaInt();
                        Registro.infoEmpresa(nitEmpresa);

                        break;
                    case 3:
                    
                        System.out.print("Ingrese el NIT de la Empresa que desea eliminar: ");
                        nit = FuncionesInterfaz.entradaInt();
                        Registro.eliminarEmpresa(nit);
        
                        break;
                    case 4:
                        registrarEmpresa();
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
    public static void registrarEmpresa(){
        System.out.print("\tREGISTRAR UNA EMPRESA: \s");

        System.out.print("\nIngrese el Nombre de la Empresa: ");
        String nombreEmpresa = FuncionesInterfaz.entradaString();

        System.out.print("\nIngrese el Nit de la Empresa: ");
        int nitEmpresa = FuncionesInterfaz.entradaInt();

        System.out.print("\nIngrese la descripcion: ");
        String descripcionEmpresa = FuncionesInterfaz.entradaString();

        Registro.registrarEmpresa(nombreEmpresa, nitEmpresa, descripcionEmpresa);
}
}