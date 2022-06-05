package ru.netology.service;

//import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
//import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldMissingOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldThousandAreMissing() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void negativeValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(RuntimeException.class, () -> {
            cashbackHackService.remain(-1);
        });

    }

    @org.junit.Test
    public void oneOutOfAThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }


}