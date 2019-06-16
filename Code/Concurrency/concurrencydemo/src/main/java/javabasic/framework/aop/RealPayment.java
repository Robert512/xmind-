package javabasic.framework.aop;

public class RealPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("pay...");
    }
}
