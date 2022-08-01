package ru.odybo.universal;

import java.util.Scanner;

/**
 * 
 * @author vragos
 */
public class Task2416 {

    public static void printOddNumbers(int[] arr) {
        //Твой код здесь
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                System.out.print(arr[i]);
                if ( i != arr.length - 1) {
                    System.out.print(",");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iValue = scanner.nextInt();
        int aVals[] = {1, 15, 16, 33, 12, 15};
        System.out.println(aVals);
        do {
            printOddNumbers(aVals);
        } while (iValue != 0);
    }
    
}