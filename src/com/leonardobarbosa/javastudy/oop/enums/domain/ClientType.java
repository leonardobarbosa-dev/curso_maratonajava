package com.leonardobarbosa.javastudy.oop.enums.domain;

public enum ClientType {

    NATURAL_PERSON(1, "Pessoa Física"),
    LEGAL_ENTITY(2, "Pessoa Jurídica");

    private final int num;
    private final String clientTypeReport;

    ClientType(int num, String clientTypeReport) {
        this.num = num;
        this.clientTypeReport = clientTypeReport;
    }

    /*
    Enum = valores fixos
    Metodo de busca = ponte entre texto(descrição) e Enum
     */
    public static ClientType descriptionSearch(int num) {
        for (ClientType clientType : values()) {
            if (clientType.getNum() == (num)) {
                return clientType;
            }
        }
        return null;
    }

    public int getNum() {
        return num;
    }

    public String getClientTypeReport() {
        return clientTypeReport;
    }
}
