import java.util.Objects;

public class Human {
    private int age;
    private String name;
    private char sex;

    public Human(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && sex == human.sex && name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sex);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    



}
