package baseDatos;

import gestionApp.Evento.*;
import gestionApp.personas.*;
import java.io.*;

public class Serializador {
    private static File rutaTemp = new File(System.getProperty("user.dir")+"//baseDatos//temp");
    public static void serializar(Cliente cliente){
        FileOutputStream fos;
        ObjectOutputStream oos;
        File[] docs = rutaTemp.listFiles();
        PrintWriter pw;

        for (File file: docs){
            try {
                pw = new PrintWriter(file);

            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }

        for (File file: docs){
            if (file.getAbsolutePath().contains("clientes")){
                try{
                    fos = new FileOutputStream(file);
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(Cliente.getAllClientes());
                } catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
