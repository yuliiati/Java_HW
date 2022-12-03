import java.io.PrintStream;//Не мертвая зона, потом объясним, что можно писать

public class Main {

    /*
    Теория
    Файл с расширением Java, то этот файл содержит Java-код.
    Файл с расширением class, такой файл содержит скомпилированный Java код-байт
    код(код для jvm)
    IDE - автоматически собирает проект.
    Если мы пишем в блокноте, то проект необходимо собирать вручную.
    Название файла должно совпадать с названием класса в файле.
    Java всегда состоит из классов
    Java классы после компиляции имеют расширение class. Это значит, что файл переведен в байт-код

    Проект - Логически связанная между собой сущность для программы(набор папок, файлов, рисунков и тд.)
    Пакет - логически связанный между собой набор данных.
    Класс - тип, представляет из себя объект реального мира
    Метод - подпрограмма(часть кода, которая может вызываться многократно), существует понятие функции и процедуры
    Функция - подпрограмма, которая возвращает значение в точку вызова, а процедура - подпрограмма, которая выполняет
    какие-то действия.
    В Java оба вида подпрограмм называюся Методами! Чтобы определить, является ли метод функцией или процедурой,

    необходимо посмотреть на его сигнатуру:

    модификатор доступа     мод принадлежности      определитель      название        аргументы
        public                  static                 void              main      (String[] args)  (сигнатура)

        void - процедура
        что-либо другое - функция, должна иметь в теле метода слова return и значение
    {} - тело метода
    Функция в сигнатуре имеет возвращаемый тип вместо void, соответственно при помощи оператора return, необходимо
    вернуть значение этого типа.
    void процедура int или др функция
    */
/*
В IntelliJ Idea есть два полезных сочетания клавиш: alt+Enter - если нажимать курсором на код с проблемой, это
сочетание предложит пути решения проьлемы, alt+ins(insert), если с ноутбука, то alt+fn+ins - позволяет генерировать
базовые участки кода. На нем клаве - alt+einfg (Generate)


    Создание объекта:
    Указываем тип(класс)   Называем переменную           =                  new                              Вызываем конструктор
       Car                     car                    новый(слово, выделяющее память под объект)               Car(набор знчений)







*/
    public static void main(String[] args) {

        print(12, 5);          //Вызываем процедуру
        print(13, 17);
        //print(16, 87);
        printDouble(35.5, 45.6);

        sum(12, 5);

        System.out.println(sum(12, 5)); //Вызываем процедуру

        System.out.println(sub(12, 5));

        //System.out.println(sum(12, 5));//ДЗ

        Car car = new Car(10000, 200, "Lamborghini");   //Класс

        Animals one = new Animals(100, 300, "Ягуар");//ДЗ Класс
        Animals two = new Animals(40, 50, "Кот");//ДЗ Класс
        Animals three = new Animals(10000, 350, "Тигр");//ДЗ Класс

        // Получаем значения полей класса и выводим их на консоль
        System.out.println("price = "  + car.getPrice() + "speed = " + car.getSpeed() + "brand = " + car.getBrand());

        //Изменение значения поля(свойства) объекта
        car.setPrice(15000);//сеттер - изменить цену напр.

        System.out.println("price = "  + car.getPrice() + "speed = " + car.getSpeed() + "brand = " + car.getBrand());   //car1.printOut(); - легкий способ:)


        System.out.println("amount = " + one.getAmount() + "speed = " + one.getSpeed() + "name = " + one.getName());//ДЗ Класс
        System.out.println("amount = " + two.getAmount() + "speed = " + two.getSpeed() + "name = " + two.getName());//ДЗ Класс
        System.out.println("amount = " + three.getAmount() + "speed = " + three.getSpeed() + "name = " + three.getName());//ДЗ Класс


        car.printOut();

        Car car1 = new Car(20000, 220, "Бугагатти");

        car1.printOut(); //Это легкий способ записать это => System.out.println("price = "  + car.getPrice() + "speed = " + car.getSpeed() + "brand = " + car.getBrand());

    }

    static int sub(int a, int b) { //ДЗ функция
        return a - b;
    }

    static void print(int a, int b) {       //Определяем процедуру
        System.out.println("a = " + a + "b = " + b);
    }
    // static void print(int n, int m) {       //ДЗ процедура
    //    System.out.println("n = " + n + "m = " + m);
    //}

    static void printDouble(double a, double b){
        System.out.println("a = " + a + "b = " + b);
    }

    static int sum(int a, int b){       //Создаем(определяем) процедуру
        return a+b;
    }








}





