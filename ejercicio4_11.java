import java.util.Scanner;
public class ejercicio4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número A: ");
        int a = input.nextInt();
        System.out.print("Ingrese el número B: ");
        int b = input.nextInt();
        System.out.print("Ingrese el número C: ");
        int c = input.nextInt();
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        System.out.println("El número más grande es: " + mayor);
    }
}
