package phone;

import Interficies.PhoneNumber;

public class UsaPhone implements PhoneNumber {
    private final String number;

    public UsaPhone(String number) {
        this.number = number;
    }

    @Override
    public String format() {
        return "+1 " + number;
    }
}
