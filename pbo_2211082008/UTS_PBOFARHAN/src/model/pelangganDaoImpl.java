/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC4
 */
public class pelangganDaoImpl implements pelangganDao{
     List<pelanggan> data = new ArrayList<>();
    public pelangganDaoImpl(){
        data.add(new pelanggan("550","aqmal","45","35","200","3%"));
       
    }
     public void save(pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index,pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public pelanggan getpelanggan(int index){
        return data.get(index);
    }
    public List<pelanggan> getAll(){
        return data;
    }
}


