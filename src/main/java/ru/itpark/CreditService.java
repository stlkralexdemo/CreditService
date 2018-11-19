package ru.itpark;

public class CreditService {
    public int calculateCredit(int sum, double percent, int monthlyDate) {
        if (sum <= 0 || percent <= 0 || monthlyDate <= 0) {
            return 0;
        }

        int monthlyPayment;
        double monthlyPaymentDb;
        double monthlyPercent = percent / 12 / 100;
        double x = Math.pow((monthlyPercent + 1), monthlyDate);
        monthlyPaymentDb = sum * monthlyPercent * x / (x - 1);
        monthlyPayment = (int) Math.round(monthlyPaymentDb);
        return monthlyPayment;
    }
}
