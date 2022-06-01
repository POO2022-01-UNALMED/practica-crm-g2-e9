package baseDatos;

import gestionApp.personas.*;

import java.io.*;
import java.util.ArrayList;

public class Deserializador {
    private static  File rutaTemp = new File("practica-crm-g2-e9\\baseDatos\\temp");
    public static void deserializar(Cliente cliente){
        File[] docs = rutaTemp.listFiles();
        FileInputStream fis;
        ObjectInputStream ois;

        for (File file: docs){
            if (file.getAbsolutePath().contains("clientes")){
                try {
                    fis = new FileInputStream(file);
                    ois = new ObjectInputStream(fis);
                    Cliente.setAllClientes((ArrayList<Cliente>) ois.readObject());
                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                } catch (ClassNotFoundException e){
                    e.printStackTrace();
                }
            }else if (file.getAbsolutePath().contains("clientes")){

                try{
                    fis = new FileInputStream(file);
                    ois = new ObjectInputStream(fis);
                    Cliente.setAllClientes((ArrayList<Cliente>) ois.readObject());
                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e){

                } catch (ClassNotFoundException e){
                    e.printStackTrace();
                }
            }

        }

    }
}
