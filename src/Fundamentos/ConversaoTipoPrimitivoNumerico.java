package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a= 1; // conversão implícita
        System.out.println(a);
        float b = (float)1.12345678888;  //conversão explícita (Cast)
        System.out.println(b);
        int c = 4;
        byte d = (byte) c;
        System.out.println(d);
        int w = 340;
        byte y= (byte) w;
        System.out.println(y);
        double e = 1;
        int f = (int) e;
        System.out.println(f);
        double u = 1.9999999;
        int o = (int) u;
        System.out.println(o);

    }
}
