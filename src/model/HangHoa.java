package model;

public class HangHoa {
    private int maHang;
    private String tenHang;
    private int soLuong;
    private double donGia;

    public HangHoa() {
    }

    public HangHoa(int maHang, String tenHang, int soLuong, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HangHoa(String tenHang, int soLuong, double donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    @Override
    public String toString(){
        return "Hàng:Mã Hàng: "+maHang+", "+
        "Tên Hàng: "+this.tenHang+", "+
        "Số Lượng: "+ soLuong+", "+
        "Giá: "+donGia+" VND";
    }
}
