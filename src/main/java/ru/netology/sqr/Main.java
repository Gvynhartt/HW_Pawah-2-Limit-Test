package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        SQRService timesMatched = new SQRService();
        int count = timesMatched.enumerateSquareIntervalHits(3000, 4000);
        System.out.println(count);
    }
}