public class Car {        //Создали новый класс
    private int price;          //Поля класса
    private double speed;       //Здесь создаем шаблоны авто, а вызываем в мейне
    private String brand;       //String _ строка(набор символов)

    public Car(int price, double speed, String brand) { //Создали конструктор.  Это Метод, который создает экземпляр
        //класса(объект). У конструктора особая сигнатура
        this.price = price;
        this.speed = speed;
        this.brand = brand;         //this - ссылка на текущий экземпляр
    }

    //Аксессоры(набор Геттеров и Сеттеров). Геттер - сетод для получения значения, Сеттер - метод для его изменения
    //у объекта

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //Метод, как вывести все сразу(все значение объекта)
    public void printOut(){
        System.out.println("price : " + price + "speed = " + speed + "brand = " + brand);
    }



}
