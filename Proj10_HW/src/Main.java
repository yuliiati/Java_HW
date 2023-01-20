import java.util.Random;
import java.util.Scanner;

/*
    HomeWork:

    1)Создать Scanner и организовать ввод чисел
    2) Проверить больше ли некоторого значения сумма двух чисел, если нет вывести сообщение что сумма меньше заданного значение
    3) Через case обработать несколько вариантов введенной переменной, предусмотреть дефолтный случай
    4) Инициализировать массив псевдослучайными числами(Random)
    5) Найти сумму и произведение всех элементов этого массива
    6) Сделать класс, который будет искать площадь треугольника, прямоугольника и окружности
    7) В классе Human добавить возможность изменения значений
    8) Написать 15 тернарных операторов
    9) Показать работу с методами классов String, StringBuilder и StringBuffer

    */

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Human human = new Human(23, "Yuliia");

    static StringBuffer strbfr = new StringBuffer();

    public static void main(String[] args) throws Exception {

        // _________________________Task 1
//         System.out.println(input());

        // _________________________Task 2
//         comparE();

        // _________________________Task 3
//         withCase();

        // _________________________Task 4 & Task 5
//         int arr[] = new int[3];
//         arr = randomArray();
//         printArray(arr);
//         sumProizved(arr);

        // _________________________Task 6
//         Square sqr = new Square();
//         System.out.println(sqr.rectangle(4, 4));
//         System.out.println(sqr.triangle(6, 8));
//         System.out.println(sqr.circle(5));

        // _________________________Task 7
//         System.out.println("Возраст : " + human.age + " \nИмя : " + human.name);
//         changeHuman();

        // _________________________Task 8
//
//        result = testCondition ? value1 : value2

         String str1 = " Some string";

         boolean a = 2 > 1 ? true : false;
         System.out.println(a);

         String b = 2 + 2 == 1 + 3 ? "Equal" : "Not equal";
         System.out.println(b);

         boolean c = str1.length() > 15 ? true : false;
         System.out.println(c);

         int age = 20;
         String greeting = age < 18 ? "Hello" : "Good buy";
         System.out.println(greeting);

         String securityAnswer = (human.getAge() >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";
         System.out.println(securityAnswer);

         int minVal, x = 3, y = 2;
         minVal = x < y ? x : y;
         System.out.println("min = " + minVal);


         float result = true ? 1.0f : 2.0f;
         System.out.println("float = " + result);

         String s = false ? "Dude, that was true" : "Sorry Dude, it's false";
         System.out.println(s);

         int o = 5;
         String out = "There " + (o > 1 ? " are " + x + " cookies" : "is one cookie") + " in the jar.";
         System.out.println(out);


        // _________________________Task 9
        String str = " Sooooooooooome String ";
        int z = str.length();
        System.out.println(x);

        str = str.trim();
        System.out.println(str);

        char chr = str.charAt(2);
        System.out.println(chr);

        str = str.concat(" stringed");
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);


        strbfr.append(" Some stringBuffer");
        System.out.println(strbfr);

        strbfr.replace(0, 5, "");
        System.out.println(strbfr);

        strbfr.reverse();
        System.out.println(strbfr);

        strbfr.append(" olleH");
        System.out.println(strbfr);

        strbfr.reverse();
        System.out.println(strbfr);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int input() {
        System.out.print("Enter num: ");
        int a = scanner.nextInt();
        return a;
    }

    public static void comparE() {
        System.out.print("Введите число, с которым будете сравнивать: ");
        int compare = scanner.nextInt();
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a + b < compare) {
            System.out.println("Сумма двух чисел '" + (a + b) + "' Меньше, чем заданное '" + compare + "'");
        } else if (a + b > compare) {
            System.out.println("Сумма двух чисел '" + (a + b) + "' Больше, чем заданное '" + compare + "'");
        } else {
            System.out.println("Сумма двух чисел '" + (a + b) + "' Равно заданному '" + compare + "'");
        }

    }

    public static void withCase() {
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        switch (a) {
            case 2:
                System.out.println("Введенное число равно 2-м");
                break;
            case 3:
                System.out.println("Введенное число равно 3-м");
                break;
            case 5:
                System.out.println("Введенное число равно 5-ти");
                break;

            default:
                System.out.println("Введенное число не равно 2, 3, либо 5");
                break;
        }
    }

    public static int[] randomArray() {
        int[] a = new int[3];
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        return a;
    }

    public static void sumProizved(int[] myArray) {
        int sum = 0;
        int proizv = 1;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            proizv *= myArray[i];
        }
        System.out.println(sum);
        System.out.println(proizv);
    }

    public static void changeHuman() {
        human.setAge(28);
        human.setName("Yuliia");
        System.out.println("Возраст : " + human.age + " \nИмя : " + human.name);
    }

}