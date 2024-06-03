package Homework2;

public class Exercise3Item {
    //Создаю класс item

    //имя
    String name;

    // артикул
    String aricle;

    //цена
    double price;

    String currency;

    //количество
    int quantity;

    //описание
    String description;

    //Создаю конструктор, для класса item
    public Exercise3Item(String name, String aricle, double price, String currency, int quantity, String description){
        this.name = name;
        this.aricle = aricle;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.description = description;
    }
    //Метод, для вывода информации о товаре
    public void infoOfItem(){
        System.out.println(name + "-" + aricle + "-" + price + currency + "-" + quantity + "-" + description);
    }
}
