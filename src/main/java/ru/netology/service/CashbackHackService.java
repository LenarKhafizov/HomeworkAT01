package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма покупки должна быть положительной, а у Вас: "
                    + amount);
        }
        return boundary - amount % boundary;
    }
}
