package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    private static int uniqueID = 1;
    private int id;


    public CheckoutProcess() {
        this.id = uniqueID++;
    }


    @Override
    protected void action(Orderable item) {
        item.checkout();
        System.out.println("Checkout Action");
    }
}
