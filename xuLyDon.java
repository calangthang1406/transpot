/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class xuLyDon {

    private int giaMot = 35000;
    private int giaHai = 40000;
    private int giaBa = 45000;
    private int giaBon = 50000;
    private String tgGiaoHang;
    private String tongTien;

    public xuLyDon() {
    }

    public xuLyDon(int giaMot, int giaHai, int giaBa, int giaBon, String tgGiaoHang, String tongTien) {
        this.giaMot = giaMot;
        this.giaHai = giaHai;
        this.giaBa = giaBa;
        this.giaBon = giaBon;
        this.tgGiaoHang = tgGiaoHang;
        this.tongTien = tongTien;
    }

    public int getGiaMot() {
        return giaMot;
    }

    public void setGiaMot(int giaMot) {
        this.giaMot = giaMot;
    }

    public int getGiaHai() {
        return giaHai;
    }

    public void setGiaHai(int giaHai) {
        this.giaHai = giaHai;
    }

    public int getGiaBa() {
        return giaBa;
    }

    public void setGiaBa(int giaBa) {
        this.giaBa = giaBa;
    }

    public int getGiaBon() {
        return giaBon;
    }

    public void setGiaBon(int giaBon) {
        this.giaBon = giaBon;
    }

    public String getTgGiaoHang() {
        return tgGiaoHang;
    }

    public void setTgGiaoHang(String tgGiaoHang) {
        this.tgGiaoHang = tgGiaoHang;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    // Điều kiện của thuật toán
// Dk1 nếu đia chi ( tinh ) nguời gửi trùng với người nhận và trọng luong <10 và chiểu cao và chiều rộng <25
// Dk2 nếu địa chỉ ( tỉnh ) người gửi trùng với người nhận và trong luong >10 và chiều cao và chiểu rộng >25
// Dk3 nếu địa chi ( tỉnh ) người gửi không trùng với nguời nhận và trọng lượng <10 và chiều cao và chiêu rộng <25
// Dk4 nếu địa chỉ ( tỉnh ) người gửi không trùng với người nhận và trọng lượng >10 và chiêu cao và chiều rộng >25
    
    // phương thức 
    /* ( xuất giá giao hàng )
    (Phí giao hàng):  Dk1 thì xuất ra màng hình "giaMot" Dk2 xuất  "giaHai" Dk 3 xuất "giaBa" Dk4 xuất "giaBon" 
     */
    
 /* ( xuất thời gian giao hàng )
    ( Thời gian giao hàng ): nếu chung tỉnh xuất " sau 3 ngày " khác tỉnh xuất " sau 5 ngày "
     */
    
 /* ( xuất tổng tiền )
    ( Tổng tiền ):  
    Dk1 xuất  "giaMot+tienHang" 
    Dk2 xuất "giaHai+tienHang" 
    Dk3 xuất "giaBa+tienHang" 
    Dk4 xuất "giaBon+tienHang"
     */
}
