package peaksoft;

import java.util.Arrays;

public class Obshejitie implements Arenda{
    private String adress;
    private Person [] oUiBulo;



    public Obshejitie() {
    }

    public Obshejitie(String adress, Person[] oUiBulo) {
        this.adress = adress;
        this.oUiBulo = oUiBulo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getoUiBulo() {
        return oUiBulo;
    }

    public void setoUiBulo(Person[] oUiBulo) {
        this.oUiBulo = oUiBulo;
    }

    @Override
    public void arenda() {
        System.out.println("Общежитияда жашагандар aренда толошот");
    }

    @Override
    public String toString() {
        return "Общежития " +
                "адрес: " + adress +" " + Arrays.toString(oUiBulo);
    }
}
