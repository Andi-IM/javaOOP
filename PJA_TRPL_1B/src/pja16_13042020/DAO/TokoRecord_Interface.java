/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja16_13042020.DAO;

import java.util.List;
import pja16_13042020.Model.TokoRecord_Model;
/**
 *
 * @author Andi
 */
public interface TokoRecord_Interface {
    public void insert(TokoRecord_Model t);
    public void update(int index, TokoRecord_Model t);
    public void delete(int index);
    public TokoRecord_Model getTokoRecord(int index);
    public List<TokoRecord_Model> getData();
}
