
package homework4;


/*First level: 1) Работа со String
    2) Продемонстировать явное и неявное приведение типов
    3) Показать переполнение
    4) Показать работу с методами и классами
    5*) Сделать реверс строки*/


public class hw4 {  //  2) Продемонстировать явное и неявное приведение типов
    int o;
    double u;   // Явное приведение

    u = 19,9;
    o = (int) u;

    System.out.println(u);


    o = 15;           // Неявное приведение типа
    u = o;

        System.out.println(o);


//1) Работа со String

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

     // 3) Показать переполнение

    int z = 2000000000 + 1000000000;    // Пример переполнения типа
        System.out.println(z);
    int r = 2000000000;
    int t = 1000000000;
    z = r + t;
        System.out.println(z);



        // 5*) Сделать реверс строки*/ Получилось после урока:))..но в предыдущем уроке вы говорили, что строку реверсировать нельзя..теперь непонятно
    String str = "Hello";                        // Реверс

        for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
    }

        System.out.println();

        System.out.println("Длина строки: " + str.length());

        for (int i = str.length()-1; i >= 0; i--) {
        System.out.print(str.charAt(i) + " ");
    }

}

