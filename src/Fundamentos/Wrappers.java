package Fundamentos;



public class Wrappers {
    public static void main(String[] args) {

        // bite
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000");
        Long l = 10000000L;
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(i*3);
        System.out.println(l/3);

        Float f =123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);


        Boolean bo= Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        System.out.println(l/3.0);
        Character c= '#';
        System.out.println(c.toString());
        System.out.println(c+"...");







    }
}
