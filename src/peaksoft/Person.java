package peaksoft;

public class Person {
    private int amount;

    public Person() {
    }

    public Person(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "" +
                "жашайт " + amount + "уй було" ;
    }
}
