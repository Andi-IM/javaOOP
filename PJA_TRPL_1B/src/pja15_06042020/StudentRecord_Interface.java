/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja15_06042020;

import java.util.List;

/**
 *
 * @author Andi
 */
public interface StudentRecord_Interface {
    public void insert(StudentRecord_Model s);
    public void update(int index, StudentRecord_Model s);
    public void delete(int index);
    public StudentRecord_Model getStudentRecord(int index);
    public List<StudentRecord_Model> getData();
}
