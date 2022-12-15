import java.util.Random;

public class ArrayWorking {

    int[] arr;      // Массив с которым будем работать
    int count;  // Указатель на границу уже добавленных элементов

    Random random = new Random();
    public ArrayWorking(int size) { // Выделяем память под массив
        arr = new int[size];
        count = 0;          // Устанавливаем счетчик на нулевой элемент
    }

    public void insert(int value){  // Добавляем элемент в массив
        arr[count] = value; // Само добавление
        count++;    // Увеличиваем счетчик
    }


    public void printArray(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }

    // Задачка. Сделать метод в ArrayWorking, который будет заполнять весь массив случайными числами

    public void RandomArray(){
        count = 0;  // Обнуляю счетчик
        for (int i = 0; i < arr.length; i++) {  // Перебираю весь массив
            arr[i] = random.nextInt(10);    // Присваиваю каждому эл псевдослучайное число
            count++;    // Увеличиваю счетчик на 1 после каждого добавления элементов
        }
    }
    // Вы же айтишники :D

    //  -----------
    // ----------/////////------ // Удаление это не удаление! Лучше стереть и перезаписать раз 5-10!!! О_О
    // ----------------------------
    // Стирание и перезапись - реальное удаление. После простого удаления можно вытащить инфу!
    public void clearArray(){
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public void setCount(){
        count = arr.length;
    }
}
