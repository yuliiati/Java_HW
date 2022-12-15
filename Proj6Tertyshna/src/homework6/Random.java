
package homework6;

public class Random {
    // 2) Создать методы, для создания массива, заполнения его случайными числами и вывода на консоль.

    public static void printArray(int[] arr){   // Принимаем массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   // Выводим элемент на консоль с пробелом
        }
        System.out.println();     // В конце вывода переходим на новую строку
    }

    // Создаем метод для генерации случаных чисел в массиве. Передаем размер массива и диапазон случайных чисел
    public static int[] createArray(int size, int bound){
        int[] arr = new int[size];        // Создаем массив указанного размера
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);     // Заполняем элемент массива случайным числом в указанном диапазоне.
        }
        return arr;
    }


}


