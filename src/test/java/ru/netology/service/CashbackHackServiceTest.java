package ru.netology.service;


import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    void remainWhenPurchaseIsLessThanZero() {
        int amount = -100;
        int expected = 1100;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenPurchaseIsZero() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenPurchaseIsGreaterThanZero() {
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenIsThePurchaseNearTheBonusBoundary() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenThePurchaseIsMoreThanBonusBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        AssertJUnit.assertEquals(actual, expected);
    }

    @Test
    public void remainWhenThePurchaseIsEqualBonusBoundary() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        AssertJUnit.assertEquals(actual, expected);
    }
}