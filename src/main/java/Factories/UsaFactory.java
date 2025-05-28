package Factories;
import Addresses.AddressInputs;
import Addresses.UsaAddress;
import Interficies.Address;
import Interficies.ContactBookFactory;
import Interficies.PhoneNumber;
import phone.UsaPhone;


public class UsaFactory implements ContactBookFactory {
    public Address createAddress(AddressInputs addressInputs) {
        return new UsaAddress(addressInputs.getStreet(), addressInputs.getCity(), addressInputs.getState(),addressInputs.getCountry());

    }
    public PhoneNumber createPhoneNumber(String number) {

        return new UsaPhone(number);
    }
}
