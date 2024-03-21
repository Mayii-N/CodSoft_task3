/*
 * Mayii Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Mayii Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ATM;

import javax.swing.JOptionPane;

/**
 *
 * @author "Mayibongwe Ngwenya
 */
public class Accounts {
    String accountNumber = "123456789";
    String accountHolder = "Mayii";
    double bankBalance;
    
    Accounts(){
       
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    String checkAccount(String accNumber)  {
        if (accountNumber.equals(accNumber))  {
            return accountHolder;
        }
        else    {
            JOptionPane.showMessageDialog(null, "Account Holder not found");
            return null;
        }
        //return accountHolder;
    }
}
