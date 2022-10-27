public class B {
    public static void main(String[] args) {
        // В магазине продаются яблоки в ящиках по 15 кг, 17кг и 21 кг. Как купить ровно 185 кг яблок, не вскрывая ящики?

        int[] apples = new int []{15, 17, 21};

        int count = 0;

        for (int i = 0; i < apples[0]; i++) {
            for (int j = 0; j < apples[1]; j++) {
                for (int k = 0; k < apples[2]; k++) {
                    int mas = i * 15 + j * 17 + k * 21;

                    if (mas > 185) {
                        break;
                    }

                    else if (mas == 185) {
                        count++;
                        System.out.println(i + " * " + "17" + " + " + j + " * " + "19" + " + " + k + " * " + "21" + " = " + mas);
                    }
                }
            }
        }

        System.out.println("Количество способов взять 185 кг яблок без вскрытий ящиков: " + count);
    }
}
