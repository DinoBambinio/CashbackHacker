package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain() {
        int actual = 100;
        int expected = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAmount999() {
        int actual = 1;
        int expected = service.remain(999);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAmount1() {
        int actual = 999;
        int expected = service.remain(1);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void checkAmountMinus100() {
        int actual = 1100;
        int expected = service.remain(-100);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void checkAmount0() {
        int actual = 1000;
        int expected = service.remain(0);
        Assert.assertEquals(actual,expected);
    }

}