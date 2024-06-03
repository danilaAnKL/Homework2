package Homework2;

public class Exercise2Room {
    //Поля, для класса room
    int numberOfWindows;
    String nameRoom;

    //создаю конструктор
    public Exercise2Room(String nameRoom, int numberOfWindows){
        this.nameRoom = nameRoom;
        this.numberOfWindows = numberOfWindows;
    }
    //вывод информации
public void infoOfRoom(){
        System.out.println("Сдесь будет находиться " + nameRoom);
        System.out.println("Количество окно " + numberOfWindows);
 }
}
