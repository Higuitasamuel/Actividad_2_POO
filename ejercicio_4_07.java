import java.util.Scanner;
public class ejercicio_4_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor A: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el valor B: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es igual a " + b);
        }
    }    
}
