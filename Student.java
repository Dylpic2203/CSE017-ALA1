/**
 * Class models a Student entity that extends from a Person
 * @author Dylan Brunner
 * @version 1.0
 * Date of creation: January 25, 2023
 * Last modified: January 25, 2023
 */
public class Student extends Person{
    //Data members
    private int id;
    private String major;
    /**
     * Default constructor
     * No parameters
     * initialize the default Person constructor, id to 0, and major to "none"
     */
    public Student(){
        super();
        id = 0;
        major = "none";
    }
    /**
	 * Constructor with six parameters
	 * @param	name for the name of a person
	 * @param	address for the address of a person
	 * @param	phone for the phone number of a person
	 * @param	email for the email address of a person
     * @param   id for the id number of a student
     * @param   major for the major of a student
	 */
    public Student(String name, String address, String phone, String email, int id, String major){
        super(name, address, phone, email);
        this.id = id;
        this.major = major;
    }
    /**
     * Getter for the ID of a student
     * @param no paramters
     * @return the value of the data member id
     */
    public int getID(){
        return id;
    }
    /**
     * Getter for the major of a student
     * @param no parameters
     * @return the value for the data member major
     */
    public String getMajor(){
        return major;
    }
    /**
     * Setter for the id of a student
     * @param id to set the data member id
     * no return value
     */
    public void setID(int id){
        this.id = id;
        return;
    }
    /**
     * Setter for the major of a student
     * @param major to set the data member major
     * no return value
     */
    public void setMajor(String major){
        this.major = major;
        return;
    }
    /**
     * Method to get the Student information
     * no parameters
     * @return formatted string using the value of the data members
     */
    public String toString(){
        String out = super.toString();
        out += String.format("\nID: %d\nMajor: %s", id, major);
        return out;
    }
}