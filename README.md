# 🌍 International Address & Phone Book - Abstract Factory Pattern

## 📝 Description

This Java application is an **international contact manager** (address and phone book) that demonstrates the **Abstract Factory** design pattern.  
Each country has its own format for addresses and phone numbers, and the application allows you to easily add new countries by extending the factories and product classes.

---

## 💻 Technologies Used

- Java 8+
- No external libraries required

---

## 📋 Requirements

- Java Development Kit (JDK) 8 or higher
- Any IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code)

---

## 🛠️ Installation

1. Clone or download the project source code.
2. Open the project in your preferred IDE.
3. Make sure your environment is set up with Java 8 or higher.

---

## ▶️ Execution

1. Compile all `.java` files:
    ```bash
    javac *.java
    ```
2. Run the `Main` class:
    ```bash
    java Main
    ```
3. The output will display address books for each country, showing the different formats.

---

## 📚 Structure

- `Addresses.AddressInputs` – Data carrier for all possible address fields (street, city, zip, province, state, country, etc.)
- `Interficies.Address` – Address interface
- `Interficies.PhoneNumber` – Phone number interface
- `Interficies.ContactBookFactory` – Abstract factory interface for creating addresses and phone numbers
- `Addresses.SpanishAddress`, `Addresses.UsaAddress`, `Addresses.FrenchAddress` – Concrete address classes for each country
- `phone.SpanishPhone`, `phone.UsaPhone`, `phone.FrenchPhone` – Concrete phone number classes for each country
- `Factories.SpanishFactory`, `Factories.UsaFactory`, `Factories.FrenchFactory` – Factory classes for each country
- `Contact` – Encapsulates an Address and a PhoneNumber
- `PhoneBookAgenda` – Maintains a list of contacts and allows adding/showing them
- `Main` – Example usage and entry point

---

## 🏗️ Main Design (Abstract Factory)

