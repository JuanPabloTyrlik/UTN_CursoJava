package clase3;

class Tanque {
    private double litros;
    private String combustible;
    private double precioLitro;

    public Tanque(double litros, String combustible, double precioLitro) {
        this.litros = litros;
        this.combustible = combustible;
        this.precioLitro = precioLitro;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPrecioLitro() {
        return precioLitro;
    }

    public void setPrecioLitro(double precioLitro) {
        this.precioLitro = precioLitro;
    }
}
