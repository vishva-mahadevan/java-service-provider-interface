package io.vishva.learnings.java.service;

public class DHL implements ParcelService {
    @Override
    public void deliveryTo(String name, String address) {
        System.out.println("======>  DHL delivering to: " + name + "\t" + address);
    }

    @Override
    public int deliveryType() {
        return 2;
    }
}
