/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja17_27042020.dao;

import java.util.ArrayList;
import java.util.List;
import pja17_27042020.model.gaji_model;

/**
 *
 * @author Andi
 */
public class gaji_dao implements dao{
    private final List<gaji_model> data = new ArrayList<>();

    @Override
    public void insert(gaji_model g) {
        data.add(g);
    }

    @Override
    public void update(int index, gaji_model g) {
        data.set(index, g);
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public gaji_model getGajiModel(int index) {
        return data.get(index);
    }

    @Override
    public List<gaji_model> getData() {
        return data;
    }   
}
