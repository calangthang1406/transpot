/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;

public abstract class nguoi {

    private String hoTen;
    private String diaChi;

    private String sdt;

    public nguoi() {
    }

    public nguoi(String hoTen, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;

    }
    Scanner n = new Scanner(System.in);

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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void nhap() {

        System.out.println("Họ tên >>");
        hoTen = n.nextLine();
        System.out.println("nhập địa chỉ ( xã, huyện ) >>");
        diaChi = n.nextLine();
        System.out.println("nhập số điện thoại >>");
        sdt = n.nextLine();
    }

    public void xuatnguoinhan() {
        System.out.println("họ tên người nhận: " + hoTen);
        System.out.println("địa chỉ (xã, huyện) người nhận: " + diaChi);
        System.out.println("sdt người nhận: " + sdt);
    }

    public void xuatnguoigui() {
        System.out.println("họ tên người gửi: " + hoTen);
        System.out.println("địa chỉ người gửi: " + diaChi);
        System.out.println("sdt người gửi: " + sdt);
    }

}
