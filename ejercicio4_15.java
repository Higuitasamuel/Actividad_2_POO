import java.util.Scanner;
public class ejercicio4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C,D;
        System.out.println("¿Cuál es el peso de la esfera A?");
        A= sc.nextInt();
        System.out.println("¿Cuál es el peso de la esfera B?");
        B= sc.nextInt();
        System.out.println("¿Cuál es el peso de la esfera C?");
        C= sc.nextInt();
        System.out.println("¿Cuál es el peso de la esfera D?");
        D= sc.nextInt();
        if (A==B && A==C){
            if (D>A){
                System.out.println("La esfera D es la diferente y es de mayor peso"); 
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso"); 
            }      
        } else{
            if (A==B && A==D){
                if (C>A){
                    
                    System.out.println("La esfera C es la diferente y es de mayor peso"); 
                } else {
                    System.out.println("La esfera C es la diferente y es de menor peso"); 
                }
            } else {
                if (A==C && A==D){
                    if (B>A){
                        System.out.println("La esfera B es la diferente y es de mayor peso"); 
                    } else {
                        System.out.println("La esfera B es la diferente y es de menor peso"); 
                    }
                } else {
                    if (A>B){
                        System.out.println("La esfera A es la diferente y es de mayor peso"); 
                    } else {
                        System.out.println("La esfera A es la diferente y es de menor peso"); 
                    }
                }     
            }   
        }  
    }
}
