/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.odybo.universal;

/**
 * This simple programm as <code>Hello world</code>
 * @author vragos
 */
public class Universal {

    public static void main(String[] args) {
        System.out.println("Universal be Infinity!");
        boolean bTrue = true;
        boolean bFalse = false;
        boolean bResult1 = bTrue | bFalse;
        boolean bResult2 = bTrue || bFalse;
        System.out.println("| bResult1:" + bResult1 + " || bResult2:" + bResult2);
        
        bResult1 = bTrue ^ bFalse;
        bResult2 = bTrue != bFalse;
        System.out.println("^ bResult1:" + bResult1 + " != bResult2:" + bResult2);
        
        bResult1 = bTrue & bFalse;
        bResult2 = bTrue == bFalse;
        System.out.println("& bResult1:" + bResult1 + " == bResult2:" + bResult2);
        
        bResult1 = bTrue | bFalse;
        bResult2 = bTrue != bFalse;
        System.out.println("| bResult1:" + bResult1 + " != bResult2:" + bResult2);
        
        
        int iData = Integer.MAX_VALUE;
        int iOne = 0;
        int iTwo = 2;
        int iResult = 0;
        int[] iQuant = {1, 4, 16, 64, 256, 1024, 4096, 16384, 65536 };
        System.out.println("iData: " + iData);
        iResult = iQuant[0]<<1;
        System.out.println("iQuant[0<<1: " + iResult + " iQuant:" + iQuant[0]);
        iResult = iQuant[0]<<2;
        System.out.println("iQuant[0<<2: " + iResult + " iQuant:" + iQuant[0]);
        iResult = iQuant[0]<<3;
        System.out.println("iQuant[0<<3: " + iResult + " iQuant:" + iQuant[0]);
        
    }
}
