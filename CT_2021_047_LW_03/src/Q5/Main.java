package Q5;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Mr.Kesavan", "Object-Oriented Programming");

        Course course = new Course("Object-Oriented Programming", "CTEC 22043", lecturer);


        Student student = new Student("Yalini", "Information Communication Technology", "CTEC 22043");

        System.out.println("Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Student: " + student.getStudentName() + " - " + student.getDegreeName());

    }
}


