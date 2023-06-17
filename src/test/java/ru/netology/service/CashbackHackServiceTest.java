package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4800;

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);

    }
}