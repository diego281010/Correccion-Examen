abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    public Dron() {
        this.codigo = "";
        this.modelo = "";
        this.distanciaKm = 0;
        this.pesoPaquete = 0;
        this.horasVuelo = 0;
    }

    public Dron(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase) {
        setCodigo(codigo);
        setModelo(modelo);
        setDistanciaKm(distanciaKm);
        setPesoPaquete(pesoPaquete);
        setHorasVuelo(horasVuelo);

        this.costoBase = costoBase;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido.");
        }
    }

    public void setModelo(String modelo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm > 0) {
            this.distanciaKm = distanciaKm;
        } else {
            System.out.println("Distancia inválida.");
        }
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0) {
            this.pesoPaquete = pesoPaquete;
        } else {
            System.out.println("Peso inválido.");
        }
    }

    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0) {
            this.horasVuelo = horasVuelo;
        } else {
            System.out.println("Horas inválidas.");
        }
    }

    public double getCostoBase() {
        return costoBase;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    abstract double calcularCostoEntrega();
    abstract boolean validarDatos();

    void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia: " + distanciaKm);
        System.out.println("Peso: " + pesoPaquete);
        System.out.println("Horas: " + horasVuelo);
    }
}
