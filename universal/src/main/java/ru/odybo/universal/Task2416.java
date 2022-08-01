package ru.odybo.universal;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * 
 * @author vragos
 */
public class Task2416 {

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        // copy only odd numbers to new array
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                sb.append(arr[i]);
                sb.append(',');
            }
        }
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == ',' ){
            sb.setLength(sb.length() - 1);
        }
        System.out.println(sb.toString());
    }
    
    public static void printOddNumbers2(int[] arr) {
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
        int iValue;
        int aVals1[] = {1,2,3,10,15};
        printOddNumbers(aVals1);       
        do {
            iValue = scanner.nextInt();
            System.out.println("0 - выход \n");
        } while (iValue != 0);
    }
    
}