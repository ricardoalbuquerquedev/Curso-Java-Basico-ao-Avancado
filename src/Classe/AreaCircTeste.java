package Classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc area = new AreaCirc(10);
       // area.pi = 1000000;
        System.out.println(area.area());
        AreaCirc a2= new AreaCirc(5);
        //a2.pi = 0;
        //AreaCirc.PI = 3.1415;
        System.out.println(area.area());
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);



    }
}
