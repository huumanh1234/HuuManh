
import huumanh.DiemHP;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class HPThucHanh extends DiemHP {
    
    private int bd1,bd2,bd3;
   
    public HPThucHanh(String tenHP,int soTinChi,int bd1,int bd2,int bd3){
        super(tenHP,soTinChi);
        this.bd1=bd1;
        this.bd2=bd2;
        this.bd3=bd3;
    }
   
    public void hienthi(){
        System.out.println("tenHP"+tenHP+"\nso tin chi:"
                +tenHP+soTinChi+"\nbd1"+bd1
                +"\nbd2:"+bd2+"\nbd3:"+bd3);
    }    
   
    public double tinhDiem(){
        return ((bd1+bd2+bd3)/3);
    }    
}
