package gestionMain.uiMain;

import java.util.Scanner;

import gestionApp.Negocio;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionMain.FuncionesInterfaz;

public class uiNegocio {
    public static  void negocios(Empleado empEncargado,Cliente cliente,Negocio negocioEje ) {
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
                        3. Negocio Abierto:\s
                        4. Eliminar Negocio:\s
                        5. Etapa de negocio\s
                        6.
                        7. Atras.\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        System.out.print("\tREGISTRAR NEGOCIO: \n");
                        System.out.print("Ingresa el Valor de la venta del producto: ");
                        int valorVentaNegocio = FuncionesInterfaz.entradaInt();
                        Registro.registrarNegocio(empEncargado, cliente, valorVentaNegocio);
                        break;
                    case 2:

                        String idNegocio = FuncionesInterfaz.entradaString();
                        Registro.buscarNegocios(idNegocio);
                        break;
                    case 3:
                        int nitEmpresa = FuncionesInterfaz.entradaInt();
                        Registro.negociosEmpresa(nitEmpresa);
                        break;
                    case 4:
                        Registro.eliminarNegocio(cliente);
                        break;
                    case 5: 
                        System.out.print("\tETAPA DE NEGOCIO: \n");
                        System.out.print("");
                        
                        System.out.print("El Negocio del Cliente: "+cliente.getNombre()+
                        " y "+"el Empleado: "+empEncargado.getNombre()+
                        "se encuentra en la etapa: "+ negocioEje.getEtapa());
                        System.out.print(negocioEje.getEventos());


                        
                    case 6: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);


    }


    
}
