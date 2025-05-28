package APP;

import Agenda.PhoneBookAgenda;
import Factories.FrenchFactory;
import Factories.SpanishFactory;
import Factories.UsaFactory;
import Addresses.AddressInputs;
import Interficies.ContactBookFactory;


public class Main {
    public static void main(String[] args) {

        ContactBookFactory spanishFactory = new SpanishFactory();
        ContactBookFactory usaFactory = new UsaFactory();
        ContactBookFactory frenchFactory = new FrenchFactory();


        PhoneBookAgenda spanishAgenda = new PhoneBookAgenda(spanishFactory);
        PhoneBookAgenda usaAgenda = new PhoneBookAgenda(usaFactory);
        PhoneBookAgenda frenchAgenda = new PhoneBookAgenda(frenchFactory);


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

        AddressInputs frenchInputs = new AddressInputs();
        frenchInputs.setStreet("10 Rue de Rivoli");
        frenchInputs.setCity("Paris");
        frenchInputs.setState("75001");



        spanishAgenda.addContact(spainInputs, "612345678");
        usaAgenda.addContact(usaInputs, "2125551234");
        frenchAgenda.addContact(frenchInputs, "0612345678");


        System.out.println("Spanish Phone Book:");
        spanishAgenda.show();

        System.out.println("\nUSA Phone Book:");
        usaAgenda.show();

        System.out.println("\nFrench Phone Book:");
        frenchAgenda.show();
    }
}
