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
    private ArrayList<Assignment2> jDetails; //stores employee details 
    
    public Employee_Details() {
        this.jDetails = new ArrayList<Assignment2>();
    }

    public ArrayList<Assignment2> getjDetails() {
        return jDetails;
    }

    public void setjDetails(ArrayList<Assignment2> Details) {
        this.jDetails = jDetails;
    }
    
    public Assignment2 addjEmployee(){
    Assignment2 jEmployee = new Assignment2();
    jDetails.add(jEmployee);
    return jEmployee;
    }
    public void Delete_Employee(Assignment2 jEmployee){
         jDetails.remove(jEmployee);
    }
    
    
}
