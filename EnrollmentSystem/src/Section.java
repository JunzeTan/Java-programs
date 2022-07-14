import java.util.ArrayList;

public class Section {
    private String sectionName;
    private int maxEnrolment;
    private ArrayList<Student> enrolledStudents;

    Section(String sectionName, int maxEnrolment) {
        enrolledStudents = new ArrayList<>();
        this.maxEnrolment = maxEnrolment;
        this.sectionName = sectionName;
    }

    boolean enrollStudent(Student student) {
        if (enrolledStudents.size() >= maxEnrolment)
            return false;
        enrolledStudents.add(student);
        return true;
    }

    public boolean unenrollStudent(Student student) {
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getStudentID() == student.getStudentID()) {
                enrolledStudents.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getSectionName() {
        return sectionName;
    }
}
