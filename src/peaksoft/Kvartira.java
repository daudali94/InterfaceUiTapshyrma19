package peaksoft;

import java.util.Arrays;

public class Kvartira implements KomUsluga{
    private String adress;
    Person [] kUiBulo;

    public Kvartira() {
    }

    public Kvartira(String adress, Person[] kUiBulo) {
        this.adress = adress;
        this.kUiBulo = kUiBulo;
    }

    public Kvartira(String adress, Person person1) {
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getkUiBulo() {
        return kUiBulo;
    }

    public void setkUiBulo(Person[] kUiBulo) {
        this.kUiBulo = kUiBulo;
    }

    @Override
    public void komUsluga() {
        System.out.println("Квартирада жашагандар ком услуга толошот");
    }

    @Override
    public String toString() {
        return "Квартира " +
                "адрес: " + adress + ' ' + Arrays.toString(kUiBulo);
    }
}
