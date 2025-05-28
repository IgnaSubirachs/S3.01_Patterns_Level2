package phone;

import Interficies.PhoneNumber;

public class FrenchPhone implements PhoneNumber {
    private String number;
    public FrenchPhone(String number) {
        this.number = number; }
    public String format() { return "+33 " + number; }
}

