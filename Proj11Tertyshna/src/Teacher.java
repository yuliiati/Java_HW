public class Teacher extends Worker{
    // Задача
    //    Унаследоваться от класса Worker и создать классы: Manager и Teacher
    private int courseQuantity;
    private String rate;
    public Teacher(String name, int age, double wage, String position, int courseQuantity, String rate) {
        super(name, age, wage, position);
        this.courseQuantity = courseQuantity;
        this.rate = rate;
    }

    @Override
    public void printClass() {
        System.out.println("Из Воркера");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " name=" + super.getName() +
                ", age=" + super.getAge() +
                ", position=" + super.getPosition() +
                ", wage=" + getWage() +
                " courseQuantity=" + courseQuantity +
                ", rate='" + rate + '\'' +
                '}';
    }
}
