package baseDatos;

import gestionApp.Empresa;
import gestionApp.Evento.Evento;
import gestionApp.Negocio;
import gestionApp.Venta;
import gestionApp.personas.*;
import gestionApp.servicios.Promocion;
import gestionApp.servicios.Servicio;

import java.io.*;
import java.util.ArrayList;

public class Deserializador {

    public static <E> void deserializador(ArrayList<E> lista, String clase) {
        FileInputStream fileIn;
        try {
            String path = System.getProperty("user.dir") + "/src/baseDatos/temp/" + clase + ".txt";
            System.out.println(path);
            File archivo = new File(path);
            archivo.createNewFile();
            fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<E> listado = (ArrayList<E>) in.readObject();
            
            for (E owo : listado) {
                lista.add(owo);
            }
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Esta vacio");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void serializacion() {
        deserializador(Cliente.getAllClientes(), "Cliente");
        deserializador(Empleado.getAllEmpleados(), "Empleado");
        deserializador(Empresa.getAllEmpresas(), "Empresa");
        deserializador(Negocio.getNegocios(), "Negocio");
        deserializador(Venta.getAllVenta(), "Venta");
        deserializador(Promocion.getAllPromocion(), "Promocion");
        deserializador(Servicio.getAllServicios(), "Servicio");
        deserializador(Evento.getAllEventos(), "Evento");
    }
}
