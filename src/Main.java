import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc;
        Sistema sis = new Sistema();        //Creacion del objeto tipo Sistema
        //Vehiculo v1 = new Vehiculo   //Creacion del objeto tipo Vehiculo

        //Vehiculo[] vehiculos = new Vehiculo[5];

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        int cont = 0, indice = 0;

        do {
            opc = Sistema.menu();

            switch (opc) {
                case 1:
                    //Crear Vehiculo
                    //vehiculos[cont] = sis.crearVehiculo();
                    //cont++;
                    listaVehiculos.add(sis.crearVehiculo());
                    break;

                case 2:
                    //Actualizar Info Vehiculo
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.actualizarVehiculo(listaVehiculos.get(indice));
                    break;

                case 3:
                    //Imprimir la aceleracion del vehiculo
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.imprimirAceleracion(listaVehiculos.get(indice));
                    break;

                case 4:
                    //Imprimir la edad del dueño
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.imprirEdadDuenio(listaVehiculos.get(indice));
                    break;

                case 5:
                    //Salir del sistema
                    System.out.println("Gracias por usar nuestro sistema. Saliendo...");
                    break;

                default:
                    //Opcion invalida
                    System.out.println("Opcion invalida! Regresando al Menú Principal...");
                    System.out.println("--------------------");
                    break;
            }
        } while (opc != 5);  //Control del bucle principal
    }
}

