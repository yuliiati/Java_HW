public class Main {

        /*
        1) Приведение типов
        2) Типы данных
        3) String
        4) Переполнение типов:D
        5) Разбор вопросов
        */

/*
                Теория
    Приведение типов - преобразование одного типа данных в другой.
    АТД(абстрактный тип данных) - данные, обладающие определенной характеристикой(int, double, String, Car(свой тип данных),
    Human(свой тип данных) и т.д.).
    Для приведения типа, необходимо указать тип, к которому приводим в скобочках перед приводимым типом, например:
    int i = (int)12.4;

    Существует явное и не явное приведение:
    Явное приведение - требует участия программиста, выше показан пример явного приведения
    Неявное приведение - делается автоматически системой

    Переполнение типа - помещение в переменную значения превышающего память этой переменной, в Java

    String - ссылочный тип данных(массив символов). В отличие от примитивных типов поставляет огромное кол=во методов
    для работы со своими переменными.
  */



/*Заметки
Приведение ссылочных типов тоже возможно:
Car car = (Car)human; //Пример выдуманны, на практике вряд ли нужно будет приводить человека к автомобилю, но порой
приведение ссылочных типов выглядит крайне не очевидным, поэтому советую запомнить именно этот пример.
Также сследует добавить, что при привеении ссылочных типов следует учитывать их логическую связь.

Для определения типа данных сущевствует метод .getClass() - class java.lang.String

Для String в Java перегружен оператор +.
Сложение строк называется Конкатенацией
+= - оператор, позволяющий складывать значения
String периодически называется Стрингой





*/

    public static void main(String[] args) {

        int a;      // Декларция переменных. Явное приведение
        double d;

        d = 15.7;       // Инициализация переменных
        a = (int) d;     // Приводим double к int

        System.out.println(a);      // Вывод в консоль

        a = 17;           // Пример неявного типа 17.0
        d = a;

        System.out.println(d);

        int k;
        double m;

        m = 23.7;
        k = (int) m;

        System.out.println(k);

        k = 45;
        m = k;
        System.out.println(m);

        char s;
        int t;

        t = 325;

        s = (char) t;  // Явное приведение

        System.out.println(s);

        s = 'N';
        t = s;      // Неявное приведение

        System.out.println(t);


        int i = 2000000000 + 1000000000;    // Пример переполнения типа. Все уходит в минус "-1294967296"
        System.out.println(i);
        int e = 2000000000;
        int y = 1000000000;
        i = e + y;
        System.out.println(i);

        //long l = e+y;
        long l = (long) e + (long) y;            // Преорбразовали в лонг и все сложилось=)
        // Необходимо явно привести типы данных int(32b) к long(64b)
        System.out.println(l);

   /* long z;
    int o;

    o = 2000000000 + 1000000000;
    z =(long)o;

            System.out.println(z);*/

        String str;

        str = "" + i;
        System.out.println(str);

        System.out.println(str.getClass());     // Определение типа данных.

        System.out.println();


        str = "";                   // Обнуляем переменную типа String

        str = "Привет";      // Присваиваем пер str значение

        str += " Пока";     // Способы объеденения переменных

        System.out.println(str);

        str = str + " Я я Я я очень далека";

        System.out.println(str);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        str = "  " + str + "   ";

        System.out.println(str);

        str.trim();                       //TODO метод trim - убирает пробелы
        System.out.println(str.trim());     // Убираем пробелы вначале и конце
        System.out.println(str.length());       // Длина строки

        String subStr = str.substring(5);       // Выводим подстроку с указанного индекса

        System.out.println(subStr);

        subStr = str.substring(8, 13);      // Выводим подстроку с указанного диапазона

        System.out.println(subStr);

        System.out.println(str.charAt(14));     // Получить символ по его позиции в строке


        for (int j = 0; j < str.length(); j++) {    //TODO ЦИКЛЫ
            System.out.println(str.charAt(j));
        }

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'Я' || str.charAt(j) == 'я') {
                System.out.println(str.charAt(j));
            }

        }

        System.out.println(str.replace('Я', 'я'));      // Заменить символ
        System.out.println(str.replace('Я', ' '));


    Car car = new Car(3);
    car.printA();
    car.printAB();
    System.out.println(car.sum());




    }

}