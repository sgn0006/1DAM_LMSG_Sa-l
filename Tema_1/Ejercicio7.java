//Pide al usuario que introduzca por consola dos números.
//Despues, el programa imprime por consola el resultado de la suma, resta, multiplicación y división de esos números.
//Haz varias pruebas y aseguurate de que funciona bien.
public class Ejercicio7 {
    public static void main(String[] args) {
        float numero1 = Float.parseFloat(System.console().readLine("Introduce el primer número: "));
        float numero2 = Float.parseFloat(System.console().readLine("Introduce el segundo número: "));

       
 
        System.out.println(" La Suma da : " + (numero1 + numero2));
        System.out.println("La Resta da : " + (numero1 - numero2));
        System.out.println("La Multiplicación da : " + (numero1 * numero2));
        System.out.println("La División da : " + numero1 / numero2);




    }
    
}
