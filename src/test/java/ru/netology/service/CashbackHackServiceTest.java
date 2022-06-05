package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldMissingOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThousandAreMissing() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @Test
    public void negativeValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(RuntimeException.class, () -> {
            cashbackHackService.remain(-1);
        });

    }

    @Test
    public void oneOutOfAThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected);

    }


}