package com.leonardobarbosa.javastudy.exceptions.throwing;

public class BusinessRuleValidation {
    public static void main(String[] args) {

        /*
        Simular regra de negócio
        IllegalStateException= use para estados invalidos
        -----------------------------------------------------------------

        -> lançada quando um metodo é chamado em um momento inadequado
        ou quando o estado do objeto não permite a operação.

        Pagamento só pode ser feito uma vez, então na primeira tentativa da certo
        e a segunda lança a exceção.
        O valor está correto mas o pedido já está pago, então o problema é o estado
         */
        pay(100); // OK

        pay(100); // ERROR
    }

    public static boolean paid = false;

    public static void pay(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor a ser pago preciso ser positivo");
        }
        if (paid) {
            throw new IllegalStateException("O valor já foi pago");
        }
        paid = true;
        System.out.println("Valor pago!");
    }
}
