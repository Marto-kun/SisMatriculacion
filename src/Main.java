public class Main {
    public static void main(String[] args) {


        Vehiculo v1 = new Vehiculo("PCY2704","Kia", "Picanto", "Crema",
                1.5, 83, 1,"Pedro","0650087331",18);
        //Vehiculo v2 = new Vehiculo();



        v1.informacion();
        double acv1 = v1.aceleracion();
        System.out.println("Aceleracion: " + acv1);


        v1.infoDuenio();


    }
}

