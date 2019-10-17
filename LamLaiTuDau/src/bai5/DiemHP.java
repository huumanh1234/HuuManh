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
public abstract class DiemHP {
    
    protected String tenHP;
    
    protected int soTinChi;
    
    public DiemHP(String tenHP,int soTinChi){
        this.tenHP=tenHP;
        this.soTinChi=soTinChi;
    }
    
    public String layTenHP(){
        return tenHP;
    }
    public int layTinChi(){
        return soTinChi;
    }
    public abstract void tinhDiem();
}    