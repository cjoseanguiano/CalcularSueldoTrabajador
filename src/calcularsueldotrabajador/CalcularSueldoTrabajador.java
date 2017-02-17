/*
Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre
y el sueldo del empleado que más gana.
 */
package calcularsueldotrabajador;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class CalcularSueldoTrabajador {

    public static void main(String[] args) {

        //Se inicializa los arreglos
        String[] empleado = new String[3];
        double[] sueldo = new double[3];

        int valorEmpleado = 0;
        Scanner entrada = new Scanner(System.in);

        //Se ingresa el nombre
        System.out.println("Ingresa el nombre");
        empleado[valorEmpleado] = entrada.nextLine();
        //Se ingresa el sueldo
        System.out.println("Ingresa sueldo");
        sueldo[valorEmpleado] = entrada.nextDouble();
        //Variable donde se guardara el sueldo y el nombre
        double sueldoMayor = sueldo[valorEmpleado];
        String nombreMayor = empleado[valorEmpleado];

        //Se recorre el arreglo empleado
        for (int i = 1; i < empleado.length; i++) {
            //Se limpia el buffer
            entrada.nextLine();
            //Se imprime el valor obtenido del empleado
            System.out.print("Empleado " + (i + 1) + ":");
            empleado[i] = entrada.nextLine();
            //Se imprime el valor obtenido del sueldo
            System.out.print("Sueldo ");
            sueldo[i] = entrada.nextDouble();
            //Se realiza la comparacion si el sueldo que se recorre es mayor que el primer sueldo
           
            if (sueldo[i] > sueldoMayor) {
                sueldoMayor = sueldo[i];
                nombreMayor = empleado[i];
            }

        }
        //Se imprimen los valores de acuerdo al resultado
        System.out.println("Empleado con mayor sueldo " + nombreMayor);
        System.out.println("Sueldo : " + sueldoMayor);

    }

}
