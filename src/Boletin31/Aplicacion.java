package Boletin31;

public class Aplicacion {
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        Clase2 obj2 = new Clase2();
        Clase3 obj3 = new Clase3();
        Clase4 obj4 = new Clase4();

        System.out.println("obj1.test = "+ obj1.test());

        System.out.println("obj1.result1 = " + obj1.result1());

        System.out.println("obj2.test = "+obj2.test());

        System.out.println("obj2.result1 = "+obj3.result1());

        System.out.println("obj3.test = " +obj3.test());

        System.out.println("obj4.result1 = "+obj4.result1());

        System.out.println("obj3.result2 = " +obj3.result2());

        System.out.println("obj4.result2 = " +obj4.result2());

        System.out.println("obj3.result3 = " +obj3.result3());

        System.out.println("obj4.result3 = " +obj4.result3());
    }




}
