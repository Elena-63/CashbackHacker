package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        int amount = 2100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountZero() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}