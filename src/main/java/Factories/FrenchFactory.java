package Factories;

import Addresses.AddressInputs;
import Addresses.FrenchAddress;
import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;
import phone.FrenchPhone;

public class FrenchFactory implements ContactBookFactory {
    public Address createAddress(AddressInputs inputs) {
        return new FrenchAddress(inputs.getStreet(), inputs.getCity(), inputs.getZip());

    }

    public PhoneNumber createPhoneNumber(String number) {
        return new FrenchPhone(number);
    }

}
