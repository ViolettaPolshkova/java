import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class House implements Serializable {
    private String cadastalNumber;
    private int adress;
    private Person mainPersonOfHouse;
    List<Flat> flatList;

    public House(){}

    public House(String cadastalNumber, int adress, Person mainPersonOfHouse, List<Flat> flatList) {
        this.cadastalNumber = cadastalNumber;
        this.adress = adress;
        this.mainPersonOfHouse = mainPersonOfHouse;
        this.flatList = flatList;
    }


    public String getCadastalNumber() {
        return cadastalNumber;
    }

    public void setCadastalNumber(String cadastalNumber) {
        this.cadastalNumber = cadastalNumber;
    }

    public int getAdress() {
        return adress;
    }

    public void setAdress(int adress) {
        this.adress = adress;
    }

    public Person getMainPersonOfHouse() {
        return mainPersonOfHouse;
    }

    public void setMainPersonOfHouse(Person mainPersonOfHouse) {
        this.mainPersonOfHouse = mainPersonOfHouse;
    }

    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;
        return adress == house.adress && Objects.equals(cadastalNumber, house.cadastalNumber) &&
                Objects.equals(mainPersonOfHouse, house.mainPersonOfHouse) && Objects.equals(flatList, house.flatList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastalNumber, adress, mainPersonOfHouse, flatList);
    }
}