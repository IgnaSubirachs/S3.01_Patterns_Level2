package Agenda;

import Interficies.Address;
import Interficies.PhoneNumber;

public class Contact {
    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
