package io.vishva.learnings.java.service;

public class BlueDart implements ParcelService {
    @Override
    public void deliveryTo(String name, String address) {
        System.out.println("BlueDart<<<: delivering to: " + name + "\t" + address);
    }

    @Override
    public int deliveryType() {
        return 1;
    }
}
