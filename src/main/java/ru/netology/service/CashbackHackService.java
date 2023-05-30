package ru.netology.service;

public class CashbackHackService {
    public final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
