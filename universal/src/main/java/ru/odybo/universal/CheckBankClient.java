/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.odybo.universal;

class BankCreditHistoryException extends Exception { 
    public BankCreditHistoryException(String errorMessage) {
        super(errorMessage);
    }
}

class ProblemWithLowException extends Exception { 
    public ProblemWithLowException(String errorMessage) {
        super(errorMessage);
    }
}

interface BankWoker {
    
}
class BankClerk implements BankWoker {
    
}

class BankClient {
    
}


/**
 *
 * @author vragos
 */
public class CheckBankClient {

    public static void main(Strings[] args) {
        System.out.println("Check bank client");
    }
    
}
