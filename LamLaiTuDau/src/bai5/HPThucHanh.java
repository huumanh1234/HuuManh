package bai5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SV
 */
public class HPThucHanh extends DiemHP {
    private int db1,db2,db3;
    public HPThucHanh (String tenHP,int soTinChi,int db1,int db2,int db3){
        super(tenHP,soTinChi);
        this.db1=db1;
        this.db2=db2;
        this.db3=db3;
    }
     public void hienthi(){
        System.out.println("tenHP"+tenHP+"\nso tin chi:"
                +tenHP+soTinChi+"\nbd1"+bd1
                +"\nbd2:"+bd2+"\nbd3:"+bd3);
    public double tinhDiem(){
        return ((db1+db2+db3)/3);
    }






}