import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public class Produkt {

        private int id = 0;
        private String nazwa = "";
        private String kategoria = "";
        private double cena = 0;
        private int iloscWMagazynie = 0;


        public Produkt(int id, String nazwa, String kategoria, double cena, int iloscWMagazynie) {
            this.id = id;
            this.nazwa = nazwa;
            this.kategoria = kategoria;
            this.cena = cena;
            this.iloscWMagazynie = iloscWMagazynie;
        }



        public void wyswietlInformacje(Produkt id, Produkt nazwa, Produkt kategoria, Produkt cena, Produkt iloscWMagazynie) {

            System.out.println(id + " " + nazwa + " " + kategoria + " " + cena + " " + iloscWMagazynie);

        }


    }



    public class Klient {

        public int id;
        public String imie;
        public String nazwisko;
        public String email;
        public boolean czyStaly;


        public Klient(int id, String imie, String nazwisko, String email, boolean czyStaly) {
            this.id = id;
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.email = email;
            this.czyStaly = czyStaly;
        }


        public void wyswietlInformacje(Klient id, Klient imie, Klient nazwisko, Klient email, Klient czyStaly) {

            System.out.println(id + " " + imie + " " + nazwisko + " " + email + " " + czyStaly);

        }









    }


    //public class Zamowienie {



    //}




    public void main(String[] args) {

        Produkt produkt1 = new Produkt(1, "coś", "kategoria1", 49.99, 38);

        produkt1.wyswietlInformacje(produkt1, produkt1, produkt1, produkt1, produkt1);

    }
}


























