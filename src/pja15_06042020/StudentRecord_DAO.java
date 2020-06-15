/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja15_06042020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andi
 * DAO (Data Access Object) kelas yang melakukan manipulasi data yang terdapat dalam database.
 * dapat berupa Create Read Update dan Delete (CRUD)
 */
public class StudentRecord_DAO implements StudentRecord_Interface{
    private List<StudentRecord_Model> data = new ArrayList<StudentRecord_Model>();

    @Override
    public void insert(StudentRecord_Model s) {
        data.add(s);
    }

    @Override
    public void update(int index, StudentRecord_Model s) {
        data.set(index, s);
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public StudentRecord_Model getStudentRecord(int index) {
       return data.get(index);
    }

    @Override
    public List<StudentRecord_Model> getData() {
       return data;
    }
    
    
}
