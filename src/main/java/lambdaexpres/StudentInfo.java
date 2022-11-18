package lambdaexpres;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */
public class StudentInfo {

    void testStudents(List<Student> list, StudentChecks studentChecks) {
        list.forEach((st) -> {
            if (studentChecks.check(st)) {
                System.out.println(st);
            }
        });
    }



/*    void printStudentsOverGrade(List<Student> list, double grade) {
        list.forEach((st)-> {
            if(st.getAvgGrade() > grade){
                System.out.println(st);
            }
        });
    }
    void printStudentsUnderAge(List<Student> list, int age) {

        list.forEach((st)-> {
            if(st.getAge() < age){
                System.out.println(st);
            }
        });
    }
    void printStudentsMixCondition(List<Student> list, int age, double grade, char sex) {

        list.forEach((st)->{
            if(st.getAge() > age && st.getAvgGrade() < grade && st.getSex() == sex){
                System.out.println(st);
            }
        });
    }*/

}

class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Leonid", 'M', 29, 5, 9.8);
        Student student2 = new Student("Cristian", 'M', 34, 4, 6.8);
        Student student3 = new Student("Ivan", 'M', 45, 3, 5.7);
        Student student4 = new Student("Maria", 'F', 25, 2, 8.9);
        Student student5 = new Student("Igori", 'M', 19, 1, 10);
        Student student6 = new Student("Anatolii", 'M', 23, 6, 9.7);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        StudentInfo info = new StudentInfo();
        info.testStudents(studentList, new CheckOverGrade());
        /*info.testStudents(studentList, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.getAge() < 30;
            }
        });*/
        System.out.println("-----------------------------------------------------");
        /*info.testStudents(studentList,(Student st) -> {return st.getAge() < 30;});*/
        info.testStudents(studentList, st -> st.getAge() > 45);
        System.out.println("-----------------------------------------------------");
        info.testStudents(studentList,student ->student.getAvgGrade() > 7);
        System.out.println("-----------------------------------------------------");
        info.testStudents(studentList, student -> student.getAge() > 23 && student.getAvgGrade() > 4.5 &&
                student.getSex() == 'M');

/*        info.printStudentsOverGrade(studentList,8);
        System.out.println("-----------------------------------------------------");
        info.printStudentsUnderAge(studentList,34);
        System.out.println("-----------------------------------------------------");
        info.printStudentsMixCondition(studentList,23,6.7,'M');*/

    }
}

interface StudentChecks {
    boolean check(Student student);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.getAvgGrade() > 8;
    }
}
