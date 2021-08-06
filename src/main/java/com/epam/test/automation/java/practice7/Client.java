package com.epam.test.automation.java.practice7;

import java.lang.reflect.Array;
import java.math.BigDecimal;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public class Client {
    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit (Deposit deposit){
        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i] == null){
                deposits[i] = deposit;
                return true;
            }
        }

        return false;
    }

    public BigDecimal totalIncome(){
        BigDecimal sumIncome = BigDecimal.ZERO;


        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i] == null){
                return sumIncome;
            }
            sumIncome = sumIncome.add(deposits[i].income());
        }
        return sumIncome;
    }

    public BigDecimal maxIncome(){
        if (deposits[0] == null){
            return BigDecimal.ZERO;
        }
        BigDecimal maxIncome = deposits[0].income();

        for (int i = 1; i < deposits.length; i++) {
            if(deposits[i] != null){
                if (maxIncome.compareTo(deposits[i].income()) < 0){
                    maxIncome = deposits[i].income();
                }
            }
        }
        return maxIncome;
    }

    public BigDecimal getIncomeByNumber (int number){
     return deposits[number] == null ? BigDecimal.valueOf(0) : deposits[number].income();
    }
}
