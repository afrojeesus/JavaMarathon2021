package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Max", "11A");
        Teacher teacher = new Teacher("Aljona", "Finnish");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();

        student.getName();
        teacher.getName();
        

    }
}
