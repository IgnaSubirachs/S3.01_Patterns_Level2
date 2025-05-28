package Addresses;

import Interficies.Address;


public class SpanishAddress implements Address {
    private String street;
    private String city;
    private String province;
    private String zip;

    public SpanishAddress(String street, String city, String province, String zip) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.zip = zip;
    }

    public String format() {
        return street + ", " + zip + " " + city + " (" + province + "), Spain";
    }
}
