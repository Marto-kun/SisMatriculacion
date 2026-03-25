public class Duenio {
    private String nombre;
    private String cedula;
    private int edad;

    public Duenio(String nombre, String cedula, int edad){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    void info(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
    }

}




