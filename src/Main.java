import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================DRONES================");

        System.out.println("Ingrese el código: ");
        String codigo = sc.nextLine();

        System.out.println("Ingrese el modelo: ");
        String modelo = sc.nextLine();

        System.out.println("Ingrese la distancia: ");
        double distancia = sc.nextDouble();


        System.out.println("Ingrese la peso: ");
        double peso = sc.nextDouble();

        System.out.println("Ingrese la horas de vuelo: ");
        double hora = sc.nextDouble();

        System.out.println("Tipo de dron: ");
        System.out.println("1. Liviano ");
        System.out.println("2. Carga ");
        System.out.println("3. Emergencia ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Dron d1 = new DronLiviano();
                d1.setCodigo(codigo);
                d1.setModelo(modelo);
                d1.setDistanciaKm(distancia);
                d1.setPesoPaquete(peso);
                d1.setHorasVuelo(hora);

                System.out.println("============INFORMACIÓN============\n");
                d1.mostrarInfo();
                break;
            case 2:
                Dron d2 = new DronCarga();
                d2.setCodigo(codigo);
                d2.setModelo(modelo);
                d2.setDistanciaKm(distancia);
                d2.setPesoPaquete(peso);
                d2.setHorasVuelo(hora);
                System.out.println("============INFORMACIÓN============\n");
                d2.mostrarInfo();
                break;
            case 3:
                Dron d3 = new DronEmergencia();
                d3.setCodigo(codigo);
                d3.setModelo(modelo);
                d3.setDistanciaKm(distancia);
                d3.setPesoPaquete(peso);
                d3.setHorasVuelo(hora);

                System.out.println("============INFORMACIÓN============\n");
                d3.mostrarInfo();
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
}