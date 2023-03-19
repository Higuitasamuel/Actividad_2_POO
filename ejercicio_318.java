import java.util.Scanner;
public class ejercicio_318 {
        public static void main(String[] args) {     
        Scanner entrada = new Scanner(System.in);
        int codigo, horas_trabajo;
        double salario_hora;
        byte opcion;
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el codigo del empleado:");
        codigo = entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo del empleado:");
        horas_trabajo = entrada.nextInt();
        System.out.println("Ingrese el salario por hora del empleado:");
        salario_hora = entrada.nextDouble();
        System.out.println("El porcentaje de retencion en la fuente es de 0.125 (12.5% por defecto)");
        System.out.println("Desea cambiar el porcentaje de retencion en la fuente? (1 = Si, 2 = No)");
        opcion = entrada.nextByte();
        empleado empleado = new empleado(codigo, nombre, horas_trabajo, salario_hora);
        if (opcion == 1) {
            System.out.println("Ingrese el nuevo porcentaje de retencion en la fuente:");
            double retencion = entrada.nextDouble();
            empleado.cambiar_retencion(retencion);
        }
        empleado.calcular_salario();
        empleado.mostrar_datos();
    }
}
