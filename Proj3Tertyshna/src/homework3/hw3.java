package homework3;

import java.util.Scanner;

public class hw3 {





/*
Home Work

    1) Метод(процедура), которая будет считывать значения и выводить их на консоль
    2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    3*) Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию, вычислить
    их разность и вывести на консоль их метода main*/

        // Чтобы проверить дз, нужно снять комменты
//1.

        static Scanner scanner = new Scanner(System.in); // Глобал сканер. 1. Сделать глобальную переменную static Scanner

        public static void main(String[] args) {

//        1. Метод(процедура), которая будет считывать значения и выводить их на консоль

            int d;       // Декларация переменной int d

            Scanner scanner = new Scanner(System.in);   // Создаем объект для ввода данных
            System.out.println("Введите значение int: ");
            d = scanner.nextInt();      // Считываем в переменную d введенное значение (Инициализация)
            System.out.println(" Вы ввели: " + d);


//        2. Метод(Функция), которая будет считывать 3 значения и возвращать их сумму

            System.out.println(sum()); //Вопрос: почему мы сначала вызываем как-бы результат вычислений сверху???
            // Сначала говорим - покажи сумму, а потом только списываем все числа..странно.
        }
        public static int sum() {
            System.out.println("Введите первое число: ");
            int k = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int l = scanner.nextInt();

            System.out.println("Введите третье число: ");
            int m = scanner.nextInt();
            return (k + l + m);

         /* 3. Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию, вычислить
    их разность и вывести на консоль их метода main*/

           /*     int o = scanner.nextInt();  // 2. считать два значения в методе main
                int p = scanner.nextInt();  // 2. считать два значения в методе main
                // 5. вернуть в main
                int w = calculateDiff(o, p); // 3. передать их в функцию
                // 6. вывести на консоль из метода main
                System.out.println(w);
//                System.out.println(calculateDiff(o, p));
            }
    static int calculateDiff(int o, int p) {
        return o - p;   // 4. вычислить их разность*/
        }

    }


