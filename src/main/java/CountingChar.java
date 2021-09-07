/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class CountingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String string = input.nextLine();
        System.out.println(""+string+" has "+string.length()+" characters");
    }

}

