public class Duenio {
    private String nombre;
    private String cedula;
    private int telefono;
    private int anio;
    private int mes;
    private int dia;


    public Duenio(String nombre, String cedula, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Duenio(Duenio duenio) {

        this.nombre = duenio.nombre;
        this.cedula = duenio.cedula;
        this.telefono = duenio.telefono;

    }

    public Duenio(String nombre, String cedula, int telefono, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    void info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Telefono: " + telefono);
    }

    public int calcularEdad() {

        int anioAc = 2026;
        int mesAc = 4;
        int diaAc = 6;
        int fechaAcDias = anioAc * 365 + mesAc * 30 + diaAc;
        int fechaUsrDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaAcDias - fechaUsrDias;
        int edad = edadDias / 365;
        return edad;
    }

    public int calcularEdad(int anioAc, int mesAc, int diaAc) {

        int fechaAcDias = anioAc * 365 + mesAc * 30 + diaAc;
        int fechaUsrDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaAcDias - fechaUsrDias;
        int edad = edadDias / 365;
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}




