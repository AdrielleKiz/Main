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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programmer p = new Programmer();

        p.setName("Julius Blanco");
        p.getName();
        p.setAge(29);
        p.setSalary(20000);
        p.setLanguage("Java");
        p.setDepartment("Dev");
        p.work();
        p.work();
        p.work();
        p.work();
        p.info();
    
        Accountant c = new Accountant();
        c.setCPA(true);
        c.setName("John Smith");
        System.out.println(c.getName());
        c.work();
        c.work();
        c.work();
        c.work();
        System.out.println("Pay calculated: " + c.calculatePay(p));
                
    }
    
}
