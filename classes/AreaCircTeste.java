package classes;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.8);
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(11);
        System.out.println(a2.area());

        System.out.println(AreaCirc.area(100));
    }
}
