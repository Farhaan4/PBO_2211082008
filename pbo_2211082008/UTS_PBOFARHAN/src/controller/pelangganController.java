/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.formPDAM;
import model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PC4
 */
public class pelangganController {
    private formPDAM formPDAM;
    private pelangganDao pelangganDao;
    private pelanggan pelanggan;
    
    public pelangganController(formPDAM formPDAM){
        this.formPDAM = formPDAM;
        pelangganDao = new pelangganDaoImp1();
    }
    
    public void bersihForm(){
        formPDAM.getTxtkodepelanggan().setText("");
        formPDAM.getTxtnama().setText("");
       
    }
    
    public void savepelanggan(){
        pelanggan = new pelanggan();
        pelanggan.setkodepelanggan(formPDAM.getTxtkodepelanggan().getText());
        pelanggan.setnama(formPDAM.getTxtnama().getText());
       pelangganDao.save(pelanggan);
        javax.swing.JOptionPane.showMessageDialog(formPDAM, "Entri Ok");
    }
     public void getpelanggan(){
        int index = formPDAM.getTblpelanggan().getSelectedRow();
        pelanggan = pelangganDao.getpelanggan(index);
        if(pelanggan != null){
            formPDAM.getTxtkodepelanggan().setText(pelanggan.getNobp());
            formPDAM.getTxtNama().setText(pelanggan.getNama());
        }
    }
    
    public void updateAnggota(){
        int index = formPDAM.getTblpelanggan().getSelectedRow();
        pelanggan.setkodepelanggan(formPDAM.getTxtkodepelanggan().getText());
        pelanggan.setNama(formPDAM.getTxtNama().getText());
        pelangganDao.update(index,pelanggan);
    }
    
    public void deletepelanggan(){
        int index = formPDAM.getTblpelanggan().getSelectedRow();
        pelangganDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPDAM, "Delete");
    }
     public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPDAM.getTblpelanggan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<pelanggan> list = pelangganDao.getAll();
        for(pelanggan pelanggan : list){
            Object[] data = {
                anggota.getkodepelanggan(),
                anggota.getNama(),
               
            };
            tabelModel.addRow(data);
        }
    }
}
