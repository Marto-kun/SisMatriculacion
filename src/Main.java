import java.net.StandardSocketOptions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("PCY2704","Kia", "Picanto", "Crema",
                1.5, 83, 1);
        //Vehiculo v2 = new Vehiculo();

        Vehiculo.Duenio duenioV1 = v1.new Duenio("Juan", "0650087331", 25);

        v1.informacion();
        double acv1 = v1.aceleracion();
        System.out.println("Aceleracion: " + acv1);

        v1.infoDuenio();



    }
}

