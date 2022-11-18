package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */
public class Test2 {
    public static void main(String[] args) {

        /*Интерфейс Comparable - используется для сравнения объектов, используя естественный порядок natural ordering
        * Чтобы имплементировать данный интерфейс нам нужно переопределить метод  - "int compareTo(Element e)"*/

        List<Employee> listOfEmployees = new ArrayList<>();

        Employee employee1 = new Employee(12, "Leonid", "Barsucovschi", 32456);
        Employee employee2 = new Employee(100, "Cristian", "Rusnac", 15789);
        Employee employee3 = new Employee(15, "Ivan", "Petrov", 5897);
        Employee employee4 = new Employee(23, "Ivan", "Sidorov", 8563);
        Employee employee5 = new Employee(6, "Igori", "Golovaci", 7685);
        Employee employee6 = new Employee(1, "Anatolii", "Voitenco", 4321);

        // Alternative methode but this methode can give error in compiling

/*        Arrays.sort(new Employee[]{
                employee1,employee2,
                employee3,employee4,
                employee5,employee6});*/


        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);
        listOfEmployees.add(employee5);
        listOfEmployees.add(employee6);

        System.out.println("Before sorting \n " + listOfEmployees);
        Collections.sort(listOfEmployees);
        System.out.println("After sorting \n " + listOfEmployees);

    }
}

class Employee implements Comparable<Employee> {

    private int id;
   // private Integer id;
    private String name;

    private String surname;

    private double salary;

    public Employee(int id,
                    String name,
                    String surname,
                    double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + " \n";
    }

    /*Мы сравниваем текущий объект который мы создадим
     с объектом в параметрах метода
     compareTo и должны вернуть число.
       */

    /*  Var 1 */
/*    @Override
    public int compareTo(Employee anotherEmpl) {
        if(this.id == anotherEmpl.id){
            return 0;
        } else if (this.id < anotherEmpl.id){
            return -1;
        } else {
            return 1;
        }
    }*/

    /* Var 2 */
/*    @Override
    public int compareTo(Employee anotherEmpl) {
        return this.id - anotherEmpl.id;
    }*/

    /* Var 3 rare methode used  */
  /*  @Override
    public int compareTo(Employee anotherEmpl){
        return this.id.compareTo(anotherEmpl.id); // If we're initializing  id Integer Type
    }*/

    // If we need to sort for name of employee

/*    @Override
    public int compareTo(Employee anotherEmpl){
        return this.name.compareTo(anotherEmpl.name);
    }*/

    /*If in list of Employee repeat names and we are need sort for surname */

    @Override
    public int compareTo(Employee anotherEmpl){
        int response = this.name.compareTo(anotherEmpl.name);
        if(response == 0){
            response = this.surname.compareTo(anotherEmpl.surname);
        }
        return response;
    }
}
