package io.vishva.learnings.java;

import io.vishva.learnings.java.service.ParcelService;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AmaKart parcel service");
        String name="Thorfin";
        String address="123 Main St, Cityville";
        int deliveryType=2;
        ServiceLoader<ParcelService> parcelServices=ServiceLoader.load(ParcelService.class);
        for (ParcelService parcelService : parcelServices) {
            if(parcelService.deliveryType()==deliveryType)
                parcelService.deliveryTo(name,address);
        }
    }
}