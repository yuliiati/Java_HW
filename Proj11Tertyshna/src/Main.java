public class Main {
  /*
  План занятия:
  1. Закрепление материала
  2. Знакомство с обьектами и наследованием
  */

    /*
    Теория
    Наследование - передача функционала от класса родителя классу потомку.
    Чтобы унаследоваться от класса, нужно указать слово extends(расширение), например,
    public class Child extends Parent - класс Child наследуется от класса Parent
    Важный момент: наследование применяется в Java на системном уровне - любой класс в Java неявно наследуется от класса
    Object.
    Object - это базовый класс Java(общий предок для всех классов). Такой подход гарантирует наличие определенного
    функционала у каждого класса.
    Методы:
    toString() - выводит все поля класса в строке
    equals() - Проверяет равенство обьектов
    hashCode() - Математическое значение полей объекта
    clone() - Безопасное(глубокое) копирование

    Super - ссылка на класс родитель. super() - вызов конструктора родителя, super.название метода - вызов метода
    родителя

    Наследование обеспечивает класс определенными методами, которые при желании можно переопределить, т.е. указать свою
    реализацию.

    @override - аннотация, которая указывает на то, что метод был переопределен.
     */

    /*Заметки
    Аннотации бывают разные, некоторые могут оказывать влияние на работу приложения.

    Задача
    Унаследоваться от класса Worker и создать классы: Manager и Teacher

    null - пустая ссылка
    ______________________________________________________
    ДЗ* Создать класс для знакомст(Реализация ограничивается только фантазией)

    Random random = new Random();

    From Starta University to Everyone 12:26 PM

    for (int i = 0; i < 10; i++) {
            String[] strArr = {"Masha", "Vanya", "Lena"};
            int r = random.nextInt(3);
            String name = strArr[r];
            System.out.println("Имя: " + name);
        }
    ______________________________________________________
    // Как автоматизировать жизнь)) Павел
    */

    Manager manager = new Manager("Met", 33, 4200, "Cyber Security", 5, "SEO" );
    public static void main(String[] args) {
        Human human = new Human("Valeria", 23);
        Worker worker = new Worker("Dima", 35, 3500, "Manager");
        Student student = new Student("Vasya", 20, 3, "Tasks *");
        System.out.println(human.getName() + " " + human.getAge());
        System.out.println(worker.getName() + " " + worker.getAge() + " " + worker.getWage());
        System.out.println(student.getName() + " " + student.getCourse() + " " + student.getHomeWork());

        System.out.println(human);
        human.printClass();
        worker.printClass();
        student.printClass();

        System.out.println(worker);
        System.out.println(student);

        Manager manager = new Manager("Met", 33, 4200, "Cyber Security", 5, "SEO" );
        Teacher teacher = new Teacher("Endy", 28, 3000, "Director", 4, "Perfect");
        System.out.println(worker.getName() + " " + worker.getAge() + " " + worker.getWage());
        System.out.println(teacher.getName() + " " + teacher.getAge() + " " + teacher.getWage() + " " + teacher.getPosition());
        System.out.println(manager);
        System.out.println(teacher);
        manager.printClass();
        teacher.printClass();

        Human[] arr = new Human[10];    // Создаем массив типа Human(так просто одна строка  = создать массив)(для дз)
        arr[0] = new Human("Yuliia", 20);
        arr[1] = human;
        arr[2] = new Human("Sveta", 25);

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);

        }



    }


















}