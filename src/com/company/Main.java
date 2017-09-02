package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int theNumber = (int) (Math.random()*100);
        int input = new Scanner(System.in).nextInt();
        while(theNumber != input ){
            if(theNumber > input)
                System.out.println("Too Low");
            if(theNumber < input)
                System.out.println("Too High");
            input = new Scanner(System.in).nextInt();
        }
        System.out.println("Correct! The number was " + theNumber);
    }
}
