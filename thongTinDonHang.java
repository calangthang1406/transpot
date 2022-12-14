import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class thongTinDonHang {

    private String loaiHang;
    private String tienHang;
    private String trongLuong;
    private int cao;
    private int rong;
    Scanner scanner = new Scanner(System.in);

    public thongTinDonHang() {
    }

    public thongTinDonHang(String loaiHang, String tienHang, String trongLuong, int cao, int rong) {
        this.loaiHang = loaiHang;
        this.tienHang = tienHang;
        this.trongLuong = trongLuong;
        this.cao = cao;
        this.rong = rong;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public String getTienHang() {
        return tienHang;
    }

    public void setTienHang(String tienHang) {
        this.tienHang = tienHang;
    }

    public String getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(String trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    /* PHƯƠNG THỨC */
    // Nhập thông tin đơn hàng
    public void nhap() {
        System.out.println("Nhap loai hang: ");
        loaiHang = scanner.nextLine();
        System.out.println("Tien hang: ");
        tienHang = scanner.nextLine();
        System.out.println("Trong luong: ");
        trongLuong = scanner.nextLine();
        System.out.println("Chieu cao: ");
        cao = scanner.nextInt();
        System.out.println("Chieu rong: ");
        rong = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Nhap loai hang: " + this.loaiHang + ",Tien hang" + this.tienHang + ",Trong luong " + this.trongLuong
                + ",Chieu cao" + this.cao + ",Chieu rong" + this.rong;
    }

}
