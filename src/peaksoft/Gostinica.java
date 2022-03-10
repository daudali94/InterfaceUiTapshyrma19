package peaksoft;

import java.util.Arrays;

public class Gostinica implements Arenda{
    private String adress;
    private Person [] gUiBulo;

    public Gostinica() {
    }
    public Gostinica(String adress, Person[] gUiBulo) {
        this.adress = adress;

        this.gUiBulo = gUiBulo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getGUiBulo() {
        return gUiBulo;
    }

    public void setGostinicadaguUiBulo(Person[] gUiBulo) {
        this.gUiBulo = gUiBulo;
    }

    @Override
    public void arenda() {
        System.out.println("Гостиницада жашагандар аренда толошот");
    }

    @Override
    public String toString() {
        return "Гостиница " +
                "адрес: " + adress + " "+ Arrays.toString(gUiBulo);
    }
}
