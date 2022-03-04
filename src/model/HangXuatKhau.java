package model;

import model.HangHoa;

public class HangXuatKhau extends HangHoa {
    private String counTry;
    private double tax=((super.getDonGia()/100)*10);

    public HangXuatKhau() {
    }

    public HangXuatKhau(String counTry, double tax) {
        this.counTry = counTry;
        this.tax = tax;
    }

    public HangXuatKhau(int maHang, String tenHang, int soLuong, double donGia, String counTry, double tax) {
        super(maHang, tenHang, soLuong, donGia);
        this.counTry = counTry;
        this.tax = tax;
    }

    public HangXuatKhau(String tenHang, int soLuong, double donGia, String counTry, double tax) {
        super(tenHang, soLuong, donGia);
        this.counTry = counTry;
        this.tax = tax;
    }

    public String getCounTry() {
        return counTry;
    }

    public void setCounTry(String counTry) {
        this.counTry = counTry;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Hàng Xuất khẩu: " + super.toString() +", "+
                "Quốc gia nhận hàng: "+ counTry+", "+
                "Thuế 10%: "+tax;
    }
}
