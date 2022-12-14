/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */

    import java.util.Scanner;

public class SuDungDK {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
                
                thongTinDonHang tn = new thongTinDonHang();
                nguoiGui ng1 = new nguoiGui();
                nguoiNhan nn1 = new nguoiNhan();
		DK a = new DK();
		ng1.nhap();
                nn1.nhap();
                nn1.xuatnguoinhan();
                tn.nhapthongtin();
            
                a.kt(ng1.tinhng,nn1.tinhnn);
                tn.tinhTongTien(tn.getTrongLuong(), tn.getCao(), tn.getRong(), tn.getTienHang(), a.thanhTien);
                
	}
}

    
