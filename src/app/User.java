package app;

// Клас User представляэ коритсувача системи
class User {
    Address address;

    // відповідає за зберігання адреси користувача, використовуючи об'єкт класу Address.
    public User(Address address) {
        this.address = address;
    }

    // методи для роботи з адресою об'екту класу Address
    // setAddress()
    public String getAddress() {
        return Address.address;
    }

    // та getAddress()
    public void setAddress(String address) {
        Address.address = address;
    }
}
