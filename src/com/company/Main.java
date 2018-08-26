package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean guessed = false;
        String guess = "";
        int input = 0;
        int attempts = 0;
        int num = 50;
        int min = 1;
        int max = 101;
        int gues = 0;
        Scanner in;


        System.out.println("System picking a random number...\n");
        Random ran = new Random();
        int val = ran.nextInt(100) + 1;
        System.out.println("The machine has selected the number: " + val);
        pausing();
        System.out.println("Starting to guess...\nGuessing number: 50");
        pausing();



        while(guessed == false && attempts <= 5)
        {


            //Random ran2 = new Random();
            //gues = ran.nextInt(max) + min;

            //in = new Scanner(System.in);
            input = num;

            if (Objects.equals(input, val))
            {
                guessed = true;
                attempts++;
            }

            else if (input < val)
            {
                //System.out.println(input);
                min = num;
                num = (min + max) / 2;
                System.out.println("\nToo low\nNext Guessing Number: " + num);
                attempts++;
            }

            else if (input > val)
            {
                max = num;
                num = (min + max) / 2;
                System.out.println("\nToo high\nNext Guessing Number: " + num);
                attempts++;
            }


            if(attempts == 6 && guessed == false)
            {
                attempts++;
                guessed = true;
            }

            pausing();


        }

        System.out.println("\nThe number is " + num + "\nAttempts taken: " + attempts);


    }


    public static void pausing() //I did not create this wait command. I found it on https://www.mkyong.com/java/java-how-to-delay-few-seconds/ and incorporated it into a subroutine for my program.
    {
        try {

            //sleep 5 seconds
            Thread.sleep(2500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
