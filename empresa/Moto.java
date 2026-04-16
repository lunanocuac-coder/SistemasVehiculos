class Moto extends Vehiculo {
    private String tipo;

    public Moto(String placa, String marca, double velocidadMaxima, String tipo) {
        super(placa, marca, velocidadMaxima);
        this.tipo = tipo;
    }

    @Override
    public void mover() {
        System.out.println("La moto se mueve rápidamente");
    }

    @Override
    public double calcularPeaje() {
        return 5000;
    }
}
