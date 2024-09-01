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
    public void setAddress(String city, String street, int building) {
        address.setCity(city);
        address.setStreet(street);
        address.setBuilding(building);
    }

    // getAddress()
    public String getAddress() {
        return (address.getCity() + ", " + address.getStreet() + ", " + address.getBuilding());
    }

}
