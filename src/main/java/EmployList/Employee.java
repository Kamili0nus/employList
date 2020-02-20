package EmployList;

import java.util.Objects;

abstract class Employee {

    static int count=0;
    private String Imie = "";
    private String Nazwisko = "";
    private String Wynagrodzenie = "";
    private String Telefon = "";

    public Employee( String imie, String nazwisko, String wynagrodzenie, String telefon) {
        count++;
        Imie = imie;
        Nazwisko = nazwisko;
        Wynagrodzenie = wynagrodzenie+"zł";
        Telefon = telefon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Imie.equals(employee.Imie) &&
                Nazwisko.equals(employee.Nazwisko) &&
                Wynagrodzenie.equals(employee.Wynagrodzenie) &&
                Telefon.equals(employee.Telefon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Imie, Nazwisko, Wynagrodzenie, Telefon);
    }

    @Override
    public String toString() {
        return  "";
    }
}
