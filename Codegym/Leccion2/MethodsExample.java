package mx.com.codegym.lesson02;

public class MethodsExample {
    public static void main(String[] args) {
        Saludo instance = new Saludo();
        instance.saludar();
        instance.saludar("Martin");
        instance.saludar("Martin", "Martinez");
    }

}

