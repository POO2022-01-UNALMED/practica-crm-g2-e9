package gestionMain.uiMain;

import gestionApp.Evento.Correo;
import gestionApp.Evento.Llamada;
import gestionApp.Evento.Reunion;
import gestionApp.Negocio;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Promocion;
import gestionApp.servicios.Registro;
import gestionApp.servicios.Servicio;
import gestionMain.FuncionesInterfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class uiPromocion {
    public static <list> void promocion() {
        Scanner scan = new Scanner(System.in);
        int opcion1;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ NEGOCIOS\s|
                        ---------------------
                        1. Hacer Promoción :\s
                        2. Buscar Promoción:\s
                        3. Eliminar Promoción:\s
                        4. Atras.\s
                        ingrese opción:\s""");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        uiPromocion.registrarPromocion();
                        break;
                    case 2:
                        uiPromocion.buscarPromocion();
                        break;
                    case 3:
                        uiNegocio.negociosAbiertos();
                        break;
                    case 4:
                        uiNegocio.eliminarNegocio();
                        break;
                    case 5:
                        uiNegocio.realizarEvento();
                        break;
                    case 6: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 6);


    }
    public static void registrarPromocion() {
        Scanner apoyo = new Scanner(System.in);
        ArrayList<Integer> lista_servicios = new ArrayList<>();
        int iEmpleado = 0;
        int iServicio = -2;
        int iCliente = -1;
        int valorVenta = 0;
        boolean vacio;

        System.out.println("----------------------------------------------");
        System.out.print("\tREGISTRAR PROMOCION:\n");
        System.out.print("Seleccione el servicio al que le creará una promoción:\n");
        System.out.println("Indice\t" + "Servicio");
        for (int i = 0; i < Servicio.getAllServicios().size(); i++) {
            System.out.println(i + 1 + ".   " + "\t" + Servicio.getAllServicios().get(i).getNombre());
        }
        System.out.print("Servicio: ");
        iServicio = FuncionesInterfaz.entradaInt();

        while (iServicio == 0) {
            System.out.println("-Ingrese al menos un servicio");
            System.out.print("Servicio: ");
            iServicio = FuncionesInterfaz.entradaInt();
        }
        while (iServicio > Servicio.getAllServicios().size() || iServicio < 0 || iServicio == 0) {
            System.out.println("No valido");
            System.out.print("Servicio: ");
            iServicio = FuncionesInterfaz.entradaInt();
        }

        System.out.print("Ingrese el valor de descuento: ");
        int descuento = apoyo.nextInt();
        Promocion promocion = new Promocion(descuento, Servicio.getAllServicios().get(iServicio - 1));
        System.out.println("La promocion se ha creado satisfactoriamente!");
    }

    public static void buscarPromocion(){
        System.out.println("----------------------------------------------");
        System.out.print("\tBUSCAR PROMOCIÓN:\n");
        System.out.println("Seleccione la promoción que desea consultar:");
        System.out.println("Idice\t"+"ID   \t"+"Servicio");
        for (int i = 0; i < Promocion.getAllPromocion().size(); i++){System.out.println(i+1 +".   "+"\t"+Promocion.getAllPromocion().get(i).getId()+"   \t"+Promocion.getAllPromocion().get(i).getServicio().getNombre());}
        System.out.print("Promoción: ");
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

        int iEvento;
        try {
            iEvento = FuncionesInterfaz.entradaInt();
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


        } catch (Exception e) {
            System.out.print("Ingrese una opcion nuevamente: ");
            iEvento = FuncionesInterfaz.entradaInt();
        }

        // System.out.println(Negocio.getNegocios().get(indice-1).agregarEvento(););
        // System.out.print("Ingrese cualquier caracater: ");
        // String esperador = FuncionesInterfaz.entradaString();
    }
}
