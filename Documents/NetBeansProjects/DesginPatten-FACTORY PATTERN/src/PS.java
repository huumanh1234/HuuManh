/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SV
 */
public class PS {
     private int tu, mau;

    public PS() {
        tu = 1;
        mau = 1;
    }

    public PS(int n) {
        tu = n;
        mau = 1;
    }

    public PS(int t, int m) {
        tu = t;
        mau = m;
    }

    public void ganTu(int t) {
        tu = t;
    }

    public int layTu() {
        return tu;
    }

    public void ganMau(int g) {
        mau = g;
    }

    public int layMau() {
        return mau;
    }

    public void hienThi() {
        System.out.println("tu la: " + tu + "\nmau la: " + mau);
    }

    private static int UCLN(int t, int m) {
        if (t % m == 0) {
            return m;
        } else {
            return UCLN(m, t % m);
        }
    }

    private void rutGon() {
        int x = UCLN(this.mau, this.tu);
        this.tu /= x;
        this.mau /= x;
    }

    public PS cong(int n) {
        PS p = new PS(this.tu, this.mau);
        p.ganTu( n*p.layMau()+p.layTu());
        p.rutGon();
        return p;
    }
    public PS tru(int n){
        PS p=new PS(this.tu,this.mau);
        p.ganTu(n*p.layMau()-p.layTu());
        p.rutGon();
        return p;
    }
    public static void main(String args[]) {
        PS p1 = new PS(3,2);
        PS q = p1.tru(3);
        q.hienThi();
    }
}
  
    

        
        
    
            
     
   
            
    
        
    
        
                
        
            
     
        
}   
    
