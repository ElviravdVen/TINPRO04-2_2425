/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   12/12/2024          *                                                                                          *
 *******************************/

import java.util.Objects;

public class Student {
    private final String name;
    private final int studNummer;

    public Student(String name, int studNummer) {
        this.name = name;
        this.studNummer = studNummer;
    }
    public String getName() {
        return name;
    }

    public int getStudNummer() {
        return studNummer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studNummer=" + studNummer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studNummer == student.studNummer && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studNummer);
    }
}