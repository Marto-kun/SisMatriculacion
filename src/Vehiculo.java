public class Vehiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private double cilindraje;
    private double potencia;
    private int tipoCombustible;                    //1) Gasolina, 2) Diesel


    public Vehiculo(String marca, String modelo, String placa, String color,
                    double cilindraje, double potencia, int tipoCombustible){

        //this se refiere al objeto actual y no a la clase en si
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;

    }

    public double aceleracion() {
        double ac;
        if (tipoCombustible == 1) {
            ac = potencia * cilindraje * 3;
        } else {
            ac = potencia * cilindraje;
        }
        return ac;
    }


     void informacion() {
        System.out.println("---- Informacion Vehiculo ----");
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nColor: " + color);

    }


    public class Duenio{
        private String nombre;
        private String cedula;
        private int edad;

        public Duenio(String nombre, String cedula, int edad){
            this.nombre = nombre;
            this.cedula = cedula;
            this.edad = edad;
        }

    }

    void infoDuenio(){
        System.out.println("Nombre: ");
        System.out.println("Cedula: ");
        System.out.println("Edad: ");
    }

}
