package com.servent.fundcalculator;

import java.math.BigDecimal;

public class AlgorithmUtils {
    public static int getTotolAmount(double holdingTime, double exceptedReturn, int totalAmount) {
        // result = totalAmount*(1+exceptedReturn/100)^holdingTime
        double result = totalAmount * Math.pow(1.0 + exceptedReturn / 100.0, holdingTime);
        return (int) result;
    }

    public static int getTotolAmountForYear(int holdingTime, double exceptedReturn, int totalAmount) {
        // result = totalAmount*(1+exceptedReturn/100)^holdingTime
        BigDecimal result = new BigDecimal(1.0 + exceptedReturn / 100.0);
        result = result.pow(holdingTime);
        result = result.multiply(new BigDecimal(totalAmount));

        return result.intValue();
    }
}
