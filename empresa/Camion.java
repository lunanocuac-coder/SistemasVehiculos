class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, double velocidadMaxima, double capacidadCarga) {
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión transporta carga pesada");
    }

    @Override
    public double calcularPeaje() {
        return 20000 + (capacidadCarga * 1000);
    }
}
