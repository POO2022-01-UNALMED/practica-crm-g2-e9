package baseDatos;

import gestionApp.Empresa;
import gestionApp.Evento.*;
import gestionApp.Negocio;
import gestionApp.Venta;
import gestionApp.personas.*;
import gestionApp.servicios.*;

import java.io.*;
import java.util.ArrayList;

public class Serializador {
    public static <E> void serializar(ArrayList<E> lista, String clase) {
        FileOutputStream fileOut;
        try {
            String path = System.getProperty("user.dir") + "//baseDatos//temp//" + clase + ".txt";
            fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializacion() {
        serializar(Cliente.getAllClientes(), "Cliente");
        serializar(Empleado.getAllEmpleados(), "Empleado");
        serializar(Empresa.getAllEmpresas(), "Empresa");
        serializar(Negocio.getNegocios(), "Negocio");
        serializar(Venta.getAllVenta(), "Venta");
        serializar(Promocion.getAllPromocion(), "Promocion");
        serializar(Servicio.getAllServicios(), "Servicio");
        serializar(Evento.getAllEventos(), "Evento");



    }

}
