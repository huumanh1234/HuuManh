/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SV
 */
public class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private int chuyenCan,giuaKy,cuoiKy;
    public Diem( String tenHocPhan,int soTinChi,int chuyenCan,int giuaKy,int cuoiKy){
        this.tenHocPhan=tenHocPhan;
        this.soTinChi=soTinChi;
        this.chuyenCan=chuyenCan;
        this.giuaKy=giuaKy;
        this.cuoiKy=cuoiKy;
    }
    public void hienThi(){
        System.out.println("ten hoc phan: "+tenHocPhan+"\nso tin chi: "
                +soTinChi+"\ndiem chuyen can: "
                +chuyenCan+"\ndiem giua ky: "
                +giuaKy+"\ndiem cuoi ky: "+cuoiKy);
    }
    public double tinhDiem(){
        return((chuyenCan*0.1)+(giuaKy*0.2)+(cuoiKy*0.7)); 
    }
    public static void main(String args[]){
        Diem p1=new Diem("java",5,6,7,6);
        p1.hienThi();
        System.out.println((6*0.1)+(7*0.2)+(6*0.7));
    }
} 
