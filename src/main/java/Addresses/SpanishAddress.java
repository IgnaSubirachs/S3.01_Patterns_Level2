package Addresses;

import Interficies.Address;

public class SpanishAddress implements Address {
    private String street,city, postalCode;

    public SpanishAddress(String city, String postalCode, String street, String zip) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }
    @Override
    public String format() {
        return street + ", " + postalCode + " " + city + ", Spain";
    }






}



