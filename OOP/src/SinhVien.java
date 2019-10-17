/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SinhVien {
    
    private String hoTen;
    
    private int hp1,hp2,tc1,tc2;
    
    public SinhVien(String hoTen,int hp1,int hp2,int tc1,int tc2){
        this.hoTen=hoTen;
        this.hp1=hp1;
        this.hp2=hp2;
        this.tc1=tc1;
        this.tc2=tc2;
    }
    public double tinhDIB(){
        return (hp1*tc1+hp2*tc2)/(tc1+tc2);
    }
}
