/* Unit 4 School Project Student class
By: Monica Bacatan
 */

public class Student {
    /* Create fields
    Make fields private so they are only accessed within Student class
     */
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    private static int uniqueNumber = 1; // this is used to create a unique student number when student is constructed


    // Setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }


    // Method for appropriate constructor

    // Default student constructor
    Student(){
        firstName = "";
        lastName = "";
        grade = 12;
        studentNumber = uniqueNumber;
        uniqueNumber++;
    }
    // Student constructor with parameters
    Student(String firstName, String lastName, int grade, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = uniqueNumber;
        uniqueNumber++;
    }


    // Method to print out name and grade of a student
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }

}
