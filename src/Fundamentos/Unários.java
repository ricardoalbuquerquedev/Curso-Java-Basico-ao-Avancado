package Fundamentos;

public class Unários {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        a++;
        a--;
        ++b;
        --b;
        System.out.println(a);
        System.out.println(b);
        // vamos misturar
        System.out.println(++a==b--);
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
    }
}
