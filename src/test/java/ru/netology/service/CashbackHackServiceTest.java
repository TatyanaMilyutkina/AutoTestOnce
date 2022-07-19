package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLow1000() {

        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }
    @Test
    public void testRemainMore1000() {

        CashbackHackService service = new CashbackHackService();
        int expected = 700;
        int amount = 1300;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }
    @Test
    public void testRemain1000() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }
}