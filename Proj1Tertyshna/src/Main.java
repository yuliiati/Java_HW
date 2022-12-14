import static java.lang.Double.sum;

public class Main {
    public static void main(String[] args) {

       System.out.println("Hello world!");
        int a = 1000;               //Объявляем(декларируем) переменную, присваимваем значение
        System.out.println(a);    // Выводим пер без перевода строки

        long b = 100000000000000l;
        System.out.print(a + " " + b +"\n");    // Выводим с переводом println

        double c = 15.4;
        System.out.println(a + "" + b + "" + c);

        float d = 13.4f;

        char e = 'f';

        boolean f = true;
        System.out.printf("%15d %15.3f %15c %15b", a, c, e, f);

        short n = 3;


        byte m = 1;

        System.out.println(n + "" + m + "" + c);
        System.out.println(m + "" + m + "" + n);
    }
    }

/*
Заметки по уроку мои

1. Имя файла должно соответствовать имени класса
2. {} - зона видимости

метод main - точка входа в Java, т.е. отсюда начинается исполнение программы

в Java есть 2 вида переменных - примитивные и ссылочные

Примитивные типы(8 типов):

int a - декларация
a = 1000 - инициализация
"" - строка
`*'##*+++´´´´````
+ - перегруженный оператор в Java. Он дает возм. выводить неск значений в 1 операторе
\ - переводд на новую строку
По конвенции Java в строке должно быть не более 80 символов, поэтому длинные строки принято переносить
 System.out.printf() - форматированный вывод, т.е. в кавыяках указ тип числа и кол-во позиций для его вывода

Заметки
    Имя файла должно соответствовать имени класса
    {} указывают зону видимости.
    В Java есть два вида переменных примитивные и ссылочные
    Стандарт IEEE 754 - стандарт для выделения памяти на численные типы, предусматривающий выделение 32, 64 и 80 бит на
    целые и вещественные числа.
    Для вычислений с большим объемом памяти в Java существуют специальные классы.
    + - перегруженный оператор в Java, дает возможность выводить несколько значений на консоль в одном операторе
    По конвенции Java в строке не должно быть более 80 символов, поэтому длинные строки принято переносить

/*
    План занятия:
    1) Знакомство с примитивными типами:DDD
    2) Знакомство с операторами вывода
     */

    /*
    Заметки
    Имя файла должно соответствовать имени класса
    {} указывают зону видимости.
    В Java есть два вида переменных примитивные и ссылочные
    Стандарт IEEE 754 - стандарт для выделения памяти на численные типы, предусматривающий выделение 32, 64 и 80 бит на
    целые и вещественные числа.
    Для вычислений с большим объемом памяти в Java существуют специальные классы.
    + - перегруженный оператор в Java, дает возможность выводить несколько значений на консоль в одном операторе
    По конвенции Java в строке не должно быть более 80 символов, поэтому длинные строки принято переносить
     */

    /*
    Теория (Не моё)
    Метод main - точка входа в java, т.е. отсюда начинается исполнение программы.

    Примитивные типы
    В Java их 8

    Типы для целых чисел:
    long                 - 64 бита
    int                  - 32 бита
    short                - 16 бит
    byte                 - 8 бит
    Типы для вещественных чисел(дробных):
    double               - 64
    float                - 32
    Символьный тип:
    char                - 32 бита
    Логический тип:
    boolean             - 1 бит

    Для вывода информации в Java существует специальный класс System.

     Запомним такую конструкцию:

     System.out. далее интересующий нас оператор

    System.out.print() - выводит последовательно в одну строку
    System.out.println() - Вывести и перейти на новую строку

    int a - декларация;
    a = 1000 - инициализация;
    " " - строка
    '' - символ
    \n - новая строка(new), переводит вывод на новую строку
     System.out.printf("", ) - форматированный вывод, т.е. в кавычках указывается тип числа и количество позиций для
     его вывода
     */

