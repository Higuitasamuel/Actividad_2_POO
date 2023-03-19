import java.util.Scanner;
public class ejercicio4_23 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double b = entrada.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double c = entrada.nextDouble();
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene solución real");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones de la ecuación son: x = " + x1 + " y x= " + x2);
        }
    }
}
