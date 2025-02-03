public class Shirt {
    public int shirtID = 1234; // довільне значення номера моделі сорочки
    public String description = "Classic white shirt"; // довільний опис сорочки
    // коди кольорів: red=червоний, blue=синій, green=зелений, unset=невідомо
    public String colorCode = "unset"; // початкове значення кольору
    public double price = 29.99; // довільна вартість сорочки
    public int quantityInStock = 100; // довільна кількість на складі

    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation
} // кінець опису класу

