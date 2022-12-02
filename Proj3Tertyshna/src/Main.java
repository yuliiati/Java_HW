import java.util.Scanner;

public class Main {

/*
План занятий:
1) Разбор дз
2) Консольный ввод
3) Разбор теории в связи с практикой

Теория:
    Для консольного ввода в Java существует класс Scanner
    Чтобы ввести данные необходимо создать объект класса Scanner:

    Scanner scanner = new Scanner(System.in);

    Локальная переменная - переменная определенная в теле метода, она видна только в пределах этого метода
    Глобальная переменная - переменная, определенная в границах класса, но не в одном из методов. Такая переменная будет
    доступна в каждом методе класса
    static - модификатор, который указывает на то, что эта переменная или метод принадлежит классу

****
Приведение:D типа - преобразование одного типа в другой в Java делается по схеме: (тип к которому приводим)исходный тип
(short)5);
***
Java: на нестатический сканер переменных нельзя ссылаться из статического контекста

Home Work

1) Метод(процедура), которая будет считывать значения и выводить их на консоль
    2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
    3*) Сделать глобальную переменную static Scanner и считать два значения в метоже main, передать их в функцию, вычислить
    их разность и вывести на консоль их метода main

*/

static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Car car = new Car(200000, 228, "Бугатти", (short) 12);      // Разбор ДЗ   3*)
        car.printOut();                                     //Вызываем процедуру
        System.out.println(car.print());                    //Вызываем функцию
                                       //Создаю переменную типа String(str) и присваиваю ей значения полей объекта при помощи функции print
        String str = car.print();                    //Получаем значение полей в строку(String(str))

        str = str + " Вот такое значение полей";     //Добавляю строку к полям объекта
                                        //" Текст" - если пробел перед кавычками, то будет пробел в консоли! По-другому - все слитно!
        System.out.println(str);        //Вывожу новую строку


        int a; //=car                                //TODO Декларация переменной int a //TODO just check:)

        Scanner scanner = new Scanner(System.in);                        // Создаем объект для ввода данных
        System.out.println("Введите значение int: ");
        a = scanner.nextInt();                               // Считываем в переменную а введенное значение(Инициализация)
        System.out.println(" Вы ввели: " + a);

        double b;       //TODO Декларация переменной double b
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите значение double: ");
        b = scanner.nextDouble();
        System.out.println(" Вы ввели: " + b);

        char c;                              //TODO Декларация переменной char c;
        char c1;
        System.out.println("Введите значение char: ");

        c = scanner.next().charAt(0);                    //Считываем 1-й символ
        c1 = scanner.next().charAt(1);                    //Считываем 2-й символ
        System.out.println(" Вы ввели: " + c);
        System.out.println(" Вы ввели: " + c1);


        String str1 = "";                    // Декларируем
        System.out.println(" Введите строку: ");
        str1 = scanner.next();                           // Считываем строку
        System.out.println(" Строка: " + str1);

        String str2 = "";                       // Декларируем
        str2 = scanner.nextLine();                               // Считываем следующую строку
        System.out.println(" Следующая Строка: " + str2);


        System.out.println("Привет группа 43-44 \n Меня зовут Юлия!");

//        printInt();

        System.out.println(sum());

//        System.out.println(sub());
    }
    static void printInt() {
        System.out.println("Введите значение: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели: " + a);
    }
    public static int sum(){
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();
            return a+b;

      /*  System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        return a+b+c;*/

    //________________________________HomeWork
    //HW_1
/*
    int k;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение int: ");
        k = scanner.nextInt();
        System.out.println(" Вы ввели: " + k);
//HW_3

    public static int sub(){
        System.out.println("Введите первое число: ");
        int n = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int m = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int l = scanner.nextInt();
        return n - m -l;
*/


         }   //Конец main'a - объект


    }   //Конец Main'a - класс


