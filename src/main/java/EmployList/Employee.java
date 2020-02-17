package EmployList;

import java.util.Objects;

class Employee {

    static int count=0;
    private String Imie = "";
    private String Nazwisko = "";
    private String Wynagrodzenie = "";
    private String Stanowisko = "";
    private String Telefon = "";

    public Employee( String imie, String nazwisko, String wynagrodzenie, String stanowisko, String telefon) {
        count++;
        Imie = imie;
        Nazwisko = nazwisko;
        Wynagrodzenie = wynagrodzenie;
        Stanowisko = stanowisko;
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
                Stanowisko.equals(employee.Stanowisko) &&
                Telefon.equals(employee.Telefon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Imie, Nazwisko, Wynagrodzenie, Stanowisko, Telefon);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Wynagrodzenie='" + Wynagrodzenie + '\'' +
                ", Stanowisko='" + Stanowisko + '\'' +
                ", Telefon='" + Telefon + '\'' +
                '}';
    }
}
