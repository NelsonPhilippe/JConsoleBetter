package fr.xilitra.jconsolebetter;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        new Thread(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello World!");
        }).start();
    }

}
