package EmployList;

import java.util.Objects;

public class Handlowiec extends Employee {

    private String prowizja ="";
    private String limitProwizji ="";
    private String Stanowisko = "";

    public Handlowiec(String imie, String nazwisko, String wynagrodzenie, String telefon, String prowizja, String limitProwizji) {
        super(imie, nazwisko, wynagrodzenie, telefon);
        this.prowizja = prowizja + "%";
        this.limitProwizji = limitProwizji + "zł";
        this.Stanowisko="Handlowiec";
    }

    @Override
    public String toString() {
        return "Handlowiec{" +
                "prowizja='" + prowizja + '\'' +
                ", limitProwizji='" + limitProwizji + '\'' +
                ", Stanowisko='" + Stanowisko + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Handlowiec)) return false;
        if (!super.equals(o)) return false;
        Handlowiec that = (Handlowiec) o;
        return prowizja.equals(that.prowizja) &&
                limitProwizji.equals(that.limitProwizji) &&
                Stanowisko.equals(that.Stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prowizja, limitProwizji, Stanowisko);
    }
}
