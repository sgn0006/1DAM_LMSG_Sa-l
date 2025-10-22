    //Como preguntar por consola 

        //Si la respuesta es un texto (String):
        //String respuesta = System.console().readLine("Aqui la preguna");

        //Si la respuesta es un número entero (int):
        //int respuesta = Integer.parseInt(System.console().readLine("Aqui la pregunta"));

        // Si la respuesta es un número decimal (float):
        //float respuesta = Float.parseFloat(System.console().readLine("Aqui la pregunta"));

 // int edad = Integer.parseInt(System.console().readLine("¿Cuantos años tienes?"));

 // Un programa que te pide tus notas de 1er por pantalla e imprime un 'boletín'
  public class  Ejercicio6 {

    public static void main(String[] args) {

int notaprogramación = Integer.parseInt(System.console().readLine("¿Que nota has sacado en programación?"));
         int notabasesDatos = Integer.parseInt(System.console().readLine("¿Que nota has sacado en bases de datos?"));
         int notasistemas = Integer.parseInt(System.console().readLine("¿Que nota has sacado en sistemas?"));
         int notaEntorno = Integer.parseInt(System.console().readLine("¿Que nota has sacado en entorno?"));

         System.out.println("Boletín de 1T");
         System.out.println("Programación: " + notaprogramación);
         System.out.println("Bases de datos: " + notabasesDatos);
         System.out.println("Sistemas infotmáticos: " + notasistemas);
         System.out.println("Entorno: " + notaEntorno);

            float media = (notaprogramación + notabasesDatos + notasistemas + notaEntorno) / 4f;
            System.out.println("Tu nota media es: " + media);

    }

    
   

  }


