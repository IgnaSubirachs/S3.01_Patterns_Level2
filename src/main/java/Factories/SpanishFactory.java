package Factories;

import Addresses.SpanishAddress;
import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;
import phone.SpanishPhone;
import Addresses.AddressInputs;


public class SpanishFactory implements ContactBookFactory {
    public Address createAddress(AddressInputs addressInputs) {

        return new SpanishAddress(addressInputs.getStreet(), addressInputs.getCity(), addressInputs.getProvince(),addressInputs.getZip());
    }

    public PhoneNumber createPhoneNumber(String number) {

        return new SpanishPhone(number);

    }
}