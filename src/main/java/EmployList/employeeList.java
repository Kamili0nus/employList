package EmployList;

import java.util.List;
import java.util.Objects;

public class employeeList {

    private List<Employee> Catalog;

    public employeeList(List<Employee> catalog) {
        Catalog = catalog;
    }

    public void addEmploye(Employee employee){
        Catalog.add(employee);
    }

    public void removeEmploye(Employee employee){
        Catalog.remove(employee);
    }

    public void removeEmploye(int index){
        Catalog.remove(index);
    }

    public void backupListToFile(){

    }

    public void loadListFromFile(){

    }

    @Override
    public String toString() {
        return "employeeList{" +
                "Catalog=" + Catalog +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employeeList)) return false;
        employeeList that = (employeeList) o;
        return Objects.equals(Catalog, that.Catalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Catalog);
    }
}
