package ru.netology.sqr;

public class SQRService {
    public int enumerateSquareIntervalHits(int lowerLimit, int upperLimit) {
        // int powerFirst = 10;
        // int lowerLimit;
        // int upperLimit;
        int intervalHitCount = 0;

        for (int powerFirst = 10; powerFirst <= 99; powerFirst++) {
            if ((lowerLimit <= powerFirst * powerFirst) & (powerFirst * powerFirst <= upperLimit)) {
                intervalHitCount = intervalHitCount + 1;
            }
        }
        return intervalHitCount;
    }
}
