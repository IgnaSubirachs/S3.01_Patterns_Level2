package Interficies;

public interface ContactBookFactory {
    Address createAddress(String... data);
    PhoneNumber createPhoneNumber(String number);
}
