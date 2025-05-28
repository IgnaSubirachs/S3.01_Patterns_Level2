package Interficies;
import Addresses.AddressInputs;

public interface ContactBookFactory {
    Address createAddress(AddressInputs inputs);
    PhoneNumber createPhoneNumber(String number);
}
