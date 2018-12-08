package ru.itpark;

public class CreditService {
    public int calculateCredit(int sum, double percent, int monthlyDate) {
        if (sum <= 0 || percent <= 0 || monthlyDate <= 0) {
            return 0;
        }
        double monthlyPercent = percent / 12 / 100;
        return (int) Math.round(sum * monthlyPercent * Math.pow(monthlyPercent + 1, monthlyDate) / (Math.pow(monthlyPercent + 1, monthlyDate) - 1));
    }
}
