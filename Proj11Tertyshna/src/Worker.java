    // Наследуюсь от класса Human

public class Worker extends Human {

    private double wage;
    private String position;

    public Worker(String name, int age, double wage, String position) {       // Создаю конструктор, который ссылается на конструктор родителя
        super(name, age);   // Сама ссылка
        this.position = position;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Метод для демонстрации Переопределения
    @Override
    public void printClass() {  // alt + einfg(ins) Переопределить класс(@override Method) - printClass
        System.out.println("Сделан из класа Worker");
    }

    // Создать метод alt+einfg - toSring
    // '' - одинарные кавычки - экранирование
    @Override
    public String toString() {
        return "Worker{" +
                " name=" + super.getName() +
                ", age=" + super.getAge() +
                ", wage=" + wage +
                ", position='" + position + '\'' +
                '}';
    }
}
