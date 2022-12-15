public class Manager extends Worker{
    //Задача
    //    Унаследоваться от класса Worker и создать классы: Manager и Teacher
    private int stars;
    private String status;
    public Manager(String name, int age, double wage, String position, int stars, String status) {
        super(name, age, wage, position);
        this.stars = stars;
        this.status = status;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void printClass() {
        System.out.println("Из Workera");
    }

    @Override
    public String toString() {
        return "Manager{" +
                " name=" + super.getName() +
                ", age=" + super.getAge() +
                ", position=" + super.getPosition() +
                ", wage=" + getWage() +
                ", stars=" + stars +
                ", status='" + status + '\'' +
                '}';
    }
}
