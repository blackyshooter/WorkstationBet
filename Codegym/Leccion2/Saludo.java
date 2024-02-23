package mx.com.codegym.lesson02;

class Saludo {
    void saludar() {
        System.out.println("Hola");
    }

    void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    void saludar(String nombre, String apellidoPaterno) {
        System.out.println("Hola, " + nombre + " " + apellidoPaterno);
    }

}
