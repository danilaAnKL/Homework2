package Homework2;

public class Exercise2Flat {
    //Создал поля, для класса Flat

    //Название ЖК
    String residentialComplex;

    //кол-во комнат
    int numberOfRooms;

    //квадратные метры
    double sqMeters;

    //наличие балкона
    boolean balcony;

    //есть ли отделка
    boolean finishing;

    //создаю конструктор
    public Exercise2Flat(String residentialComplex, int numberOfRooms, double sqMeters, boolean balcony, boolean finishing) {
        this.residentialComplex = residentialComplex;
        this.numberOfRooms = numberOfRooms;
        this.sqMeters = sqMeters;
        this.balcony = balcony;
        this.finishing = finishing;
    }
    //вывод информации
    public void infoOfFlat() {
        System.out.println(residentialComplex);
        System.out.println("Количество комнат " + numberOfRooms);
        System.out.println("В этой квартире " + sqMeters + " квадратных метров");
        System.out.println("Наличие балкона " + balcony);
        System.out.println("Наличие отделки " + finishing);
    }
}








