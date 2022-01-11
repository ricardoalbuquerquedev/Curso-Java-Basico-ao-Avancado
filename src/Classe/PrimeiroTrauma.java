package Classe;

public class PrimeiroTrauma {
    int a = 3; //sem mexer aqui
    static int b = 4;
    public static void main(String[] args) {
        PrimeiroTrauma p = new PrimeiroTrauma(); //criei uma instância
        System.out.println(p.a);
        System.out.println(b); // aqui imprimi direto pq int b está estático
    }
}
