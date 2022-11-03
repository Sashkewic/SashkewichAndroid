public class Main {
    public static void main(String[] args) {
        // Урок 13. Классы. ООП. Методы класса.
        People my = new People();
        my.setFullname("Живайкин Александр Романович");
        my.setAge(24);
        my.setPlaceOfBirth("г. Кара-Балта, Кыргызстан");
        my.setHighEducate(false);

        System.out.println("Полное имя: " + my.getFullname() + "\n" + "Возраст: " + my.getAge() + "\n" + "Место рождения: " + my.getPlaceOfBirth() + "\n" +
                "Высшее образование: " + my.getHighEducate() + "\n");


        // Урок 13. Методы класса.
//        Rectangle myRectangle1 = new Rectangle();
//        myRectangle1.a = 10;
//        myRectangle1.b = 20;
//        System.out.printf("Площадь прямоугольника со сторонами %d и %d: %d \n", myRectangle1.a, myRectangle1.b, myRectangle1.getSquare());
//
//        Rectangle myRectangle2 = new Rectangle();
//        myRectangle2.a = 20;
//        myRectangle2.b = 40;
//        System.out.printf("Площадь прямоугольника со сторонами %d и %d: %d \n", myRectangle2.a, myRectangle2.b, myRectangle2.getSquare());
//
//        Rectangle myRectangle3 = new Rectangle();
//        myRectangle3.a = 30;
//        myRectangle3.b = 50;
//        System.out.printf("Площадь прямоугольника со сторонами %d и %d: %d \n", myRectangle3.a, myRectangle3.b, myRectangle3.getSquare());
    }
}