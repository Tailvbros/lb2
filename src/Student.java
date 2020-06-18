import import java.util.Comparator;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private String surname;
    private String group;
    private int brig;

    public int compareTo(Object obj) {
        return name.compareTo(((Student)obj).name);
    }

    public Student(String name, String surname, String group, int brig) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.brig = brig;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return brig == student.brig &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(group, student.group);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, group, brig);
    }

    public int getSurnameLength() {
        return surname.length();
    }

}
