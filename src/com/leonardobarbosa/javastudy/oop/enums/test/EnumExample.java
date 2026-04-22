package com.leonardobarbosa.javastudy.oop.enums.test;

import com.leonardobarbosa.javastudy.oop.enums.domain.Client;
import com.leonardobarbosa.javastudy.oop.enums.domain.ClientType;
import com.leonardobarbosa.javastudy.oop.enums.domain.PaymentType;

public class EnumExample {
    public static void main(String[] args) {

        Client entity = new Client("Obito", ClientType.LEGAL_ENTITY, PaymentType.CREDIT_CARD);
        Client natural = new Client("Madara", ClientType.NATURAL_PERSON, PaymentType.DEBIT_CARD);

        System.out.println(entity);
        System.out.println(natural);

        System.out.println("Desconto no crédito: " + PaymentType.CREDIT_CARD.calculateDiscount(100));
        System.out.println("Desconto no débito: " + PaymentType.DEBIT_CARD.calculateDiscount(100));

        ClientType clientType = ClientType.descriptionSearch(2);
        System.out.println("Tipo Cliente(num 2): " + clientType);
    }
}
