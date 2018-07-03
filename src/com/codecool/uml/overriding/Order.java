package com.codecool.uml.overriding;

public class Order implements Orderable {

    private static int uniqueID = 1;
    private int id;
    private String status;


    public Order() {
        this.id = uniqueID++;
        this.status = "new";
    }


    public String getStatus() {
        return this.status;
    }

    @Override
    public boolean checkout() {
        if (this.status.equals("new")) {
            this.status = "checked";
            return true;
        }

        return false;
    }

    @Override
    public boolean pay() {
        if (this.status.equals("checked")) {
            this.status = "payed";
            return true;
        }

        return false;
    }
}
