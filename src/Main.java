import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int opc;
        Sistema sis = new Sistema();
        Vehiculo v1 = sis.crearVehiculo();

        do {
            opc = Sistema.menu();

            switch (opc) {
                case 1:
                    sis.imprimirInfoV(v1);
                    break;
                case 2:
                    sis.actualizarVehiculo(v1);
                    break;

                case 3:
                    sis.imprimirAceleracion(v1);
                    break;

                case 4:
                    sis.imprirEdadDuenio(v1);
                    break;

                case 5:
                    System.out.println("Gracias por usar nuestro sistema. Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida! Regresando al Menú Principal...");
                    System.out.println("--------------------");
                    break;
            }
        } while (opc != 5);


        //Llamada al metodo toString()
        System.out.println(v1);


    }
}

