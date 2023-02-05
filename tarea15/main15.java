package tarea15;

import java.util.Scanner;

public class main15 {
    public static void main(String args[]) {
        Max max = new Max();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number 1");
        max.setNumber1(reader.nextInt());
        System.out.println("Enter the number 2");
        max.setNumber2(reader.nextInt());
        System.out.println("Enter the number 3");
        max.setNumber3(reader.nextInt());
        System.out.println("calculating the largest");
        System.out.println(max.max());


    }
}

