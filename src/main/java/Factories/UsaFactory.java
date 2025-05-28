package Factories;

import Addresses.AddressInputs;
import Addresses.UsaAddress;
import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;
import phone.UsaPhone;

public class UsaFactory implements ContactBookFactory {
    @Override
    public Address createAddress(AddressInputs inputs) {
        return new UsaAddress(
                inputs.getStreet(),
                inputs.getCity(),
                inputs.getState(),
                inputs.getCountry()
        );
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new UsaPhone(number);
    }
}
