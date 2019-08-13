import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // convertir una cadena a entero
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        double edad2 = Double.parseDouble("24");
        System.out.println("edad2 = " + edad2);
        // se puede hacer para todos los primitivos
        // la excepcion en la regla es con el char porque no tenemos un parsechar
        
        char c ="hola".charAt(0);
        System.out.println("c = " + c);
        
        var scanner = new Scanner(System.in);
        int edad3 = Integer.parseInt(scanner.nextLine());
        System.out.println("edad3 = " + edad3);
        char caracter = scanner.nextLine().charAt(1);
        System.out.println("caracter = " + caracter);
        
        
        //convertir un tipo de dato primitivo a entero
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

        
    }
}
