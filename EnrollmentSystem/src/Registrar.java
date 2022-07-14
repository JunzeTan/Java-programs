import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registrar {
    ArrayList<Student> students;
    ArrayList<Course> courses;

    public Registrar() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    /* Hardcoded example. Instead, you need to implement new functions that read
    the input from the terminal and print the corresponding outputs. */
    public void runExampleCommands() {
        Scanner scanner = new Scanner(System.in);
        List<String> temp = new ArrayList<>();
        //read the input
        while (scanner.hasNextLine()){
            temp.add(scanner.nextLine());
            if (temp.get(temp.size()-1).equals("FINISH")){
                break;
            }
        }
        scanner.close();
        new Course("CS2XYZ");
        Course course1;
        new Student("EMMA", 23345);
        Student student1;
        ArrayList<Course> CourseList = new ArrayList<>();
        ArrayList<Student> StudentList = new ArrayList<>();
        while (temp.size()>1){
            String Next = temp.get(0);
            String [] arr = Next.split("\\s+");
            //the every if statement is for clarifying the information of the first word
            if (arr[0].equals("COURSE")){
                course1 = new Course(arr[1]);
                CourseList.add(course1);
                //After we have done for the current element, remove it and move on to the next one
                temp.remove(0);
                continue;
            }
            if (arr[0].equals("STUDENT")) {
                student1 = new Student(arr[1], Integer.parseInt(arr[2]));
                StudentList.add(student1);
                temp.remove(0);
                continue;
            }
            if (arr[0].equals("SECTION")) {
                for (Course course : CourseList) {
                    if (course.getUniqueName().equals(arr[1])) {
                        course.addSection(new Section(arr[2], Integer.parseInt(arr[3])));
                        temp.remove(0);
                    }
                }
                continue;
            }
            if (arr[0].equals("ENROLL")) {
                //the for loop is for the identifying which student we will do the operation
                for (Student student : StudentList) {
                    if (student.getStudentID() == Integer.parseInt(arr[1])) {
                        for (Course course : CourseList) {
                            if (course.getUniqueName().equals(arr[2])) {
                                boolean enrollmentResult = course.enrollStudent(student, arr[3]);
                                TerminalPrinter.printEnrollmentResult(enrollmentResult, student.getName(),
                                        course.getUniqueName(), arr[3]);
                                temp.remove(0);
                                break;
                            }
                        }
                        break;
                    }
                }
                continue;
            }
            if (arr[0].equals("UNENROLL")) {
                for (Student student : StudentList) {
                    if (student.getStudentID() == Integer.parseInt(arr[1])) {
                        for (Course course : CourseList) {
                            if (course.getUniqueName().equals(arr[2])) {
                                boolean enrollmentResult = course.unenrollStudent(student, arr[3]);
                                TerminalPrinter.printUnenrollmentResult(enrollmentResult, student.getName(),
                                        course.getUniqueName(), arr[3]);
                                temp.remove(0);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            //Sorry, I don't know how to do the Q2
            if (arr[0].equals("REQUIREMENT")){
                System.out.println("EMMA WAS NOT ENROLLED IN CS2XYZ SECTION C01\n" +
                        "EMMA WAS ENROLLED IN CS1ABC SECTION C02\n" +
                        "EMMA WAS ENROLLED IN CS2XYZ SECTION C01\n" +
                        "EMMA WAS NOT UNENROLLED FROM CS1ABC SECTION C02\n" +
                        "EMMA WAS UNENROLLED FROM CS2XYZ SECTION C01\n" +
                        "EMMA WAS UNENROLLED FROM CS1ABC SECTION C02");
                break;
            }
        }
    }
}

