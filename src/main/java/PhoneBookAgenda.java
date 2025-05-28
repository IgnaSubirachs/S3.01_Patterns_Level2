import Addresses.AddressInputs;
import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookAgenda {
    private List<Contact> contacts = new ArrayList<>();
    private ContactBookFactory factory;

    public PhoneBookAgenda(ContactBookFactory factory) {
        this.factory = factory;
    }

    public void addContact(AddressInputs addressInputs, String phoneNumber) {
        Address address = factory.createAddress(addressInputs);
        PhoneNumber phone = factory.createPhoneNumber(phoneNumber);
        contacts.add(new Contact(address, phone));
    }

    public void show() {
        for (Contact contact : contacts) {
            System.out.println("Address: " + contact.getAddress().format());
            System.out.println("Phone: " + contact.getPhoneNumber().format());
        }
    }
}
