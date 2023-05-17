/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC4
 */
public class pelanggan {
     private String kodepelanggan;
    private String nama;
      private String meterbulanini;
      private String meterbulanlalu;
       private String tarif;
       private String diskon;
      
      
    public pelanggan(){}
    
    public pelanggan(String kodepelanggan, String nama){
        this.kodepelanggan = kodepelanggan;
        this.nama = nama;
       
    }
    
    public void setkodepelanggan(String kodepelanggan){
        this.kodepelanggan = kodepelanggan;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setmeterbulanini(String meterbulanini){
        this.meterbulanini = meterbulanini;
    }
     public void setmeterbulanlalu(String meterbulanlalu){
        this.meterbulanlalu = meterbulanlalu;
    }
     public void settarif(String tarif){
        this.tarif = tarif;
    }
    public void setdiskon(String diskon){
        this.diskon = diskon;
    }
     
        
    public String getkodepelanggan(){
        return kodepelanggan;
    }
    public String getNama(){
        return nama;
    }
    public String getmeterbulanini(){
        return meterbulanini;
    }
    public String getmeterbulanlalu(){
        return meterbulanlalu;
    }
    public String gettarif(){
        return tarif;
    }
    public String getdiskon(){
        return diskon;
    }
}


