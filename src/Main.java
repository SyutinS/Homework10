import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " Рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int maxArr = -1;
        int minArr = 200_001;
        for (final int current : arr) {
            if (current > maxArr) {
                maxArr = current;
            }
            if (current < minArr) {
                minArr = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        double sumAverage;
        for (int element : arr) {
            sum += element;
        }
        sumAverage = sum / generateRandomArray().length;
        System.out.println("Средняя сумма трат за месяц составила " + sumAverage + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print("Было: ");
        for (char arr : reversFullName) {
            System.out.print(arr);
        }
        System.out.println();
        System.out.print("Стало: ");
        for (int i = 0; i < reversFullName.length / 2; i++) {
            char buffer = reversFullName[i];
            reversFullName[i] = reversFullName[reversFullName.length - i - 1];
            reversFullName[reversFullName.length - i - 1] = buffer;
        }
        for (char arr : reversFullName) {
            System.out.print(arr);
        }
    }
}