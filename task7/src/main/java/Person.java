import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String lastName;
    private String name;
    private String middleName;
    private String birthday;

    public Person(){}

    public Person(String lastName, String name, String middleName, String birthday) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.birthday = birthday;
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

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(lastName, person.lastName) && Objects.equals(name, person.name) && Objects.equals(middleName, person.middleName) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, middleName, birthday);
    }
}