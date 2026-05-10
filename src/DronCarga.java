public class DronCarga extends Dron{
    private final double costoKg;

    public DronCarga() {
        super("CAR001", "CargaMax", 45, 20, 3, 6);
        this.costoKg = 1.2;
    }

    public double getCostoKg() {
        return costoKg;
    }

    @Override
    double calcularCostoEntrega() {
        if (validarDatos()) {
            return costoBase + (getDistanciaKm() * 0.7) + (getPesoPaquete() * getCostoKg());
        } else {
            return 0;
        }
    }

    @Override
    boolean validarDatos() {
        return getPesoPaquete() <= 30 && getHorasVuelo() <= 5;
    }

    public void mostrarInfo() {
        System.out.println("DRON CARGA: ");
        super.mostrarInfo();
        if (calcularCostoEntrega() != 0) {
            System.out.println("Costo: " + calcularCostoEntrega());
        } else {
            System.out.println("No se pueden cambiar los datos");
        }
    }
}
