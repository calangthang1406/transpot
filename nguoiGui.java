/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class nguoiGui extends nguoi {
    String tinhng;

    public nguoiGui() {
    }
    Scanner sc = new Scanner(System.in);

    /* PHƯƠNG THỨC */
    // mảng các tỉnh miền nam
    // mảng các tỉnh miền trung
    // mảng các tỉnh miền bắc
    // nhập thông tin người gửi
    // xuất thông tin người gửi 
    /*nhập thông tin người gửi*/
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Vui long nhap dia chi tinh nguoi gửi: ");
	tinhng = sc.nextLine();

    }

}
