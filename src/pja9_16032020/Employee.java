/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja9_16032020;

/**
 *
 * @author Andi
 */
public class Employee extends Person{
    @Override
    public String getName(){
        System.out.println("Employee Name: "+nama);
        return nama;
    }
    
    public static void main(String[] args) {
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        
        ref = studentObject; // Person menunjuk kepada object Student
        
        String temp = ref.getName(); //getname dari Student
                                    // class dipanggil
        System.out.println(temp);
        
        ref = employeeObject; // person menunjuk kepada object Employee
        
        //String temp = ref.getName(); // getName dari employee class 
                                     // dipanggil
        System.out.println(temp);
    }
}
