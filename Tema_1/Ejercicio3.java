/*Creamos variable con precio de un producto, otra con dinero que paga el cliente y el programa imprime  cuánto debe devolver el dependiente al cliente
 * Imprime rextos para que por consola se entienda claramente lo que se está mostrando.
 */
public class Ejercicio3 {

    public static void main(String [] args) {
        float precio = 12.99f;
        float dinero = 20.00f;
        float cambio = dinero - precio ;
        System.out.println("El precio del producto es:"+ precio + " euros");
        System.out.println("El cliente paga con:"+ dinero + " euros");
        System.out.println("El cambio a devolver al cliente es:"+ cambio + " euros");
    }
}