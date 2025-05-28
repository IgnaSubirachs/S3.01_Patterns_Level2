package Factories;

import Adresses.SpanishAdress;
import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;
import phone.SpanishPhone;

public class SpanishFactory implements ContactBookFactory {
    public Address createAddress(String... data) {
        return new SpanishAdress(data[0], data[1], data[2]);
    }

    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhone(number);
    }
}