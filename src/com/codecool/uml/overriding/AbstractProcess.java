package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    public void stepBefore() {
        System.out.println("Step Before");
    }

    protected abstract void action(Orderable item);

    public void stepAfter() {
        System.out.println("Step After");
    }

}
