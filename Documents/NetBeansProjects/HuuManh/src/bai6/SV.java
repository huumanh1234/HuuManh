/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;


import java.util.Date;

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
        System.out.println("ten la:"+hoTen+"\nngay sinh la: "+ngaySinh
                +"\ndtb la: "+dtb+"\nlay tuoi: "
                +this.layTuoi()+"\nho: "+this.layHo()+"\nten: "
                +this.layTen()+"\nho dem: "
                +this.layHoDem()+"\ntuoi: "+this.layTuoi()+"\nxep loai: "+this.xepLoai());
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

    public String layHoDem(){
        String hoDem;
        hoDem =hoTen.substring(hoTen.indexOf(' '),hoTen.lastIndexOf(' '));
        return hoDem;
    }
    public int layTuoi(){
        int namhientai;
        int sinhnhat;
        namhientai=new Date().getYear()+1900;
        sinhnhat= ngaySinh.getYear()+1900;
        return namhientai-sinhnhat;
    }
    public String xepLoai(){
        String xepLoai ="";
        if(dtb<5){
            xepLoai= "yeu";
        }    
        else if(dtb<7){
            xepLoai= "Trung binh";
        }
        else if(dtb<8){
            xepLoai= "kha";
        }
        else{
            xepLoai= "gioi";
        }
        return xepLoai;
    }   

    
    public static void main(String[] args) {
       SV p = new SV("pham huu manh",new Date("10/10/2000"),4);
       p.hienThi();
    }

}


