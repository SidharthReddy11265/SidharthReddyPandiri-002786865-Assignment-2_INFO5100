/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainFrame;

import java.util.ArrayList;
import JavaMainFrame.Assignment2;

/**
 *
 * @author psidh
 */
public class Employee_Details {
    private ArrayList<Assignment2> Details; //stores employee details 
    
    public Employee_Details() {
        this.Details = new ArrayList<Assignment2>();
    }

    public ArrayList<Assignment2> getDetails() {
        return Details;
    }

    public void setDetails(ArrayList<Assignment2> Details) {
        this.Details = Details;
    }
    
    public Assignment2 addEmployee(){
    Assignment2 Employee = new Assignment2();
    Details.add(Employee);
    return Employee;
    }
    public void Delete_Employee(Assignment2 Employee){
         Details.remove(Employee);
    }
    
    
}
