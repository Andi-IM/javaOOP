/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja16_13042020.DAO;

import java.util.ArrayList;
import java.util.List;
import pja16_13042020.Model.TokoRecord_Model;

/**
 *
 * @author Andi
 */
public class TokoRecord_DAO implements TokoRecord_Interface{
    private List<TokoRecord_Model> data = new ArrayList<TokoRecord_Model>();
     
    @Override
    public void insert(TokoRecord_Model t) {
       data.add(t);
    }

    @Override
    public void update(int index, TokoRecord_Model t) {
       data.set(index, t);
    }

    @Override
    public void delete(int index) {
       data.remove(index);
    }

    @Override
    public TokoRecord_Model getTokoRecord(int index) {
       return data.get(index);
    }

    @Override
    public List<TokoRecord_Model> getData() {
       return data;
    }    
}
