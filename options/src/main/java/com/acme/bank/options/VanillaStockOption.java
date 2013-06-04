package com.acme.bank.options;

public class VanillaStockOption {

    private final double volatility = 0.0000000000001D;
    private final double interestRate = 0D;
    private final long timeToMaturity = 0L;

    private double spotPrice;
    private double strike;

    public double calculatePayoff(int t) {
        throw new UnsupportedOperationException("not sure what to do yet!");
    }
}
