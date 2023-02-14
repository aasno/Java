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
    }
}
