package ru.netology.service;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldCashbackServiceAmountZero(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void shouldCashbackServiceAmountPositive(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;
        assertEquals(expected,actual);
    }

    @Test
    void shouldCashbackServiceAmountNegative(){
        CashbackHackService service = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.remain(-600);
        });
    }
}