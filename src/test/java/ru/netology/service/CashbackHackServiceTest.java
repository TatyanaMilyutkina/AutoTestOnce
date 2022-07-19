package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void remainLow1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 700;
        int amount = 300;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void remainMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int amount = 1200;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}