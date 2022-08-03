/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.odybo.dereference;

// Importing required classes
import java.io.*;
import java.util.*;

/**
 *
 * @author vragos
 */
public class Dereference {

    public static void main(String[] args) {
        // Reading input from keyboard by
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);
 
        // Taking input for two integer variables
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        // Calculating sum of two variables and storing the
        // value in sum variable
        int sum;
        sum = a + b;
        
        //  Print and display resultant length
        System.out.println(sum);
    }
}


/*
    @Override
    public boolean equals(Object o) {
        // рефлексивность 
        if (this == o) return true;
        // неравенство null
        if (o == null) return false;
        // 	симметричность
        if (this.getClass() != o.getClass()) return false;
        // симметричность + транзитивность
        ComplexNumber complexNumber = (ComplexNumber) o;
		String reComplexNumber = new String(ComplexNumber.re)
		String imComplexNumber = new String(ComplexNumber.im)
		String reThis = new String(this.re)
		String imThis = new String(this.im)
        boolean bResultRe = reComplexNumber.equals(reThis) == 0 : true ; false;
		boolean bResultIm = imComplexNumber.equals(inThis) == 0 : true ; false;
		return bResultRe && bResultIm;
    }
*/
