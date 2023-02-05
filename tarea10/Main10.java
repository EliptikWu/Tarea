package tarea10;
import java.util.Scanner;
public class Main10 {
        public static void main(String args[] ) {
            Salario salario = new Salario();
            Scanner lector = new Scanner(System.in);

            System.out.println("Type your name");
            salario.asignarNombre(lector.next());

            System.out.println("Enter the number of hours you worked");
            salario.asignarHoras(lector.nextInt());

            salario.caluclarValorHoras();

            System.out.println("Sir " + salario.nombre + " the number of hours is " + salario.numeroHoras + " and his salary equals " + salario.salarioTotal());
        }
}

