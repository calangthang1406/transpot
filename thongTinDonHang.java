/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class thongTinDonHang {

    private String loaiHang;
    private int tienHang;
    private int trongLuong;
    private int cao;
    private int rong;
    private int tongTien;
    private int tongShip;
    private int thanhTien;
    private int khoiluong;

    public thongTinDonHang() {
    }

    Scanner a = new Scanner(System.in);

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public int getTienHang() {
        return tienHang;
    }

    public void setTienHang(int tienHang) {
        this.tienHang = tienHang;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
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

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getTongShip() {
        return tongShip;
    }

    public void setTongShip(int tongShip) {
        this.tongShip = tongShip;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Scanner getA() {
        return a;
    }

    public void setA(Scanner a) {
        this.a = a;
    }
    

 
    /* PHƯƠNG THỨC */
    // Nhập thông tin đơn hàng
    public void nhapthongtin() {
        System.out.println("NHẬP THÔNG TIN ĐƠN HÀNG: ");
        System.out.println("loại hàng: ");
        loaiHang = a.nextLine();
        System.out.println("nhập tiền hàng: ");
        tienHang = a.nextInt();
        System.out.println("nhập trọng lượng hàng: ");
        khoiluong = a.nextInt();
        System.out.println("nhập chiều cao hàng: ");
        cao = a.nextInt();
        System.out.println("nhập chiều rộng hàng: ()");
        rong = a.nextInt();
    }

    /*Nhập thông tin đơn hàng*/
    public void xuatthongtin() {
        /*System.out.println("---------------------------");
        System.out.println("xác nhận thông tin hàng");
        System.out.println("loại hàng: " + loaiHang);
        System.out.println("tiền hàng: " + tienHang);
        System.out.println("trọng lượng hàng: " + trongLuong);
        System.out.println("chiều cao hàng: " + cao);
        System.out.println("chiều rộng hàng: " + rong);*/

    }
    public void tinhTongTien(int trongLuong, int cao, int rong, int tienHang, int thanhTien) {
        if (khoiluong <= 10 && cao < 25 && rong < 25) {
            System.out.println("Xác nhận tiền hàng là: "+tienHang);
            tongShip = thanhTien;
            tongTien = tongShip + tienHang;
            System.out.println("tổng tiền là: " + tongTien);
        } else if (khoiluong > 10 && cao < 25 && rong < 25) {
            System.out.println("Xác nhận tiền hàng là: "+tienHang);
            System.out.println("khối lượng trên 10kg: +10000 phí ship");
            tongShip = thanhTien + 10000;
            tongTien = tongShip + tienHang;
            System.out.println("tổng phí ship là: " + tongShip);
            System.out.println("tổng tiền là: " + tongTien);
        } else if (khoiluong <= 10 && cao > 25 || rong > 25) {
            System.out.println("Xác nhận tiền hàng là: "+tienHang);
            System.out.println("chiều cao hoặc chiều rộng lớn hơn 25cm: +10000 phí ship");
            tongShip = thanhTien + 10000;
            tongTien = tongShip + tienHang;
            System.out.println("tổng phí ship là: " + tongShip);
            System.out.println("tổng tiền là: " + tongTien);
        } else if (khoiluong > 10 && cao > 25 || rong > 25) {
            System.out.println("Xác nhận tiền hàng là: "+tienHang);
            System.out.println("chiều cao hoặc chiều rộng lớn hơn 25cm và khối lượng lớn hơn 10kg +20000 phí ship");
            tongShip = thanhTien + 20000;
            tongTien = tongShip + tienHang;
            System.out.println("tổng phí ship là: " + tongShip);
            System.out.println("tổng tiền người nhận thanh toán là: " + tongTien);
        }
    }
}
