/**
 * Class that models a Faculty entity that extends from an Employee
 * @author Dylan Brunner
 * @version 1.0
 * Date of creation: January 25, 2023
 * Last modified: January 25, 2023
 */
public class Faculty extends Employee{
    //Data Members
    private String rank;
    /**
     * Default Constructor
     * no parameters
     * initializes the default Employee constructor, and rank to "none"
     */
    public Faculty(){
        super();
        rank = "none";
    }
    /**
     * Constructor with eight parameters
     * @param	name for the name of a person
	 * @param	address for the address of a person
	 * @param	phone for the phone number of a person
	 * @param	email for the email address of a person
     * @param   id for the id number of an employee
     * @param   position for the position of an employee
     * @param   salary for the salary of an employee
     * @param   rank for the rank of a faculty
     */
    public Faculty(String name, String address, String phone, String email, int id, 
                   String position, double salary, String rank){
        super(name, address, phone, email, id, position, salary);
        this.rank = rank;
    }
    /**
     * Getter for the rank of a faculty
     * @param no parameters
     * @return the value of the data member rank
     */
    public String getRank(){
        return rank;
    }
    /**
     * Setter for the rank of a faculty
     * @param rank to set the data member rank
     * no return value
     */
    public void setRank(String rank){
        this.rank = rank;
    }
    /**
     * Method to get the Faculty information
     * no parameters
     * @return formatted string using the value of the data members
     */
    public String toString(){
        String out = super.toString();
        out += String.format("\nRank: %s", rank);
        return out;
    }
}