/* Unit 4 School Project Teacher class
By: Monica 
 */

public class Teacher {
    /* Create fields
    Make fields private so they are only accessed within Teacher class
     */
    private String firstName;
    private String lastName;
    private String subject;


    // Method for appropriate constructor

    // Default teacher constructor
    Teacher(){
        firstName = "";
        lastName = "";
        subject = "";
    }
    // Teacher constructor with parameters
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    // Method for when teacher object is printed
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }


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

    public String getSubject() {
        return subject;
        }

    public void setSubject(String subject) {
        this.subject = subject;
        }

}
