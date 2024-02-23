package mx.com.codegym.lesson02;

public class IntegerExample {

    public static void main(String[] args) {
        String dia = "jueves";
        String numero = "123";
        System.out.println(dia);

        int num1 = Integer.parseInt(numero);
        int num2 = Integer.parseInt("456");
        //System.out.println(numero + "456");
        System.out.println(num1 + Integer.parseInt("456") );
        //System.out.println(num1 + num2 );
    }

}
