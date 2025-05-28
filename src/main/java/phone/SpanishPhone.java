package phone;

import Interficies.PhoneNumber;

public class SpanishPhone implements PhoneNumber {
    private final String number;

    public SpanishPhone(String number) {
        this.number = number;
    }


    public String format() {
        return "+34 " + number;
    }
}

