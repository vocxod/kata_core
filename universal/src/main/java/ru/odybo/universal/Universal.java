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
        /*
        1) long -> float
        2) char -> Character
        3) String -> int
        4) int -> long
        5) byte -> char
        6) float -> long
        7) char -> int
        8) int -> boolean
        */        
        
        float fData1 = 1234567890123456789L;
        System.out.println("1 TRUE long->float ");

        char ch2 = '@'; 
        Character ch1 = new Character('#');
        ch1 = ch2;
        System.out.println("2 TRUE  ch->Character " + ch);
        
        String myString = "123456";
        // int iData2 = myString;
        System.out.println("3 FALSE String->int ");
        
        int iData4 = 123456;
        long lData4 = iData4;
        System.out.println("4 TRUE int->long ");
        
        byte bVal = 0x7A;
        char chch = 0xFFFF;
        System.out.println("5 FALSE/TRUE byte->char ");
        
        float fMyy = 123F;
        //long longMyy = 125.0F;
        System.out.println("6 FALSE float->long ");
        
        
        char chRoot = 6553;
        int iBB = chRoot;
        System.out.println("7 TRUE ch->int ");
        
        int iAs = 1;
        // boolean bData = iAs;
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
        checkConversion();
    }
}
