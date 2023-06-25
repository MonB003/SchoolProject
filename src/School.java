/* Unit 4 School Project School class
By: Monica 
 */

import java.util.ArrayList;

public class School {
    // Create an ArrayList of teachers
    ArrayList<Teacher> teachers = new ArrayList<>();
    // Create an ArrayList of students
    ArrayList<Student> students = new ArrayList<>();
    // Create an ArrayList of courses
    ArrayList<String> courses = new ArrayList<>();


    // FIELDS

    // Create 3 fields of my choosing
    private String name;
    private int age;
    private String gender;


    // Setters and getters for the 3 fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    // METHODS

    public static void main(String[] args) {
        // Create Arraylists for teachers and students
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        /* Method to add a teacher to list
         Create a new teacher
         Set a first name, last name and subject
         Use the "add" method to add teacher to the teachers list
         */
        Teacher teacher = new Teacher("Billy", "Jones", "Biology");
        teachers.add(teacher);
        System.out.println("Teacher List: " + teachers);

        // Method to delete teacher from list, use "remove" method
        teachers.remove(teacher);

        // Method to show all teachers
        System.out.println("New Teacher List: " + teachers);


        /* Method to add a student to list
         Create a new student
         Set a first name, last name and grade (student number will be generated when student is constructed)
         Use the "add" method to add student to the students list
         */
        Student student = new Student("Cathy", "Ren", 12, 1);
        students.add(student);
        System.out.println("Student List: " + students);

        // Method to delete student from list, use "remove" method
        students.remove(student);

        // Method to show all students
        System.out.println("New Student List: " + students);
    }


    // Method for appropriate constructor

    // Default school constructor
    School () {
        name = "";
        age = 18;
        gender = "";
    }
    // School constructor with parameters
    School (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
