
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

    void imprimirInfoV(Vehiculo vehi){
        System.out.println("----Informacion Vehiculo ----");
        System.out.println("Marca: "+ vehi.getMarca());
        System.out.println("Modelo: "+ vehi.getModelo());
        System.out.println("Placa: "+ vehi.getPlaca());
        System.out.println("Color: "+ vehi.getColor());
        System.out.println("Cilindraje: "+ vehi.getCilindraje());
        System.out.println("Potencia: "+ vehi.getPotencia());

        if (vehi.getTipoCombustible() == 1){
            System.out.println("Combustible: Gasolina");
        }else {
            System.out.println("Combustible: Diesel");
        }

        System.out.println("---- Información Dueño ----");
        System.out.println("Nombre: "+ vehi.getDuenio().getNombre());
        System.out.println("Cedula: "+ vehi.getDuenio().getCedula());
        System.out.println("Edad: "+ vehi.getDuenio().getEdad());
    }

    void imprimirAceleracion(Vehiculo vehi){
        System.out.println("---- Aceleración ----");
        System.out.println(vehi.aceleracion() + " HP/L");
    }

    void actualizarVehiculo(Vehiculo vehi){

        System.out.println("Actualice los datos del vehiculo: ");
        System.out.println("Marca: ");
        String marca = sc.next();
        vehi.setMarca(marca);

        System.out.println("Modelo: ");
        String modelo = sc.next();
        vehi.setModelo(modelo);

        System.out.println("Placa: ");
        String placa = sc.next();
        vehi.setPlaca(placa);

        System.out.println("Color: ");
        String color = sc.next();
        vehi.setColor(color);

        System.out.println("Cilindraje: ");
        double cilindraje = sc.nextDouble();
        vehi.setCilindraje(cilindraje);

        System.out.println("Potencia: ");
        double potencia = sc.nextDouble();
        vehi.setPotencia(potencia);

        System.out.println("Tipo de Combustible: ");
        int comb = sc.nextInt();
        vehi.setTipoCombustible(comb);

        Duenio du = this.crearDuenio();
        vehi.setDuenio(du);

    }

}
