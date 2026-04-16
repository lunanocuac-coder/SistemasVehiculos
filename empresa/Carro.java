class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String placa, String marca, double velocidadMaxima, int numeroPuertas) {
        super(placa, marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El carro se mueve por carretera");
    }

    @Override
    public double calcularPeaje() {
        return 10000;
    }
}
