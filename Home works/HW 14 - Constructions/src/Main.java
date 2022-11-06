// Создайте экземпляры класса.
// Заполните экземпляры данными.
// Выведите данные в консоль

//public class Main {
//    public static void main(String[] args) {
//        Rectangle firstRectangle = new Rectangle(3, 7);
//        Rectangle secondRectangle = new Rectangle(1, 4);
//        Rectangle thirdRectangle = new Rectangle(9, 2);
//
//        secondRectangle.setA(3);
//        secondRectangle.setB(5);
//
//        thirdRectangle.a = 6;
//        thirdRectangle.b = 6;
//
//        System.out.println("У прямоугольника стороны: " + firstRectangle.a + " и " + firstRectangle.b);
//        System.out.println("У прямоугольника стороны: " + secondRectangle.getA() + " и " + secondRectangle.getB());
//        System.out.println("У прямоугольника стороны: " + thirdRectangle.a + " и " + thirdRectangle.b);
//    }
//}

public class Main {
    public static void main(String[] args) {
        // При создании объекта хочу указать:
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5); // 1) Только радиус.
        Circle circle3 = new Circle(7, "Красный"); // 2) Только радиус и цвет
        Circle circle4 = new Circle(10, "Зеленый", true); // 3) Только радиус, цвет и прозрачен ли

        circle1.setRadius(4); // сеттером даем значение радиуса 1 круга
        circle1.setColor("Желтый"); // сеттером даем цвет 1 круга
        circle1.setTransparency(true); // сеттером даем прозрачность/непрозрачность 1 круга

        circle2.setColor("Синий"); // сеттером даем даем цвет 2 круга
        circle2.setTransparency(true); // сеттером даем прозрачность/непрозрачность 2 круга

        circle3.setTransparency(false); // сеттером даем прозрачность/непрозрачность 3 круга

        // Вывести информацию о создаваемых объектах (радиус, цвет, прозрачен ли)
        System.out.println("Информация о круге 1:" + "\n" + "Радиус: " + circle1.getRadius() + "\n" + "Цвет: " + circle1.getColor() + "\n" + "Прозрачность: " + circle1.isTransparency() + "\n");
        System.out.println("Информация о круге 2:" + "\n" + "Радиус: " + circle2.getRadius() + "\n" + "Цвет: " + circle2.getColor() + "\n" + "Прозрачность: " + circle2.isTransparency() + "\n");
        System.out.println("Информация о круге 3:" + "\n" + "Радиус: " + circle3.getRadius() + "\n" + "Цвет: " + circle3.getColor() + "\n" + "Прозрачность: " + circle3.isTransparency() + "\n");
        System.out.println("Информация о круге 4:" + "\n" + "Радиус: " + circle4.getRadius() + "\n" + "Цвет: " + circle4.getColor() + "\n" + "Прозрачность: " + circle4.isTransparency() + "\n");

        circle4.setRadius(10 * 2); // Увеличить радиус круга в N раз
        System.out.println("Длина круга 4: " + circle4.curclePerimeter() + "\n" + "Площадь круга: " + circle4.curcleSquare() + "\n");
        // отразить в консоли длину и площадь круга после изменения


        Circle [] circles = new Circle[100]; // создаем массив из 100 обьектов (кругов)
        int max = 20; // максимальное значение радиуса
        int min = 1; // минимальное значение радиуса
        int range = max - min + 1;

        Circle [] circlesDiv3 = new Circle[circles.length]; // новый массив, куда будут попадать круги (объекты), радиусом кратным 3

        for (int i = 0; i < circles.length; i++) { //
            circles[i] = new Circle((int)(Math.random() * range) + min); // каждый элемент массива получит экземпляр круга, со случайным радиусом
            System.out.print(circles[i].getRadius() + " "); // печатаем массив с 100 кругами
        }

        System.out.println("");

        for (int j = 0; j < circles.length; j++) { // проходим по всему массиву с объектами
            if (circles[j].getRadius() % 3 == 0) { // если радиус круга кратен 3,
                circlesDiv3[j] = circles[j]; // то каждый элемент массива получает обьект (круг).
                System.out.print(circlesDiv3[j].getRadius() + " "); // печатаем массив с кругами, радиус которых кратен 3
            }
        }
    }
}