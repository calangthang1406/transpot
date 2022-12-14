/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */


public class DK extends nguoiGui {
    

   

    @Override
    public void nhap() {

    }
    int thanhTien;

    public void kt(String tinhng, String tinhnn) {
        int giaMot = 35000;
        int giaHai = 40000;
        int giaBa = 45000;
        int giaBon = 50000;
        String tgGiaoHang;
        int tongtien = 0;
        int dem1 = -1;
        int dem2 = -1;
        String[] mang = {"Binh Phuoc", "Binh Duong", "Dong Nai", "Tay Ninh", "Ba Ria Vung Tau", "Thanh Pho Ho Chi Minh",
            "Long An", "Dong Thap", "Tien Giang", "Ben Tre", "Vinh Long", "Tra Vinh", "Hau Giang", "Kien Giang", "Soc Trang", "An Giang", "Bac Lieu", "Ca Mau", "Can Tho",
            "Thanh Hoa", "Nghe An", "Ha tinh", "Quang Binh", "Quang Tri", "Thua Thien Hue",
            "Da Nang", "Quang Nam", "Quang Ngai", "Binh Dinh", "Phu Yen", "Khanh Hoa", "Ninh Thuan",
            "Binh Thuan", "Kon Tum", "Gia Lai", "Dac Lac", "Dac Nong", "Lam Dong",
            "Lao Cai", "Yen Bai", "Dien Bien", "Hoa Binh", "Lai Chau", "Son La", "Ha Giang", "Cao Bang",
            "Bac Kan", "lang Son", "Tuyen Quang", "Thai Nguyen", "Phu Tho", "Bac Giang", "Quang Ninh",
            "Bac Ninh", "Ha Nam", "Ha Giang", "Ha Noi", "Hai Duong", "Hung Yen", "Hai Phong", "Nam Dinh",
            "Ninh Binh", "Thai Binh", "Vinh Phuc"};

        //Xac Dinh Dia Chi Nguoi Gui
        for (int i = 0; i < mang.length; i++) {
            if (mang[i].equalsIgnoreCase(tinhng)) {
                dem1 = i;
            }
        }

        //Xac Dinh Dia Chi Nguoi Nhan
        for (int j = 0; j < mang.length; j++) {
            if (mang[j].equalsIgnoreCase(tinhnn)) {
                dem2 = j;
            }
        }

        //Kiem tra trung dia chi va mien
        if (dem1==dem2) {
            thanhTien = giaMot;
            System.out.println("Phí ship: " + thanhTien);
            System.out.println("thời gian giao hàng là: 2 ngày");
        }
        else if ((dem1 >= 0 && dem1 <= 18 && dem2 >= 0 && dem2 <= 18) || (dem1 > 18 && dem1 <= 37 && dem2 > 18 && dem2 <= 37) || (dem1 > 37 && dem1 <= 63 && dem2 > 37 && dem2 <= 63)){
            thanhTien=giaHai;
            System.out.println("Phí ship: " + thanhTien);
            System.out.println("thời gian giao hàng là: 3 ngày");
            
        }
        else {
            thanhTien = giaBa;
            System.out.println("Phí ship: " + thanhTien);
            System.out.println("thời gian giao hàng là: 5 ngày");
        }

    }

    

    }


/* public void ktkichthuoc(int cao, int rong){
        if(cao>25||rong>25){
            int congshipkt=10000;
            System.out.println("kích thước chiều cao hoặc chiều rộng trên 25cm: +10000 phí ship");
        }
    }
        public void tinhTongTien(){*/
