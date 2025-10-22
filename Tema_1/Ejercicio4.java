/*Declara una variable con el nombre del cliente, otra con el precio de un billete de tren y otra con la cantidad de billetes que quiere comprar.
Luego calcula e imprime el coste total junto con toda la información necesaria. 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        String nombre = "Vero";
        float precioBillete = 2f; 
        int cantidadBilletes = 3;

        cantidadBilletes = 6; //Cambiar el valor a la variable ya creada.


        float costeTotal= precioBillete * cantidadBilletes; 
        System.out.println("Cliente: " + nombre);
        System.out.println("Precio del billete: " + precioBillete + " euros");
        System.out.println("Cantidad de billetes: " + cantidadBilletes);
        System.out.println("Coste total: " + costeTotal + " euros");
    }
    
}
