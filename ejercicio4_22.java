import java.util.Scanner;
public class ejercicio4_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = entrada.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = entrada.nextInt();
        double salarioMensual = salarioPorHora * horasTrabajadas;
        if (salarioMensual > 450000) {
            System.out.println("El salario mensual de " + nombre + " es de: $" + salarioMensual);
        } else {
            System.out.println(nombre);
        }
    }
}
