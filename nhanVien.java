
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class nhanVien extends nguoi {
    private int maNv;
    Scanner scanner = new Scanner(System.in);

    public nhanVien(int maNv, String hoTen, String diaChi, String dịaChiTinh, String sdt) {
        super(hoTen, diaChi, dịaChiTinh, sdt);
        this.maNv = maNv;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

}
