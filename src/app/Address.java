package app;

// Клас Address, що містить інформацію про адресу користувача.
public class Address {
    private String city;
    private String street;
    private int building;

    public Address() {
    }

    public Address(String city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreet(){
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public void setBuilding(){
    }

}
