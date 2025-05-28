package Addresses;
import Interficies.Address;


public class UsaAddress implements Address {
    private String street;
    private String city;
    private String state;
    private String country;

    public UsaAddress(String street, String city, String state, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String format() {
        return street + ", " + city + ", " + state + ", " + country;
    }
}
