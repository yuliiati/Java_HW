

import java.util.Random;
import java.util.Scanner;



public class Main {
        /*
    План занятия
    1) Random
    2) Math и математические операторы
    3) While
    4) Практика
     */

    /*
    Теория
    Random - класс для генерации ПСЕВДОслучайных чисел.

    Math - класс для математических расчетов.

    Сортировка один из основных и самых важных алгоритмов в программировании. Сортировку существуют разные, они варьируются
    по быстродействию и количеству затраченных ресурсов.

    While(условие){
    Тело цикла
    }
     */

    /*
    Заметки
    Антипаттерн "Божественный метод" - метод, который выполняет более одной задачи - так делать не надо
    Правильный подход - один метод, одна задача
    Кроме очевидного применения сортировки, она может служить вспомогательным инструментом для решения   многих задач
    Совет: Обдумывая решение алгоритмической задачи, представьте, что данные упорядоченны.

     */

    static Random random = new Random();                  // Создаем глобальный объект класса Random


    public static void main(String[] args) {
        int[] arr = new int[10];                       // Способ создания и вывода на консоль массива со случайными числами(нехороший)

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");   // Не делает переход на новую строку
        }

        System.out.println();    // Переход на новую строку

        int[] arr1 = createArray(100, 50);
        System.out.println("Массив до сортировки: ");
        printArray(arr1);

        arr1 = sortArr(arr1);       // Сортировка массива
        System.out.println("Массив после сортировки: ");
        printArray(arr1);

        Scanner scanner = new Scanner(System.in);

        while (true) {           // Классический пример бесконечного цикла
            System.out.println("Я работаю");
            System.out.println("Введите операцию: \n" +
                    "Умножение - *\n" +
                    "Деление - /\n" +
                    "Возведение в степень - ^\n" +
                    "Извлечение квадратного корня - s\n" +
                    "Выход - e \n");
            char ch = scanner.next().charAt(0);
            if (ch == '*') {
                multiply(12, 10);
            } else if (ch == '/') {
                div(12, 12);
            } else if (ch == '^') {
                power(12, 12);
            } else if (ch == 's') {
                sqrt(12, 12);
            }

        }
    }
    private static void power(int i, int i1) {

    }
    private static void sqrt(int i, int i1) {

    }

    private static void div(int i, int i1) {
    }

    private static void multiply(int i, int i1) {
        System.out.println("Умноженные значения");
    }

    // Сортировка пузырьком (не больше 1000 элементов)
    private static int[] sortArr(int[] arr) {

        int temp;                  // Вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) {   // Перебираем массив
            for (int j = 0; j < arr.length; j++) {  // Во втором цикле сравниваем каждый элемент со всеми элементами
                if(arr[i] < arr[j]){       // Сравниваем элемент с каждым элементом, если удовлетворенно условие, делаем замену
                    temp = arr[i];     // Запоминаем переносимое значение
                    arr[i] = arr[j];  // Меняем значение
                    arr[j] = temp;   // Записываем запомненное значение в новую позицию
                }
            }

        }
        return arr;    // Возвращаем отсортированный массив
    }

    // Создаем метод, который выводит массив на консоль
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











