import java.util.Scanner;
public class ejercicio4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de inscripción: ");
        int inscripcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer del Scanner
        System.out.print("Ingrese nombre completo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese patrimonio: ");
        double patrimonio = sc.nextDouble();
        System.out.print("Ingrese el estrato: ");
        int estrato = sc.nextInt();
        double pagomatricula = 50000; 
        if (patrimonio > 2000000 & estrato > 3) {
            double incremento = patrimonio * 0.03;
            pagomatricula += incremento;
        }
        System.out.println("El estudiante con numero de inscripcion "+ inscripcion + "y nombre "+nombre +"debera pagar $" + pagomatricula);
    }
}
