package Adresses;

import Interficies.Address;

public  class UsaAddress implements Address {
    private String street,city,zip;

    public UsaAddress(String city, String street, String zip) {
        this.city = city;
        this.street = street;
        this.zip = zip;
    }
    @Override
    public String format() {
        return street + ", " + city + ", " + zip+" USA.";
    }
}
