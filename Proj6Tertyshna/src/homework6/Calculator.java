package homework6;

import java.util.Scanner;

public class Calculator {
    // 1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции
    //2) Создать методы, для создания массива, заполнения его случайными числами и вывода на консоль.
  //  3) Метод для сортировки массива пузырьком по возрастанию и убыванию
 //   4) Создать метод для возведения в степень числа и *извлечения корня 3 степени из числа.
// 5*) Реализовать игру "Камень, ножницы, бумага"

// 1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции

       public void starCalculations(){
            Scanner scanner = new Scanner;

            while (true){
                System.out.println("Введите операцию: \n" +
                        "Сложение: + \n +" +
                        "Вычетание: - \n +" +
                        "Умножение: * \n +" +
                        "Деление: / \n +" +
                        "Выход: + e \n +");
                char ch = Calculator.scanner.next().charAt(0);     // Работаем со статической переменной

                switch (ch){
                    case '+':
                        sum();
                        break;

                    case '-':
                        sub();
                        break;

                    case '*':
                        mul();
                        break;

                    case '/':
                        div();
                        break;
                    case 'e':
                        div();
                        break;
                }


            }

        }

        private void div() {
            double a = Calculator.scanner.nextDouble();
            double b = Calculator.scanner.nextDouble();
            System.out.println("Частное: " + a/b);
        }

        private void mul() {
            double a = Calculator.scanner.nextInt();
            double b = Calculator.scanner.nextInt();
            System.out.println("Произведение: " + a*b);
        }

        private void sub() {
            double a = Calculator.scanner.nextInt();
            double b = Calculator.scanner.nextInt();
            System.out.println("Разность: " + (a-b));
        }

        private void sum() {
            double a = Calculator.scanner.nextInt();
            double b = Calculator.scanner.nextInt();
            System.out.println("Сумма: " + (a+b));
        }
    }











