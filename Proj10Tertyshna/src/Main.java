public class Main {

    /*
    План занятия:
    1. Полиморфия
    2. Практика
    3. Разбор вопросов


    */

    public static void main(String[] args) {
        print(10);                      // Вызываем полиморфные методы
        print('s');

        // Используем полиморфизм
        Human oldPassport = new Human(25, "Havrylo", "Ivanov", "Nikolayevich");   // Старый паспорт

        Human newPassport = new Human(25, "Havrylo", "Ivanov");  // Новый паспорт

        System.out.println("Старый паспорт: " + oldPassport.getAge() + " " + oldPassport.getName() + " " +
                oldPassport.getSurname() + " " + oldPassport.getFathername());

        System.out.println("Новый паспорт: " + newPassport.getAge() + " " + newPassport.getName() + " " +
                newPassport.getSurname());

        Human sexPassport = new Human(25, "Havrylo", "Ivanov", "Nikolayevich", 'm');

        Human singlePassport = new Human("Nadya");

        System.out.println("Паспорт с половой идентефикацией: " + sexPassport.getAge() + " " + sexPassport.getName() + " " +
                sexPassport.getSurname() + " " + sexPassport.getFathername() + " " + sexPassport.getSex());

        System.out.println("Паспорт с одним параметром: " + singlePassport.getName() + " " + singlePassport.getSurname());


        ArrayWorking arrayWorking = new ArrayWorking(5);    // Создаю объект для работы с массивом. 5 - размер массива
        arrayWorking.insert(7);         // Вставляем элемент. 7 - вставляемый элемент
        arrayWorking.printArray();
        arrayWorking.insert(9);
        arrayWorking.printArray();
        arrayWorking.RandomArray(); // Заполняю весь массив случайными числами
        arrayWorking.printArray();  // Вывожу массив
        arrayWorking.clearArray();
        System.out.println("Массив после удаления: ");
        arrayWorking.printArray();
        arrayWorking.setCount();
        arrayWorking.printArray();
    }

    private static void print(int i) {
    }


}