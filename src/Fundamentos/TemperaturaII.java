package Fundamentos;

public class TemperaturaII {
    public static void main(String[] args) {
        int fareheim = 87;
        final int AJUSTE = 32;
        double FATOR = 5.0/9.0;
        double celsius = (fareheim- AJUSTE)* FATOR;
        System.out.println(celsius);
    }
}
