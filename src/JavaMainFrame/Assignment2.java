package JavaMainFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.io.File;
/**
 *
 * @author psidh
 */
public class Assignment2 {
    private String First_Name;//Name of the employee
    private String Last_Name;
    private String Employee_ID;
    private Integer Age;// Age of an Employee
    private String Gender;//Gender of an Employee
    private String Start_Date; // Date of Joining
    private Integer Level; // Position or Job Level
    private String Team_Info; // Team or Project Info
    private String Position_Title; // Designation
    private Integer Mobile_Number; 
    private String Email_ID;
    private File Photo; //Photo of an Employee

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    public Integer getlevel() {
        return Level;
    }

    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    public String getTeam_Info() {
        return Team_Info;
    }

    public void setTeam_Info(String Team_Info) {
        this.Team_Info = Team_Info;
    }

    public String getPosition_Title() {
        return Position_Title;
    }

    public void setPosition_Title(String Position_Title) {
        this.Position_Title = Position_Title;
    }

    public Integer getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(Integer Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String Email_ID) {
        this.Email_ID = Email_ID;
    }

    public File getPhoto() {
        return Photo;
    }

    public void setPhoto(File Photo) {
        this.Photo = Photo;
    }
    @Override
    public String toString(){
    return First_Name;
    }
}

 
        
   