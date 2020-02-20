package EmployList;

public class Main {


    public static void main(String[] args) {

        Handlowiec Kazik = new Handlowiec("Kazik","Kaziowy","4500","793 338 350","3","6000");
        Handlowiec Mietek = new Handlowiec("Mietek","Mietekowy","2500","793 348 350","2","3000");
        Handlowiec Ziutek = new Handlowiec("Ziutek","Ziutekowy","7000","293 338 350","4.5","7000");

        Dyrektor Kim = new Dyrektor("Kim","Jakis_sobie","15000","700 478 987","4500","VISA_457845","30000");

        employeeList Lista = new employeeList();

        Lista.addEmploye(Mietek);
        Lista.addEmploye(Kim);
        Lista.addEmploye(Kazik);
        Lista.addEmploye(Ziutek);

        System.out.println(Lista.toString());

    }
}
