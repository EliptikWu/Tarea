package tarea1;
import java.util.Scanner;
public class PrinUser {
        public static void main(String args[]) {
            User user = new User();
            user.userBase= "Eliptik";
            user.keyBase= "123";
            Scanner read = new Scanner(System.in);

            System.out.println("Type your User");
            user.userEnter = read.next();

            System.out.println("Type your Password");
            user.keyEnter = read.next();

            if (user.getAcces() == true){
                System.out.println("Succesful!");
            }else {
                System.out.println("Try again with other User or Password :(");
            }
        }
}

