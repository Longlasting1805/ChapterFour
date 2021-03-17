package com.company.Payments;

import java.time.LocalDate;

public class PaymentCard {
    private String cardNumber;
    private LocalDate expiry;
    private String name;
    private String issued;

    public  PaymentCard(String number, String nameOnCard, LocalDate expiry){
        cardNumber = number;
        name = nameOnCard;
        this.expiry = expiry;
    }
}
