package APP;

import Agenda.PhoneBookAgenda;
import Factories.SpanishFactory;
import Factories.UsaFactory;
import Addresses.AddressInputs;
import Interficies.ContactBookFactory;


public class Main {
    public static void main(String[] args) {

        ContactBookFactory spanishFactory = new SpanishFactory();
        ContactBookFactory usaFactory = new UsaFactory();


        PhoneBookAgenda spanishAgenda = new PhoneBookAgenda(spanishFactory);
        PhoneBookAgenda usaAgenda = new PhoneBookAgenda(usaFactory);


        AddressInputs spainInputs = new AddressInputs();
        spainInputs.setStreet("Carrer Major 1");
        spainInputs.setCity("Barcelona");
        spainInputs.setProvince("Barcelona");
        spainInputs.setZip("08001");

        AddressInputs usaInputs = new AddressInputs();
        usaInputs.setStreet("5th Avenue");
        usaInputs.setCity("New York");
        usaInputs.setState("NY");
        usaInputs.setCountry("USA");


        spanishAgenda.addContact(spainInputs, "612345678");
        usaAgenda.addContact(usaInputs, "2125551234");


        System.out.println("Spanish Phone Book:");
        spanishAgenda.show();

        System.out.println("\nUSA Phone Book:");
        usaAgenda.show();
    }
}
