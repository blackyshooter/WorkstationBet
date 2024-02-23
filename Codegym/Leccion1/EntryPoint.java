package mx.com.codegym.lesson01;

/*
    Esta será la clase que arrancará nuestro sistema
    de la empresa Codegym
 */
public class EntryPoint {

    public static void main(String[] args) {

        Empleado jordan = new Empleado();
        jordan.nombre = "Jordan Alberto";
        jordan.idEmpleado  = 1;
        jordan.correoElectronico = "jordan.saenz@codegym.com";
    }

}
