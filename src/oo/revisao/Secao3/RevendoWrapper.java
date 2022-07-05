package oo.revisao.Secao3;

public class RevendoWrapper {
    public static void main(String[] args) {
        // os wrappers são a versão orientada a objeto dos tipos primitivos
        // bite
        Byte b = 100;
        Short s= 1000;
        Integer i= 10000;
        Long l= 100000L;         // quando escrevo em letra maiuscula trata-se de classe qd minusc. eh tipoprimitiv
        Integer.parseInt("10000");  // passando de
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);

        Float f = 123.10F; // no Float é necessário colocar o F no final p saber q eh Float
        System.out.println(f);
        Double d = 1234.5678;
        System.out.println(d);
        Boolean bo= Boolean.parseBoolean("true"); // consegui converter uma String para um valor boleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase()); // converti um valor boleano p uma String e aumentei letra
        Character c = '?';  // corresponde ao char - tipo primitivo
        System.out.println(c.toString());   // converter um character em uma String.

    }
}
