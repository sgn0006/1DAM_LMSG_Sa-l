// Conversor de euros a dolares (pedimos importe al usuario y devolvemos el importe convertido)
public class Ejercicio10 {
    public static void main(String[] args) {
        float euros = Float.parseFloat(System.console().readLine("Introduce la cantidad en euros: "));
        float dolares = euros * 1.10f;
        System.out.println(euros + " euros son " + dolares + " dólares");
    }
}
