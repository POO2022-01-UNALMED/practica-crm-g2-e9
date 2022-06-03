package gestionMain.uiMain;

import java.util.ArrayList;
import java.util.Scanner;

import gestionApp.Negocio;
import gestionApp.Evento.Correo;
import gestionApp.Evento.Llamada;
import gestionApp.Evento.Reunion;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionApp.servicios.Servicio;
import gestionMain.FuncionesInterfaz;

public class uiNegocio {

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
                        uiNegocio.registrarNegocio(empEncargado, cliente, negocioEje);
                        break;
                    case 2:
                        uiNegocio.buscarNegocio();
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
    public static void registrarNegocio(Empleado empleadoEjemplo1,Cliente cl,Negocio negocioEje){
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


    

