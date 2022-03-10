package peaksoft;

public class Main {

    public static void main(String[] args) {
       Person person1 = new Person(5);
       Person person2 = new Person(2);
       Person person3 = new Person(3);

      Person [] semya1 = {person1};
      Person [] semya2 = {person2};
      Person [] semya3 = {person3};

      Kvartira kvartira = new Kvartira("Лермонтова 26",semya1);
       System.out.println(kvartira);
       kvartira.komUsluga();

       System.out.println();

       Gostinica gostinica = new Gostinica("Пугачева 57", semya2);
       System.out.println(gostinica);
       gostinica.arenda();

       System.out.println();

       Obshejitie obshejitie = new Obshejitie("Советская 100",semya3);
       System.out.println(obshejitie);
       obshejitie.arenda();

    }
}





















//     Gostinica uiBulo1 = new Gostinica("Лермонтова 26");
//     Kvartira uiBulo2 = new Kvartira("Пугачева 57");
//     Obshejitie uiBulo3 = new Obshejitie("Советская 100");

//   Person person = new Person();
//        person.setName("Тагаевтер");
//                System.out.println("Гостиницада жашаган уй булонун аты "+ person.getName());
//                System.out.println("Гостиницанын адреси "+uiBulo1.getAdress());
//                Gostinica gostinica = new Gostinica();
//                gostinica.arenda();
//                System.out.println("-------------------------------------");
//
//                Person person1 = new Person();
//                person1.setName("Атамбаевтер");
//                System.out.println("Квартирадагы жашаган уй булонун аты "+ person1.getName());
//                System.out.println("Квариранын адреси "+uiBulo2.getAdress());
//                Kvartira kvartira = new Kvartira();
//                kvartira.komUsluga();
//                System.out.println("-------------------------------------");
//
//                Person person3 = new Person();
//                person3.setName("Бакиевтер");
//                System.out.println("Общежитияда жашаган уй булонун аты "+ person3.getName());
//                System.out.println("Общежитиянын адреси "+uiBulo3.getAdress());
//                Obshejitie obshejitie = new Obshejitie();
//                obshejitie.arenda();
//                System.out.println("-------------------------------------");


