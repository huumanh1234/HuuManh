
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
public class HPLyThuyet extends DiemHP {

    private int chuyenCan, giuaKy, cuoiKy;

    public HPLyThuyet(String tenHP, int soTinChi, int chuyenCan, int giuaKy, int cuoiKy) {
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    public void hienthi() {
        System.out.println("mon la: " + tenHP
                + "\nso tin chi:" + soTinChi
                + "\nchuyen can la:" + chuyenCan
                + "giua ky:" + giuaKy
                + "\ncuoi ky:" + cuoiKy);
    }

    public double tinhDiem() {
        return (chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7);
    }

}
