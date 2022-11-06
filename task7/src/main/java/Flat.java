import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Flat implements Serializable {
    private int numberOfFlat;
    private int square; //площадь
    List<Person> personList;

    public Flat(){}

    public Flat(int numberOfFlat, int square, List<Person> personList) {
        this.numberOfFlat = numberOfFlat;
        this.square = square;
        this.personList = personList;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat flat)) return false;
        return numberOfFlat == flat.numberOfFlat && square == flat.square && Objects.equals(personList, flat.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFlat, square, personList);
    }

}