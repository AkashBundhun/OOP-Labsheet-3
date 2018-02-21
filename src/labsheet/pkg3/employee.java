/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet.pkg3;

import java.io.Serializable;

/**
 *
 * @author corei5
 */
public class employee implements Serializable{
    String surname;
    String othername;
    String nic;
    String location;
    String gender;
    String position;
    double salary;

    public employee(String surname, String othername, String nic, String location, String gender, String position, double salary) {
        this.surname = surname;
        this.othername = othername;
        this.nic = nic;
        this.location = location;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return(getSurname()+" "+getOthername()+" "+getNic()+" "+getLocation()+" "
                +getGender()+" "+getPosition()+" "+getSalary());
    }

}
