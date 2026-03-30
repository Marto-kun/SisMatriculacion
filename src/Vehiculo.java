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

    public Vehiculo(){
        //Constructor vacio
    }

    public Vehiculo(String marca, String modelo, String placa, String color,
                    double cilindraje, double potencia, int tipoCombustible, Duenio duenio){

        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindraje = cilindraje;
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
        this.duenio = duenio;
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
