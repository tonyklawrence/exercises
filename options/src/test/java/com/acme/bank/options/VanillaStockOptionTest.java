package com.acme.bank.options;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanillaStockOptionTest {

    @Test
    public void payoff1() {
        VanillaStockOption vso1 = new VanillaStockOption();
        assertEquals(20D, vso1.calculatePayoff(0));
    }

    @Test
    public void payoff2() {
        VanillaStockOption vso2 = new VanillaStockOption();
        assertEquals(0D, vso2.calculatePayoff(-1));
    }
}

