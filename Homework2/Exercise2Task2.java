package Homework2;

public class Exercise2Task2 {
    public static void main(String[] args){
        //Создаю объект из класса Flat
        Exercise2Flat myFirstFlat = new Exercise2Flat("Samolet plus",3, 45.5, true, false);

        myFirstFlat.infoOfFlat();

        //создаю объект из класса Room
        Exercise2Room myFirstRoom = new Exercise2Room("Спальня", 3);
        myFirstRoom.infoOfRoom();
    }
}
