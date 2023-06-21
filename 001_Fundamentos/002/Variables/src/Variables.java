// Variables en Java

public class Variables {

    public static void main(String[] args) {
        // Notación Camel Case
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        // Inferencia de Tipos (var: a partir de Java version 10)
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        // Reglas
        /* Valores permitido como primer letra al definir el nombre de una variable
        * [a-z]
        * _
        * $
         */
        // Concatenacion de cadenas
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        int i = 3;
        var j = 4;
        System.out.println(i + j); // Suma de numeros
        // Evalua de izquierda a derecha
        System.out.println(i + j + usuario); // 7Juan
        System.out.println(usuario + i + j); // Juan34
        System.out.println(usuario + (i + j)); // Juan7

        // Caracteres especials
        var nombre = "Karla";

        System.out.println("Nueba linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
