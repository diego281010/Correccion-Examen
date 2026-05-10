public class DronLiviano extends Dron{
    private final double limiteHoras;

    public DronLiviano() {
        super("LIV001", "LivianoX", 12.5, 2.3, 1.5, 3);
        this.limiteHoras = 2;
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    @Override
    double calcularCostoEntrega() {
        if (validarDatos()) {
            return costoBase + (getDistanciaKm() * 0.5) + (getPesoPaquete() * 0.8) + (getHorasVuelo() * 1.5);
        } else {
            return 0;
        }
    }

    @Override
    boolean validarDatos() {
        return getPesoPaquete() <= 5 && getLimiteHoras() <= getHorasVuelo();
    }

    public void mostrarInfo() {
        System.out.println("DRON LIVIANO: ");
        super.mostrarInfo();
        if (calcularCostoEntrega() != 0) {
            System.out.println("Costo: " + calcularCostoEntrega());
        } else {
            System.out.println("No se pueden cambiar los datos");
        }
    }
}
