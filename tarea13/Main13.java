package tarea13;
import java.util.Scanner;
public class Main13 {
        public static void main(String args[]) {
            ParOImpar parOInpar = new ParOImpar();
            Scanner lector = new Scanner(System.in);

            System.out.println("Enter a number to find out if it is odd or even ");
            parOInpar.asignarNumero(lector.nextInt());

            System.out.println(parOInpar.calculo());
        }
}
