package tarea11;
import java.util.Scanner;
public class Main11 {
        public static void main(String args[]) {
            PositiveOrNegative positivoONegativo = new PositiveOrNegative();
            Scanner lector = new Scanner(System.in);

            System.out.println("Enter a number to know if it is positive or negative");
            positivoONegativo.asignarNumero(lector.nextByte());

            System.out.println(positivoONegativo.resultado());
        }
}

