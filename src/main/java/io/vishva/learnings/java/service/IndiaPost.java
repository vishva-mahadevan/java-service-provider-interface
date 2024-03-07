package io.vishva.learnings.java.service;

public class IndiaPost implements ParcelService {
    @Override
    public void deliveryTo(String name, String address) {
        System.out.println(" ::: IndiaPost ::: delivering to: " + name + "\t" + address);
    }

    @Override
    public int deliveryType() {
        return 3;
    }
}
