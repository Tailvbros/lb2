import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getSurnameLength() > o2.getSurnameLength()) {
            return 1;
        } else if (o1.getSurnameLength() < o2.getSurnameLength()) {
            return -1;
        }
        return o1.compareTo(o2);
    }
    }


