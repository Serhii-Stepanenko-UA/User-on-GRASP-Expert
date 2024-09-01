package app;

// Demo клас main(), що створює об'єкт класу User та об'єкт класу Address,
// Встановлює адресу для об'єкта користувача за допомогою методу setAddress(),
// Виводить адресу користувача на консоль, використовуючи метод getAddress().
public class Main {

    public static void main(String[] args) {
        User user1 = new User(new Address());
        user1.setAddress("Odesa","Derybasivska st.", 17);
        System.out.println("\nUser 1 address: " + user1.getAddress());

        User user2 = new User(new Address());
        user2.setAddress("Odesa","Primorsky Boulevard", 3);
        System.out.println("\nUser 2 address: " + user2.getAddress());
    }
}
