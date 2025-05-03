package ru.netology.service;
import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {
    @Test
    public void shouldCashbackServiceAmountZero(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.remain(0);
        });
    }

    @Test
    public void shouldCashbackServiceAmountPositive(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldCashbackServiceAmountNegative(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            service.remain(-600);
        });
    }
}