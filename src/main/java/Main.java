import Factories.SpanishFactory;
import Factories.UsaFactory;
import Interficies.ContactBookFactory;

public class Main {
    public static void main(String[] args) {
        ContactBookFactory spainFactory = new SpanishFactory();
        PhoneBookAgenda phoneBookSpain = new PhoneBookAgenda(spainFactory);

        phoneBookSpain.addContact(
                new String[]{"Carrer Major 1", "Barcelona", "08001"},
                "612345678"
        );

        ContactBookFactory usaFactory = new UsaFactory();
        PhoneBookAgenda phoneBookUSA = new PhoneBookAgenda(usaFactory);

        phoneBookUSA.addContact(
                new String[]{"5th Avenue", "New York", "10001"},
                "2125551234"
        );

        System.out.println("Spain Phone Book:");
        phoneBookSpain.show();
        System.out.println("\nUSA Phone Book:");
        phoneBookUSA.show();
    }
}