package exerciciosDio;

public class CarroTestee {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "fiat";
        carro.modelo = "siena";
        carro.ano = 2020;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
    }
}
