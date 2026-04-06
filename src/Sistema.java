//Importar la utilidad de escaner por consola

import java.util.Scanner;

public class Sistema {

    //Atributos privados (tipo Scanner)
    private Scanner sc;

    //Constructor de la clase
    public Sistema() {
        sc = new Scanner(System.in);
    }

    //Metodo de creacion de objeto tipo Vehiculo
    public Vehiculo crearVehiculo() {
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

    //Metodo de creacion de objeto tipo Duenio
    public Duenio crearDuenio() {
        System.out.println("Ingrese los datos del dueño: ");
        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println("Cedula: ");
        String cedula = sc.next();

        System.out.println("Telefono: ");
        int telefono = sc.nextInt();

        System.out.println("Fecha nacimiento ");
        System.out.print("Año: ");
        int anio = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Día: ");
        int dia = sc.nextInt();

        Duenio du = new Duenio(nombre, cedula, telefono);
        du.setEdad(anio, mes, dia);
        //Duenio du = new Duenio(nombre,cedula,telefono,anio,mes,dia);

        return du;
    }

    //Metodo para imprimir info del vehiculo por consola
    void imprimirInfoV(Vehiculo vehi) {
        System.out.println("----Informacion Vehiculo ----");
        System.out.println("Marca: " + vehi.getMarca());
        System.out.println("Modelo: " + vehi.getModelo());
        System.out.println("Placa: " + vehi.getPlaca());
        System.out.println("Color: " + vehi.getColor());
        System.out.println("Cilindraje: " + vehi.getCilindraje());
        System.out.println("Potencia: " + vehi.getPotencia());

        if (vehi.getTipoCombustible() == 1) {
            System.out.println("Combustible: Gasolina");
        } else {
            System.out.println("Combustible: Diesel");
        }

        System.out.println("---- Información Dueño ----");
        System.out.println("Nombre: " + vehi.getDuenio().getNombre());
        System.out.println("Cedula: " + vehi.getDuenio().getCedula());
        System.out.println("Telefono: " + vehi.getDuenio().getTelefono());
    }

    //Metodo para imprimir aceleracion del vehiculo
    void imprimirAceleracion(Vehiculo vehi) {
        System.out.println("---- Aceleración ----");
        System.out.println(vehi.aceleracion() + " HP/L");
    }

    //Metodo para modificar la informacion de un vehiculo ya existente
    void actualizarVehiculo(Vehiculo vehi) {

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

    public void imprirEdadDuenio(Vehiculo vehiculo) {
        System.out.println("La edad del dueño del vehiculo de placas: " +
                vehiculo.getPlaca() +
                " es:" + vehiculo.getDuenio().calcularEdad());
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("---- Menu Principal ----");
        System.out.println("Ingrese la opcion deseada: ");
        System.out.println("1) Imprimir Informacion Vehiculo");
        System.out.println("2) Actualizar Informacion Vehiculo");
        System.out.println("3) Imprimir Aceleracion Vehiculo");
        System.out.println("4) Calcular Edad Duenio");
        System.out.println("5) Salir");
        System.out.print(">>> ");
        opc = sc.nextInt();
        return opc;

    }

}
