package ru.netology.service;

import org.junit.Assert;
// import org.junit.Test;
import org.junit.jupiter.api.Test;


class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainWhenPurchaseIsLessThanZero() {
        int amount = -100;
        int expected = 1100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWhenPurchaseIsZero() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWhenPurchaseIsGreaterThanZero() {
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWhenIsThePurchaseNearTheBonusBoundary() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWhenThePurchaseIsMoreThanBonusBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWhenThePurchaseIsEqualBonusBoundary() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}