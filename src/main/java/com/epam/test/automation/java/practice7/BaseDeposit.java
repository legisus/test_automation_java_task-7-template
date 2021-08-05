package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public class BaseDeposit extends Deposit{

    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);

    }

    @Override
    public BigDecimal income() {
        BigDecimal income = null;
        BigDecimal persent = new BigDecimal("0,5");
        BigDecimal sum;

        sum = amount.multiply(persent);
        for (int i = 0; i < period; i++) {
            income = sum.multiply(persent);
        }

        return income;
    }
}
