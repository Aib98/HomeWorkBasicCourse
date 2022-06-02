public class Acount {
    private int bill;

    public Acount(int bill){
        this.bill = bill;
    }
    public Acount(){

    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Счёт - " + bill;
    }
}
