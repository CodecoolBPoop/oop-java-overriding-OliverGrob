package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    private static int uniqueID = 1;
    private int id;


    public PaymentProcess() {
        this.id = uniqueID++;
    }


    @Override
    protected void action(Orderable item) {
        item.pay();
        System.out.println("Payment Action");
    }
}
