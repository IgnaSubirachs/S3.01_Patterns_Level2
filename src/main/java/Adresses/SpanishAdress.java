package Adresses;

import Interficies.Address;

public class SpanishAdress implements Address {
    private String street,city, postalCode;

    public SpanishAdress(String city, String postalCode, String street) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }
    @Override
    public String format() {
        return street + ", " + postalCode + " " + city + ", Spain";
    }






}



