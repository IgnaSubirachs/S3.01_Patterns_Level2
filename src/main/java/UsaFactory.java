public class UsaFactory implements ContactBookFactory{
    public Address createAddress(String...data) {
        return new UsaAddress(data[0], data[1], data[2]);

    }
    public PhoneNumber createPhoneNumber(String number) {
        return new UsaPhone(number);
    }
}
