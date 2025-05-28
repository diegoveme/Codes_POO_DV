public class App {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setName("Diego");
        student1.setId("63601");
        student1.setGrade(0, 76.0);
        student1.setGrade(1, 85.0);
        student1.setGrade(2, 79.0);
        student1.setGrade(3, 88.0);
        student1.setGrade(4, 91.0);

        student2.setName("Omar");
        student2.setId("63602");
        student2.setGrade(0, 83.5);
        student2.setGrade(1, 89.0);
        student2.setGrade(2, 92.0);
        student2.setGrade(3, 86.0);
        student2.setGrade(4, 87.5);

        student3.setName("Pedro");
        student3.setId("63603");
        student3.setGrade(0, 90.0);
        student3.setGrade(1, 88.0);
        student3.setGrade(2, 85.0);
        student3.setGrade(3, 82.0);
        student3.setGrade(4, 91.0);

        student4.setName("Mildret");
        student4.setId("63604");
        student4.setGrade(0, 95.0);
        student4.setGrade(1, 92.0);
        student4.setGrade(2, 89.0);
        student4.setGrade(3, 90.0);
        student4.setGrade(4, 93.0);

        student5.setName("David");
        student5.setId("63605");
        student5.setGrade(0, 60.0);
        student5.setGrade(1, 58.5);
        student5.setGrade(2, 65.0);
        student5.setGrade(3, 63.0);
        student5.setGrade(4, 62.0);

        System.out.println("\nClass results:\n");
        showStudentResult(student1);
        showStudentResult(student2);
        showStudentResult(student3);
        showStudentResult(student4);
        showStudentResult(student5);
    }

    public static void showStudentResult(Student student) {
        System.out.print("Student: " + student.getName());
        System.out.print(" | Average: " + student.calculateAverage());
        System.out.println(" | Status: " + (student.passed() ? "Passed |\n" : "Failed |\n"));
    }
}
