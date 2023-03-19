import java.util.Scanner;
public class ejercicio4_13 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compra, descuento;
        System.out.println("¿Cuánto fue el valor de la compra?");
        compra = sc.nextDouble();
        System.out.println("¿Cuál es el color de la bola?");
        
        String bolita = sc.next();
        
        if (bolita.equals("BLANCO") || bolita.equals("blanco")){
            descuento=0;
            } else if (bolita.equals("VERDE")|| bolita.equals("verde")){
            descuento = 0.1;
            } else if (bolita.equals("AMARILLO")|| bolita.equals("amarillo")){
            descuento = 0.25;
            } else if (bolita.equals("AZUL")|| bolita.equals("azul")){
            descuento= 0.5;
        } else {
            descuento= 1;
        }
        double ValPagar = compra-compra*descuento;
        System.out.println("El cliente deberá pagar: $"+ ValPagar);                 
    }
}
