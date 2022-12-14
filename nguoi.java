
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author PC
 */
public abstract class nguoi {
    private String hoTen;
    private String diaChi;
    private String dịaChiTinh;
    private String sdt;
    Scanner scanner = new Scanner(System.in);

    public nguoi() {
    }

    public nguoi(String hoTen, String diaChi, String dịaChiTinh, String sdt) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dịaChiTinh = dịaChiTinh;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDịaChiTinh() {
        return dịaChiTinh;
    }

    public void setDịaChiTinh(String dịaChiTinh) {
        this.dịaChiTinh = dịaChiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void nhap() {
        System.out.println("Nhap Ho va ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Ho ten: " + this.hoTen + ",Dia chi: " + this.diaChi + ",So dien thoai: " + this.sdt;
    }

}
