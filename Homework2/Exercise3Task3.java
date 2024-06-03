package Homework2;

public class Exercise3Task3 {
    public static void main(String[] args) {
        //создаю объекты
        Exercise3Item itemOne = new Exercise3Item("MacBook Air ", " 0002024 ", 800, " $ ", 12, " Мощный, для учебы, мобильный, можно сидеть в старбаксе и пить кофе");

        Exercise3Item itemTwo = new Exercise3Item("Наушники Beats \"ProUltra\" "," 0002023 ",15000, " rub. ", 23, " Прекрасно подходят для тех, кто занимается спортом");

        Exercise3Item itemThree = new Exercise3Item("Робот-пылесос Dogayson \"3000 ABC\" ", " 0002025 ", 850, " $ ", 10, " Подходят, для влажной уборки");

        Exercise3Item itemFour = new Exercise3Item("Кофе машина Delonghi", " 0002020 ", 7000, " rub. ", 12, " Прекрасный и бюджетный выбор, для кофеманов");

        Exercise3Item itemFive = new Exercise3Item("Iphone \"17 ProMax 20TB\" "," 0002028 ", 2000, " $ ", 5, " Ни чем не отличается от прошлого Iphone 16");

        System.out.println("Сегодня в разделе товары у нас: ");
        itemOne.infoOfItem();
        itemTwo.infoOfItem();
        itemThree.infoOfItem();
        itemFour.infoOfItem();
        itemFive.infoOfItem();
    }
}
