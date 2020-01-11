/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Students
 */
public class Accountant extends Employee implements Action {
    private boolean is_cpa;
    private double hours_worked;
    
    public void setCPA(boolean g){
        
    }
    
    
    @Override
    public String getName(){
        return name + " Accountant";        
    }
    
    public double calculatePay(Programmer hi){
        return hi.getHoursWorked() * hi.getSalary();
    }
    
    public Accountant(){
        
    }
    
    @Override
    public void work(){
        hours_worked++;
        System.out.println("I am coding ");        
    }
    

        @Override
    public void resign(){
        System.out.print("I, " + name + " Accounting" + " will resign");
    }
    /**
     *
     */
    @Override
    public void info(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Programmer");
    }
}
