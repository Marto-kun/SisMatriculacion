import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc;
        Sistema sis = new Sistema();        //Creacion del objeto tipo Sistema
        Vehiculo v1 = sis.crearVehiculo();  //Creacion del objeto tipo Vehiculo

        do {
            opc = Sistema.menu();

            switch (opc) {
                case 1:
                    //Imprimir Info Vehiculo
                    sis.imprimirInfoV(v1);
                    break;

                case 2:
                    //Actualizar Info Vehiculo
                    sis.actualizarVehiculo(v1);
                    break;

                case 3:
                    //Imprimir la aceleracion del vehiculo
                    sis.imprimirAceleracion(v1);
                    break;

                case 4:
                    //Imprimir la edad del dueño
                    sis.imprirEdadDuenio(v1);
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


        //Llamada al metodo toString()
        System.out.println(v1);


    }
}

