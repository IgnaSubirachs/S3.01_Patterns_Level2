import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookAgenda {
    private List<Address> addresses = new ArrayList<>();
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private ContactBookFactory factory;

    public PhoneBookAgenda(ContactBookFactory factory) {
        this.factory = factory;
    }

    public void addContact(String[] adressData, String phoneNumber) {
        addresses.add(factory.createAddress(adressData));
        phoneNumbers.add(factory.createPhoneNumber(phoneNumber));
    }

    public void show() {
        System.out.println("Addresses: ");
        for (Address address : addresses)
            System.out.println(address.format());
        System.out.println("Phones: ");
        for (PhoneNumber phoneNumber : phoneNumbers)
            System.out.println(phoneNumber.format());


    }

}


