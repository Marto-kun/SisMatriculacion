
import java.util.Scanner;

public class Sistema {

    private Scanner sc;

    public Sistema(){
        sc = new Scanner(System.in);
    }


    public Vehiculo crearVehiculo(){
        System.out.println("Ingrese los datos de del vehiculo: ");
        System.out.println("Marca: ");
        String marca = sc.next();

        System.out.println("Modelo: ");
        String modelo = sc.next();

        System.out.println("Placa: ");
        String placa = sc.next();

        System.out.println("Color: ");
        String color = sc.next();

        System.out.println("Cilindraje: ");
        double cilindraje = sc.nextDouble();

        System.out.println("Potencia: ");
        double potencia = sc.nextDouble();

        System.out.println("Tipo de Combustible: ");
        int comb = sc.nextInt();

        Duenio du = this.crearDuenio();

        Vehiculo vi = new Vehiculo(marca, modelo, placa, color, cilindraje, potencia, comb, du);

        return vi;
    }

    public Duenio crearDuenio(){
        System.out.println("Ingrese los datos del dueño: ");
        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println("Cedula: ");
        String cedula = sc.next();

        System.out.println("Edad: ");
        int edad = sc.nextInt();

        Duenio du = new Duenio(nombre, cedula, edad);

        return du;
    }


}
