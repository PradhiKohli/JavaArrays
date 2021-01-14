package com.tts;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        int num =0;
        int sum = 0;
// Part 1
        System.out.println("Enter 5 numbers: ");

        for (i=0; i<5; i++){
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            sum= sum+num;
        }
        System.out.println("The sum of numbers are: " +sum);

// Part 2
        double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];

        int index = 0;

        for (i = 1; i<exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }

        }System.out.println(index);

        // Part 3

        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.println("Result: " +Arrays.toString(result));
          }
          public static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(int i=0; i<size;i++){
            result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
        }
        return result;
          }
}
