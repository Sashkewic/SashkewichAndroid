public class Main {
    public static void main(String[] args) {
        Student studentSasha = new Student("Живайкин Александр Романович", 24, 4.4);
        Student studentAlexey = new Student("Егоров Алексей Владимирович", 20, 3.8);
        Student studentDima = new Student("Хмельницкий Дмитрий Александрович", 21, 4.8);
        System.out.println(studentSasha);
        System.out.println(studentAlexey);
        System.out.println(studentDima);

        // Создайте и заполните массив из Студентов
        // Подсчитайте среднее арифметическое оценок студентов
        // Реализовать двумя способами: обычный for и новый for

        Student [] arrStudents = new Student[]{studentSasha, studentAlexey, studentDima}; // создали массив c тремя студентами
        double sumMarks = 0; // сумма всех оценок
        double avgMarks = 0; // среднее всех оценок

        // обычный for
        for (int i = 0; i < arrStudents.length; i++) {
            sumMarks = sumMarks + arrStudents[i].getMark();
            avgMarks = sumMarks / arrStudents.length;
        }
        System.out.printf("Сумма оценок трех студентов: %.2f" + "\n" +
                "Средняя оценка трех студентов: %.2f" + "\n" + "\n", sumMarks, avgMarks);

        // новый for
        double newSumMarks = 0; // сумма всех оценок
        double newAvgMarks = 0; // среднее всех оценок

        for (Student student : arrStudents) {
            newSumMarks = newSumMarks + student.getMark();
            newAvgMarks = newSumMarks / arrStudents.length;
        }
        System.out.printf("Сумма оценок трех студентов: %.2f" + "\n" +
                "Средняя оценка трех студентов: %.2f" + "\n", newSumMarks, newAvgMarks);
    }





    // Испечь и упаковать один (хотя бы) обычный хлеб определенной массы и цены.
    // Создать второй хлеб – лепешку. нанести узоры, испечь, лакировать упаковать, назначить цену. Без веса лепешка – считается подделкой
    // Создать Лаваш, который имеет действие «завернуть». Когда испечен Лаваш – вывести «Я лаваш, меня испекли».
    // Создать Багет, имеются свойства длина и количество продольных рубцов. Добавить метод – «рубцевать». При упаковке вывести сообщение «Только в экологичный пакет»
    // Лаваш, Багет имеют фирменное название (как сейчас принято «Провансальский багет», «Элитный лаваш из Дилижана и тд»)

//    public static void main(String[] args) {
//        Bread ordinaryBread = new Bread(550, 28); // цель - испечь обычный хлеб весом 550 г, стоимостью 28 сом.
//        ordinaryBread.bakeBread(); // испекли обычный хлеб
//        ordinaryBread.packBread(); // упаковали обычный хлеб
//        System.out.println(ordinaryBread); // печатаем, что обычный хлеб весом (г) и ценой (сом) готов
//
//        Cake ordinaryCake = new Cake(390, 25, 25); // цель - испечь лепешку весом 390 г, радиусом 25, стоимостью 28 сом.
//        ordinaryCake.applyPatterns(); // нанесли узоры
//        ordinaryCake.varnish(); // нанесли лак
//        ordinaryCake.bakeCake(); // испекли лепешку
//        ordinaryCake.packCake(); // упаковали лепешку
//        System.out.println(ordinaryCake); // печатаем, что лепешка весом (г), радиусом (см) и ценой (сом) готова
//
//        Pita ordinaryPita = new Pita(150, 40, "Лаваш от Артура", 35); // цель - испечь лаваш весом 550 г, радиусом 40 см, стоимостью 28 сом.
//        ordinaryPita.bakePita(); // испекли лаваш
//        ordinaryPita.wrap(); // завернули лаваш
//        ordinaryPita.packPita(); // упаковали лаваш
//        System.out.println(ordinaryPita); // печатаем, что лаваш весом (г), радиусом (см) и ценой (сом) готов
//
//        Baguette ordinaryBaguette = new Baguette(350, 100, 15, "Французский багет с яйцом и приправой", 70); // цель - испечь багет весом 350 г, длиной в 100 см, порубленный на 15 частей, стоимостью 28 сом.
//        ordinaryBaguette.bakeBaguette(); // испекли багет
//        ordinaryBaguette.divideBaguette(); // порубили багет на количество одинаковых кусочков
//        ordinaryBaguette.packBaguette(); // упаковали багет
//        System.out.println(ordinaryBaguette); // печатаем, что багет весом (г), длиной (см), количеством кусочков (шт) и ценой (сом) готов
//    }
}