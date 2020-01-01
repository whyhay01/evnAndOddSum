package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        double evenAverage;
        double oddAverage;
        int evenCounter = 0;
        int oddCounter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of Numbers:");
        int size = input.nextInt();
        int [] numbers = new int[size];
        System.out.println("Enter " + size +" the number(press enter after each input):");
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        for (int j = 0; j<numbers.length; j++){
            if (numbers[j]%2 ==0) {
                evenSum +=numbers[j];
                evenCounter+=1;
            } else {
                oddSum += numbers[j];
                oddCounter += 1;
            }

            }
        evenAverage =(double) evenSum/evenCounter;
        oddAverage = (double) oddSum/oddCounter;
System.out.println(oddCounter +"\n" + evenCounter);
        if (evenSum==0 & oddSum!=0) {
            System.out.println("System can't find any even number!!! \n Your odd sum = " + oddSum + "\n The average sum = "
            + oddAverage);
        }else if (evenSum !=0 & oddSum==0){
            System.out.println("System can't find any odd number!!! \n Your even sum = " + evenSum
            + "\n The average sum = " + evenAverage);
        } else if (evenSum !=0 & oddSum!=0) {
            System.out.println("Your even sum  and it average are " + evenSum + " "+ evenAverage +
                    "\n" + "Your odd sum and it average are" + oddSum+ " "+ oddAverage+ "Respectively");
        }


    }
}