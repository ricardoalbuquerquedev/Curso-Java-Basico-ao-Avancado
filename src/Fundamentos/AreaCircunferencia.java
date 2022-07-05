package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4; // o sinal de igual é simbolo de atribuição
        final double PI = 3.14159;
        double area = PI* raio* raio;
        System.out.println(area);
        raio = 10;
        area = PI* raio * raio;
        System.out.println("Area=" + area);

    }
}
