/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ru.odybo.universal;

/**
 * This simple programm as <code>Hello world</code>
 *
 * @author vragos
 */
public class Universal {

    
    public static boolean doubleExpression(double a, double b, double c) {
        double epsilon = 0.0001;
        boolean bResult = false;
        double dResult = a + b;

        bResult = Math.abs(c - dResult) < epsilon;

        return bResult;
    }

    public static void checkConversion(){
        System.out.println("8 FALSE ch->int ");
    }
    
    public static boolean isPowerOfTwo(int value) {
	//Твой код здесь
	int iData = (int)Math.abs(value);
	boolean bResult = false;
	int iBitCount;
        iBitCount = Integer.bitCount(iData);
        // bResult = iBitCount == 1?false;
	if( iBitCount == 1 ){
            bResult = true;
	}
	return bResult;
    }
    
    public static void main(String[] args) {
        System.out.println("Universal be Infinity!");

    }
}
