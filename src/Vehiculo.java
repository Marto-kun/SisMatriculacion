public class Vehiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private double cilindraje;
    private double potencia;
    private int tipoCombustible;                    //1) Gasolina, 2) Diesel
    private Duenio duenio;


    public Vehiculo(String marca, String modelo, String placa, String color,
                    double cilindraje, double potencia, int tipoCombustible,
                    String nombreDu, String cedulaDu, int edadDu){

        //this se refiere al objeto actual y no a la clase en si
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
        this.duenio = new Duenio(nombreDu, cedulaDu, edadDu);

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

    void infoDuenio(){
        System.out.println("---- Informacion Duenio ----");
        this.duenio.info();
    }


}
