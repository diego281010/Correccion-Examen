public class DronEmergencia extends Dron{
    private final double recargoUrgencia;
    private int nivelPrioridad;

    public DronEmergencia() {
        super("EMG001", "Emergente", 8, 3, 1, 8);
        this.recargoUrgencia = 5;
        this.nivelPrioridad = 0;
    }

    public void setNivelPrioridad(int nivel) {
        if (nivel == 1) {
            nivelPrioridad = nivel;
        } else if (nivel == 2) {
            nivelPrioridad = nivel;
        } else if (nivel == 3) {
            nivelPrioridad = nivel;
        } else {
            System.out.println("Nivel de prioridad incorrecto.");
            nivelPrioridad = 0;
        }
    }

    @Override
    double calcularCostoEntrega() {
        if (validarDatos()) {
            return costoBase + (getDistanciaKm() * 0.9) + (recargoUrgencia);
        } else {
            return 0;
        }
    }

    @Override
    boolean validarDatos() {
        return getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && (nivelPrioridad != 0 && nivelPrioridad < 4 && nivelPrioridad > 0);
    }

    public void mostrarInfo() {
        System.out.println("DRON EMERGENCIA: ");
        super.mostrarInfo();
        if (calcularCostoEntrega() != 0) {
            System.out.println("Costo: " + calcularCostoEntrega());
        } else {
            System.out.println("No se pueden cambiar los datos");
        }
    }
}








