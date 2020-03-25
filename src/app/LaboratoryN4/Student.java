package app.LaboratoryN4;

/**
 * The utility class contains some ANSI escape codes 
 * for varicoloured output in console
 *
 * @version 1.0 25 Mar 2020
 * @author Rostyslav Nakarlovich
 */
class Colors {
    // Foreground color codes
    public static final String RESET = "\033[0m";      // RESET
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
}

/**
 * The class represents a single Student
 *  with some common properties
 *
 * @version 1.03 25 Mar 2020
 * @author Rostyslav Nakarlovich
 */
public class Student {
    private String firstName;
    private String lastName;
    private String subject;
    private int actualRate;
    private int desiredRate;

    public Student(String firstName, String lastName, String subject, int actualRate, int desiredRate) throws IllegalArgumentException {
        if (firstName.equals("") || lastName.equals("")) {
            throw new IllegalArgumentException("Field with empty name detected!");
        } else if (subject.equals("")) {
            throw new IllegalArgumentException("Field with empty subject detected!");
        } else if (actualRate < 0 || desiredRate < 0) {
            throw new IllegalArgumentException("Field with improper rate detected!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.actualRate = actualRate;
        this.desiredRate = desiredRate;
    }

    @Override
    public String toString() {
        StringBuilder studentToString = new StringBuilder(128);
        studentToString.append("First name: ").append(Colors.GREEN).append(this.firstName).append(Colors.RESET).append(", ")
            .append("last name: ").append(Colors.GREEN).append(this.lastName).append(Colors.RESET).append(", ")
            .append("subject: ").append(Colors.RED).append(this.subject).append(Colors.RESET).append(", ")
            .append("actual rate: ").append(Colors.YELLOW).append(this.actualRate).append(Colors.RESET).append(", ")
            .append("desired rate: ").append(Colors.BLUE).append(this.desiredRate).append(Colors.RESET);
        return studentToString.toString();
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public int getActualRate() { return this.actualRate; }
    public int getDesiredRate() { return this.desiredRate; }
}
