
//Definicion de la clase
public class Vehiculo {

    //Atributos privados de la clase
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private double cilindraje;
    private double potencia;
    private int tipoCombustible;                    //1) Gasolina, 2) Diesel
    private Duenio duenio;


    //Constructor con todos los atributos de vehiculo y duenio
    public Vehiculo(String marca, String modelo, String placa, String color,
                    double cilindraje, double potencia, int tipoCombustible,
                    String nombreDu, String cedulaDu, int edadDu) {

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

    public Vehiculo() {
        //Constructor vacio
    }

    //Constructor con parametros Duenio duenio
    public Vehiculo(String marca, String modelo, String placa, String color,
                    double cilindraje, double potencia, int tipoCombustible, Duenio duenio) {

        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
        this.duenio = duenio;
    }

    //Metodo para calcular aceleracion del vehiculo
    public double aceleracion() {
        double ac;
        if (tipoCombustible == 1) {
            ac = potencia * cilindraje * 3;
        } else {
            ac = potencia * cilindraje;
        }
        return ac;
    }

    public double aceleracion(Vehiculo vehi) {

        double pot = vehi.getPotencia();
        int comb = vehi.getTipoCombustible();
        double masa;
        double velocidad;

        if (comb == 1) {
            masa = 1200;
            velocidad = 25.5;
        } else {
            masa = 2500;
            velocidad = 30.5;
        }

        double acel = (pot / (masa * velocidad));

        return acel;
    }


    @Override
    public String toString() {
        return "El vehiculo tiene las placas: " + this.placa;
    }

    //Getters y Setters para los atributos del vehiculo
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
