import java.util.Objects;

public class Human{
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;

    public Human(String lastName, String firstName, String middleName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
    }

    public Human(Human human){
        lastName = human.getLastName();;
        firstName = human.getFirstName();
        middleName = human.getMiddleName();
        age = human.getAge();
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(lastName, human.lastName) && Objects.equals(firstName, human.firstName) && Objects.equals(middleName, human.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName, age);
    }

}