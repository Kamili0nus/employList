package EmployList;

import java.util.Objects;

public class Dyrektor extends Employee {

    private String Dodatek="";
    private String Karta="";
    private String Limit="";

    public Dyrektor(String imie, String nazwisko, String wynagrodzenie, String stanowisko, String telefon, String dodatek, String karta, String limit) {
        super(imie, nazwisko, wynagrodzenie, stanowisko, telefon);
        Dodatek = dodatek;
        Karta = karta;
        Limit = limit;
    }

    @Override
    public String toString() {
        return "Dyrektor{" +
                "Dodatek='" + Dodatek + '\'' +
                ", Karta='" + Karta + '\'' +
                ", Limit='" + Limit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dyrektor)) return false;
        if (!super.equals(o)) return false;
        Dyrektor dyrektor = (Dyrektor) o;
        return Dodatek.equals(dyrektor.Dodatek) &&
                Karta.equals(dyrektor.Karta) &&
                Limit.equals(dyrektor.Limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Dodatek, Karta, Limit);
    }
}
