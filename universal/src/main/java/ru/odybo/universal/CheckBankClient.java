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

interface BankClerk {
}

class BankWorker implements BankClerk {
    
    public boolean CheckClientForCredit(BankClient bankClient) throws 
            BankCreditHistoryException,
            ProblemWithLowException
    {
        boolean bResult = false;
        int iTypeReject = 0;        
        try{
            // int iTrigger = 100500 / iTypeReject;
            bResult = true;
        } catch (Exception e){
            if(iTypeReject == 1){
                bResult = false;
                throw new BankCreditHistoryException("Bad history");
            } else if (iTypeReject == 2){
                bResult = false;
                throw new ProblemWithLowException("Bad history");
            }
        } finally {
            // some code probably
        }
        return bResult;
    }
}

class BankClient {
       
}

/**
 *
 * @author vragos
 */
public class CheckBankClient {

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws 
            BankCreditHistoryException,
            ProblemWithLowException 
    {
        boolean bResult = false;
        try {
            bResult = bankWorker.CheckClientForCredit(bankClient);
        } catch (BankCreditHistoryException e) {
            // bad credit history
            System.out.println("Проблемы с банковской историей");
            bResult = false;
        } catch (ProblemWithLowException e) {
            // nothing out add info
            bResult = false;
        }
        return bResult;
    }

    public static void main(String[] args) {
        System.out.println("Check bank client");
        BankWorker bankWorker = new BankWorker();
        BankClient bankClient = new BankClient();
        Boolean getCregit;
        getCregit = getCreditForClient(bankWorker, bankClient);
        
    }

}
