package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @org.junit.jupiter.api.Test
    void calculateCredit() {
        CreditService creditService = new CreditService();
        int i = creditService.calculateCredit(1000, 20, 12);
        assertEquals(93, i);
    }
    {
        CreditService creditService = new CreditService();
        int i = creditService.calculateCredit(1000, 20, -12);
        assertEquals(0, i);
    }
}