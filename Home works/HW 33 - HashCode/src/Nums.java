import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Nums {
    public static void main(String[] args) {
        // 1. Создать список из повторяющихся чисел от 1 до 100. Длиной в 400 элементов
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 100; j++){
                nums.add(j);
            }
        }

        System.out.println(nums);

        // 2. Выгрузить все элементы, посчитать сумму.
        int result = 0;

        for (Integer num : nums) {
            result += num;
        }

        System.out.printf("Сумма всех чисел списка: %d" + "\n", result);

        // 3. Добавить все элементы в HashSet
        Set<Integer> numsSet = new HashSet<Integer>(nums);
        System.out.println("HashSet: " + numsSet);

        // 4. Повторить вычисления из пункта 2
        int sum = 0;

        for (Integer num : numsSet) {
            sum += num;
        }
        System.out.printf("Сумма всех чисел HashSet: %d" + "\n", sum);
    }
}
