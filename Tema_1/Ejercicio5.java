//Programa que te pide tu nombre y te saluda.
public class Ejercicio5 {
    public static void main(String[] args) {
       // System.out.println()
       String nombre = System.console().readLine("¿Como te llamas?");
       System.out.println("Hola" + nombre);

       String apellido = System.console().readLine("¿Cual es tu apellido?");
       System.out.println("Hola " + nombre +  apellido);
    }

}
