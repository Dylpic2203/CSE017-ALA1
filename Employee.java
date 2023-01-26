/**
 * Class that models an Employee entity that extends from a Person
 * @author Dylan Brunner
 * @version 1.0
 * Date of creation: January 25, 2023
 * Last modified: January 25, 2023
 */
public class Employee extends Person{
    //Data Members
    private int id;
    private String position;
    private double salary;
    /**
     * Default Constructor
     * no parameters
     * initializes the default Person constructor, id to 0, position to "none", and salary to 0.0
     */
    public Employee(){
        super();
        id = 0;
        position = "none";
        salary = 0.0;
    }
    /**
     * Constructor with seven parameters
     * @param	name for the name of a person
	 * @param	address for the address of a person
	 * @param	phone for the phone number of a person
	 * @param	email for the email address of a person
     * @param   id for the id number of an employee
     * @param   position for the position of an employee
     * @param   salary for the salary of an employee
     */
    public Employee(String name, String address, String phone, String email, int id, 
                    String position, double salary){
        super(name, address, phone, email);
        this.id = id;
        this.position = position;
        this.salary = salary;    
    }
    /**
     * Getter for the ID of an employee
     * @param no parameters
     * @return the value of the data member id
     */
    public int getID(){
        return id;
    }
    /**
     * Getter for the position of an employee
     * @param no parameters
     * @return the value of the data member position
     */
    public String getPosition(){
        return position;
    }
    /**
     * Getter for the salary of an employee
     * @param no parameters
     * @return the value of the data member salary
     */
    public double getSalary(){
        return salary;
    }
    /**
     * Setter for the ID of an employee
     * @param id to set the data member id
     * no return value
     */
    public void setID(int id){
        this.id = id;
    }
    /**
     * Setter for the position of an employee
     * @param position to set the data member position
     * no return value
     */
    public void setPosition(String position){
        this.position = position;
    }
    /**
     * Setter for the salary of an employee
     * @param salary to set the data member salary
     * no return value
     */
    public void setSalary(double salary){
        this.salary = salary;
    }
    /**
     * Method to get the Employee information
     * no parameters
     * @return formatted string using the value of the data members
     */
    public String toString(){
        String out = super.toString();
        out += String.format("\nID: %d\nPosition: %s\nSalary: $%.2f", id, position, salary);
        return out;
    }
}