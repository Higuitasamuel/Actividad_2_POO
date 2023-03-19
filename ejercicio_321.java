import java.util.Scanner;
public class ejercicio_321 {
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double lado1, lado2, lado3, area,sp, perimetro;
    System.out.println("ingresa el primer lado del triangulo");
    lado1 = sc.nextDouble();
    System.out.println("ingresa el segundo lado del triangulo");
    lado2 = sc.nextDouble();
    System.out.println("ingresa el tercer lado del triangulo");
    lado3 = sc.nextDouble();
    perimetro = lado1 + lado2 + lado3;
    sp = (lado1 + lado2 + lado3)/2;
    area = (Math.sqrt(sp*(sp-lado1) * (sp-lado2) * (sp-lado3)));
    System.out.println("EL area del triangulo es: "+ area);
    System.out.println("El perimetro del triángulo es: "+ perimetro);
    System.out.println("El semiperimetro del triángulo es: "+ sp);
  }
}
