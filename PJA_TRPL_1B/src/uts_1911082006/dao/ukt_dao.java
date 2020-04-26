/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_1911082006.dao;

import uts_1911082006.model.ukt_model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andi
 */
public class ukt_dao implements ukt_int{
    private List<ukt_model> data = new ArrayList<ukt_model>();
     
    @Override
    public void insert(ukt_model t) {
       data.add(t);
    }

    @Override
    public void update(int index, ukt_model t) {
       data.set(index, t);
    }

    @Override
    public void delete(int index) {
       data.remove(index);
    }
    
    @Override
    public List<ukt_model> getData() {
       return data;
    }    

    @Override
    public ukt_model getUKTRecord(int index) {
         return data.get(index);
    }
}
