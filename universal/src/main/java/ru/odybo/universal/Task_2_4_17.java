/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Click algoritm https://drakonhub.com/ide/doc/javalanguage/34
 * Click github 
 */
package ru.odybo.universal;
import java.util.ArrayList;
/**
 * 
 * @author vragos
 */
public class Task_2_4_17 {

public static int[] mergeArrays(int[] a1, int[] a2) {
    int[] aArrayA = a1;
    int[] aArrayB = a2;
    int[] aArrayC = new int[a1.length + a2.length];
    int iPointerA = a1.length > 0 ? 0 : -1;
    int iPointerB = a2.length > 0 ? 0 : -1;
    int iLenAxvost = 0;
    int iLenBxvost = 0;
    for (int i = 0; i < aArrayC.length; i++ ) {
        System.out.println(".");
        if ( iPointerA == -1 && iPointerB == -1) {
    /*
    (I) branch in algpritm
    ready: not source data for merging
    */
            break;
        } else if ( iPointerA == -1 && iPointerB >= 0 && iPointerB < aArrayB.length ) {
    /*
    (II) branch in algorithm
    */
            iLenBxvost = aArrayB.length - iPointerB;
            for (int iii = 0; iii < iLenBxvost; iii++) {
                aArrayC[i] = aArrayB[iPointerB];
                i++;
                iPointerB++;
            }
            break;
        } else if ( iPointerB == -1 && iPointerA >= 0 && iPointerA < aArrayA.length ) {
    /*
    (III) branch in algorithm
    */
            iLenAxvost = aArrayA.length - iPointerA;
            for (int jjj = 0;  jjj < iLenAxvost; jjj++) {
                aArrayC[i] = aArrayA[iPointerA];
                i++;
                iPointerA++;
            }
            break;
        } else if (( iPointerA >= 0 && iPointerA < aArrayA.length )
                && ( iPointerB >= 0 && iPointerB < aArrayB.length)) {
            // Merge from 2 arrays with sort ordering
            if ( aArrayA[iPointerA] <= aArrayB[iPointerB] ) {
        /*
        MindMap
        AA Branch
        */
                aArrayC[i] = aArrayA[iPointerA];
                // move iPointerA set to next of -1 if end of aArrayA
                if ( iPointerA + 1 == aArrayA.length ) {
                    iPointerA = -1;
                } else {
                    // ok. to next cell
                    iPointerA += 1;
                }
            } else {
        /*
        MindMap
        BB Branch
        */
                aArrayC[i] = aArrayB[iPointerB];
                // move iPointerB set to next of -1 if end of aArrayB
                if ( iPointerB + 1 == aArrayB.length ) {
                    iPointerB = -1;
                } else {
                    // ok. to next cell
                    iPointerB += 1;
                }
            }
        }
    }
    return aArrayC;
}

    
    public static void printArray(int[] aArray, String msg) {
        System.out.println(msg);
        for (int i = 0; i < aArray.length; i++) {
            System.out.print(aArray[i] + " | ");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args){
        int[] a1 = new int[]{ 1};
        int[] a2 = new int[]{20, 25, 35, 35};
        int[] aArrayC = mergeArrays(a1, a2);
        /**/
        printArray(a1, "a1");
        printArray(a2, "a2");
        printArray(aArrayC, "Result");
    }
    
}
