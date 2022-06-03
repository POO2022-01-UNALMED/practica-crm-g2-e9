package gestionMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import baseDatos.Deserializador;
import baseDatos.Serializador;
import gestionApp.Evento.Correo;
import gestionApp.Evento.Llamada;
import gestionApp.Evento.Reunion;
import gestionApp.Venta;
import gestionApp.personas.Cliente;
import gestionApp.personas.Empleado;
import gestionApp.servicios.Registro;
import gestionApp.servicios.Servicio;
import gestionMain.uiMain.*;
import gestionApp.Empresa;
import gestionApp.Negocio;
import gestionApp.Evento.Evento;


public class  Interfaz {


    public static void main(String[] args) {
        Deserializador.serializacion();

        System.out.println(Servicio.getAllServicios().size());

        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ PRINCIPAL\s|
                        ---------------------

                        1. Empresa
                        2. Cliente
                        3. Empleado
                        4. Registros
                        5. Negocios
                        6. Servicios
                        7. Promoción
                        8. Salir
                        ingrese opción:\s""");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1: uiEmpresa.empresa(); break;//activa menú empresa
                    case 2: uiCliente.clientes();break; //activa menú cliente
                    case 3: uiEmpleado.empleado(); break;//activa menú empleado
                    case 4: uiRegistro.registros(); break; //activa menú negocios
                    case 5: uiNegocio.negocios(); break; //activa menú registros
                    case 6: servicios(); break; //activa menú servicios
                    case 7: uiPromocion.promocion();
                    case 8: Serializador.serializacion(); break; //Salir

                }
            }catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        }while (opcion != 7);
        //Deserializador.serializacion();


    }





    public static  void servicios() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ SERVICIOS\s|
                        ---------------------
                        1. Agregar servicios:\s
                        2. Buscar servicio:\s
                        3. Eliminar servicio:\s
                        4. Lista de Servicios:\s
                        5. Volver\s
                        ingrese opción:\s""");

                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: registarServicios(); break;
                    case 2:buscarServicios(); break;
                    case 3:eliminarServicio();break;
                    case 4: listaServicios();break;
                    case 5: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);
    }

        public static  void registarServicios() {

            System.out.print("\tREGISTRO SERVICIOS\s");
            System.out.print("\nIngrese el Nombre del Servicio: ");
            String nombreServicio = FuncionesInterfaz.entradaString();;

            System.out.print("\nIngrese Valor del producto del servicio: ");
            int valorProductoServicios = FuncionesInterfaz.entradaInt();

            System.out.print("\nIngrese tipo de Servicio: ");
            String tipoServicio = FuncionesInterfaz.entradaString();

            System.out.print("\nIngrese descripcion del Servicio: ");
            String descripcionServicio = FuncionesInterfaz.entradaString();

            Registro.registrarServicios(nombreServicio, valorProductoServicios, tipoServicio, descripcionServicio);


            
        }
        public static  void buscarServicios() {
            System.out.print("\n BUSCAR SERVICIO\n");
            Registro.listaServicios();
            System.out.print("\nIngrese el Nombre del Servicio que desea Buscar: ");
            String idServicio = FuncionesInterfaz.entradaString();
            Registro.infoServicio(idServicio);

        }
        public static void eliminarServicio() {
            System.out.print("\n ELIMINAR SERVICIO\n");
            Registro.listaServicios();
            System.out.print("\nIngrese el Nombre del Servicio que desea eliminar: ");
            String idServicio = FuncionesInterfaz.entradaString();
            Servicio servicioBuscado = Registro.buscarServicios(idServicio);
            int indice = Servicio.getAllServicios().indexOf(servicioBuscado);
            String servicioEliminado = servicioBuscado.toString();
            if (!Servicio.getAllServicios().isEmpty()){
                Servicio.getAllServicios().remove(indice);
                System.out.println("\t El siguiente servicio se a eliminado satisfactoriamente mi rey:\n"+servicioEliminado);}
            else
                System.out.println("No existe el servicio");
        
        }
        public static void listaServicios() {
            System.out.print("\n LISTA DE SERVICIOS\n");
            Registro.listaServicios();
        }


    public static  void promocion() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        do {
            try {
                System.out.print("""
                        ---------------------
                        |\t MENÚ PROMOCIÓN\s|
                        ---------------------
                        1. Agregar promocion:\s
                        2. Buscar promocion:\s
                        3. Eliminar promocion:\s
                        4. Volver\s
                        ingrese opción:\s""");

                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        registrarPromocion();
                        break;
                    case 2:
                        buscarPromocion();
                        break;
                    case 3:
                        eliminarPromocion();
                        break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 4);
    }
        public static  void registrarPromocion() {
            System.out.print("\n REGISTRAR PROMOCION\n");
        }
        public static  void buscarPromocion() {
            System.out.print("\n BUSCAR PROMOCION\n");
        }
        public static  void eliminarPromocion() {
            System.out.print("\n ELIMINAR PROMOCION\n");
        }

    public static void Funcionalidades(){
        Scanner scan = new Scanner(System.in);
        int opcion1;
        do {
            try {
                System.out.print("\t MENU FUNCIONALIDADES " + "\n1. Match: " + "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1:
                        //Funcion que permita match entre clientes y Empresa o empleado
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);

    }

	}



  




