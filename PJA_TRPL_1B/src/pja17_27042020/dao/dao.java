/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja17_27042020.dao;


import java.util.List;
import pja17_27042020.model.gaji_model;

/**
 *
 * @author Andi
 */
public interface dao {
    public void insert(gaji_model g);
    public void update(int index,gaji_model g);
    public void delete(int index);
    public gaji_model getGajiModel(int index);
    public List<gaji_model> getData();
}
