/* Unit 4 School Project Main class
By: Monica Bacatan
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Arraylists for teachers and students
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();


        /* Create 3 teachers that will be added to teachers Arraylist
        Set first name, last name and subject
         */
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Teacher");
        teacher1.setLastName("One");
        teacher1.setSubject("Math");

        Teacher teacher2 = new Teacher();
        teacher2.setFirstName("Teacher");
        teacher2.setLastName("Two");
        teacher2.setSubject("Physics");

        Teacher teacher3 = new Teacher();
        teacher3.setFirstName("Teacher");
        teacher3.setLastName("Three");
        teacher3.setSubject("English");


        /* Create 10 students that will be added to students Arraylist
        Set first and last name
        The grade and student number do not have to be set because they are already set in the student constructor from the student class
         */
        Student student1 = new Student();
        student1.setFirstName("Student");
        student1.setLastName("One");

        Student student2 = new Student();
        student2.setFirstName("Student");
        student2.setLastName("Two");

        Student student3 = new Student();
        student3.setFirstName("Student");
        student3.setLastName("Three");

        Student student4 = new Student();
        student4.setFirstName("Student");
        student4.setLastName("Four");

        Student student5 = new Student();
        student5.setFirstName("Student");
        student5.setLastName("Five");

        Student student6 = new Student();
        student6.setFirstName("Student");
        student6.setLastName("Six");

        Student student7 = new Student();
        student7.setFirstName("Student");
        student7.setLastName("Seven");

        Student student8 = new Student();
        student8.setFirstName("Student");
        student8.setLastName("Eight");

        Student student9 = new Student();
        student9.setFirstName("Student");
        student9.setLastName("Nine");

        Student student10 = new Student();
        student10.setFirstName("Student");
        student10.setLastName("Ten");


        // Add 10 students to student list using the "add" method
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);


        // Add 3 teachers to teacher list using the "add" method
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);


        // Display both lists with added students and teachers
        System.out.println("Student List: " + students);
        System.out.println("Teacher List: " + teachers);


        // Remove 2 students using the "remove" method
        students.remove(student1);
        students.remove(student2);


        // Remove 1 teacher using the "remove" method
        teachers.remove(teacher1);


        // Display both lists again but without the removed students and teacher
        System.out.println("New Student List: " + students);
        System.out.println("New Teacher List: " + teachers);

    }
}
