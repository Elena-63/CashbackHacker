package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        int amount = 2100;
        int expected = service.remain(amount);
        int actual = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountZero() {
        int amount = 0;
        int expected = service.remain(amount);
        int actual = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        int amount = 1000;
        int expected = service.remain(amount);
        int actual = 0;
        assertEquals(expected, actual);
    }
}