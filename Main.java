import java.io.*;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) throws InterruptedException{
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_PURPLE = "\u001B[35m";

        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");
        System.out.println(ANSI_PURPLE + "Jumping" + ANSI_RESET);
        System.out.println("Diego Esteban Galvis \n EAFIT ");

    }
}