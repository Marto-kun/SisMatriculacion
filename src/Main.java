public class Main {
    public static void main(String[] args) {

        Sistema sis = new Sistema();


        Vehiculo v1 = sis.crearVehiculo();
        sis.imprimirInfoV(v1);
        sis.imprimirAceleracion(v1);
        sis.actualizarVehiculo(v1);
        sis.imprimirInfoV(v1);

        Vehiculo v2 = sis.crearVehiculo();
        sis.imprimirInfoV(v2);
        sis.imprimirAceleracion(v2);
        sis.actualizarVehiculo(v2);
        sis.imprimirInfoV(v2);





    }
}

