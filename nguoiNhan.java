/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class nguoiNhan extends nguoi {
    String tinhnn;

    public nguoiNhan() {
        
    }
    Scanner sc = new Scanner(System.in);

    /*nhập thông tin người nhận*/
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Vui long nhap dia chi tinh nguoi nhan: ");
	tinhnn = sc.nextLine();
    }

    /* xuất thông tin người nhận*/
    @Override
    public void xuatnguoinhan() {
        super.xuatnguoinhan(); 
        System.out.println("địa chỉ người nhận: "+tinhnn);
    }

}

// mảng các tỉnh miền nam
// mảng các tỉnh miền trung
// mảng các tỉnh miền bắc

