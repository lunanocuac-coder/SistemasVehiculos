public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("ABC123", "Toyota", 180, 4);
        Moto moto = new Moto("XYZ789", "Yamaha", 120, "Deportiva");
        Camion camion = new Camion("LMN456", "Volvo", 140, 10);

        carro.mover();
        System.out.println("Peaje carro: " + carro.calcularPeaje());

        moto.mover();
        System.out.println("Peaje moto: " + moto.calcularPeaje());

        camion.mover();
        System.out.println("Peaje camion: " + camion.calcularPeaje());
    }
}
