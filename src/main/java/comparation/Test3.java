package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */
public class Test3 {
    public static void main(String[] args) {

        /* Интерфейс Comparator - используется для сравнения объектов, используя не естественный порядок
        * Чтобы имплементировать данный интерфейс нужно переопределить метод "int compare(Element el1, Element el2) " */

        List<Students> listOfStudents = new ArrayList<>();

        Students student1 = new Students(12, "Leonid", "Barsucovschi", 32456);
        Students student2 = new Students(100, "Cristian", "Rusnac", 15789);
        Students student3 = new Students(15, "Ivan", "Petrov", 5897);
        Students student4 = new Students(23, "Ivan", "Sidorov", 8563);
        Students student5 = new Students(6, "Igori", "Golovaci", 7685);
        Students student6 = new Students(1, "Anatolii", "Voitenco", 4321);

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);

        System.out.println("Before sorting \n " + listOfStudents);

        //Collections.sort(listOfStudents, new IdComparator());
        // Collections.sort(listOfStudents, new NameComparator());
        //Collections.sort(listOfStudents, new SalaryComparator());


        Collections.sort(listOfStudents,new SalaryComparator());
        System.out.println("After sorting \n " + listOfStudents);

    }
}

class Students implements Comparable<Students> {

    private int id;

    private String name;

    private String surname;

    private int salary;

    public Students(int id,
                    String name,
                    String surname,
                    int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Students anotherStud){
        if(this.id == anotherStud.id){
            return 0;
        } else if (this.id < anotherStud.id){
            return -1;
        } else {
            return 1;
        }
    }
}


/*class IdComparator implements Comparator<Students> {
    @Override
    public int compare(Students student1, Students student2) {
        if (student1.getId() == student2.getId()) {
            return 0;
        } else if (student1.getId() < student2.getId()) {
            return -1;
        } else {
            return 1;
        }
    }
}*/

class NameComparator implements Comparator<Students> {
    @Override
    public int compare(Students student1, Students student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

class SalaryComparator implements Comparator<Students> {
    @Override
    public int compare(Students student1, Students student2) {
        return student1.getSalary() - student2.getSalary();

    }
}
