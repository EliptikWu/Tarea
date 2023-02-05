package tarea20;
import java.util.Random;

public class PrinPc {
    public static void main(String[] args) {
        Pc pc = new Pc();
        Random  rd = new Random();
        pc.pitido = rd.nextBoolean();
        pc.disc = rd.nextBoolean();
        pc.unit = rd.nextBoolean();

        System.out.println(pc.checkStatus());
    }
}