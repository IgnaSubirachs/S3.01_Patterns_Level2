package Addresses;

import Interficies.Address;

public class FrenchAddress implements Address {
    private String street, city, postalCode;

    public FrenchAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String format() {
        return street + ", " + postalCode + " " + city + ", France";
    }
}

