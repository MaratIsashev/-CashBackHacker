package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

class CashbackHackServiceTest {

    @Test
    void remainMoreThanZero() {
        int amount = 900;
        int expected = 10;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    void remainIsZero() {
        int amount = 2000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
}