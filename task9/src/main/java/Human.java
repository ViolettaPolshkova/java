import java.util.Objects;

public class Human {
    private String lastName;
    private String name;
    private String middleName;
    private int age;

    public Human(String lastName, String name, String middleName, int age){
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
    }

    public Human(Human human){
        lastName = human.getLastName();
        name = human.getName();
        middleName = human.getMiddleName();
        age = human.getAge();
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleNAme(String middleNAme) {
        this.middleName = middleNAme;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(lastName, human.lastName) && Objects.equals(name, human.name) && Objects.equals(middleName, human.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, middleName, age);
    }

}