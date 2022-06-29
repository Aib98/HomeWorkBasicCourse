import java.util.Objects;

public class Acount {
    private int bill;

    private Person person;

    public Acount(int bill, Person person) {
        this.bill = bill;
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acount acount = (Acount) o;
        return bill == acount.bill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bill);
    }

    @Override
    public String toString() {
        return "Счёт - " + bill;
    }
}
