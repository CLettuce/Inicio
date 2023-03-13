import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner Texto = new Scanner(System.in);

        System.out.println("Escriba su nombre: ");
        String nombre = Texto.nextLine();
        System.out.printf("Un placer: %s, Quiero saber una cosa más si no es mucha molestia.\n", nombre );
        System.out.println("Escribe tu edad:");
        int edad = Texto.nextInt();
        System.out.printf("Oh increible %s, tu edad es de %d años", nombre, edad);
    }
}
