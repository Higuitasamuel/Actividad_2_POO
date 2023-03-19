import java.util.Scanner;
public class ejercicio4_14 {
        public static void main(String[] args) { 
        double ventasTotales, salarioVendedor;
        double[] salarios = new double[3];
        double[] ventas = new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese salario de los vendedores: ");
        salarioVendedor = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 1: ");
        ventas[0] = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        ventas[1] = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        ventas[2] = sc.nextDouble();
        ventasTotales = ventas[0] + ventas[1] + ventas[2];
        for (int i = 0; i < 3; i++) {
            if (ventas[i] > (ventasTotales * 0.33)) {
                salarios[i] = salarioVendedor + (salarioVendedor * 0.20);
            } else {
                salarios[i] = salarioVendedor;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("El salario del departamento " + (i + 1) + " es: " + salarios[i]);
        }
    }
}
