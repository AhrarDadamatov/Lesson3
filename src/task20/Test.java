package task20;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Tom", "468");
        Teacher teacher = new Teacher("katy", "Algebra");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
