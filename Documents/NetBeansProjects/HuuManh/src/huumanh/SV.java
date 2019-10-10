
    import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SV
 */
public class SV {
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    public SV (String hoTen,Date ngaySinh,double dtb){
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.dtb=dtb;
    }
    public String layHoTen(){
        return hoTen;
    }
    public void ganHoTen(String ht){
        hoTen=ht;
    }
    public Date layNgaySinh(){
        return ngaySinh;
    }
    public void ganNgaySinh(Date ns){
        ngaySinh=ns;
    }
     public double laydtb(){
        return dtb;
    }
    public void gandtb(double dtb){
        this.dtb=dtb;
    }
    public void hienThi(){
        System.out.println("ten la:"+hoTen+"\nngay sinh la: "+ngaySinh+"\ndtb la: "+dtb+"\nlay tuoi: "+this.laytuoi());
    }
    public String layHo(){
        String ho;
        this.hoTen=hoTen.trim();
        int i= hoTen.indexOf(' ');
        ho =hoTen.substring(0,i);
        return ho;
    }
    public String layTen(){
        String Ten;
       
        int i= hoTen.lastIndexOf(' ');
        Ten =hoTen.substring(i+1);
        return Ten;
    }
    public String layTenDem(){
        String tenDem;
        tenDem =hoTen.substring(hoTen.indexOf(' '),hoTen.lastIndexOf(' '));
        return tenDem;
    }
    public int laytuoi(){
        int yearsNow;
        int bd;
        yearsNow=new Date().getYear()+1900;
        bd= ngaySinh.getYear()+1900;
        return yearsNow-bd;
        
        
    }
    public static void main(String[] args) {
       SV p = new SV("pham huu manh",new Date("10/10/2000"),10);
       p.hienThi();
    }
    
}

    

