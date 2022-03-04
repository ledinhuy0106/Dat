package service;

import model.HangHoa;
import model.HangXuatKhau;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HangHoaService {
    public int index;
    HangHoa hangHoa = new HangHoa();

    private ArrayList<HangHoa> hangHoas = new ArrayList<>();
    private ArrayList<HangXuatKhau> hangXuatKhaus = new ArrayList<>();


    public ArrayList<HangHoa> getHangHoa() {
        return hangHoas;
    }

    public void setPupils(ArrayList<HangHoa> hangHoas) {
        this.hangHoas = hangHoas;
    }

    public void findAll() {
        for (HangHoa hangHoa : hangHoas) {
            System.out.println(hangHoa);
        }
    }public void findAll2() {
        for (HangXuatKhau hangXuatKhau : hangXuatKhaus) {
            System.out.println(hangXuatKhau);
        }
    }


    public int findIndexByid(int id) {
        for (int i = 0; i < hangHoas.size(); i++) {
            if (hangHoas.get(i).getMaHang() == 1) {
                return i;
            }
        }
        return 0;
    }

    public void delete(int id) {
        System.out.println("Đã xóa thành công id : " + id);
        int index = findIndexByid(id);
        hangHoas.remove(index);
    }

    public void sort() {
        hangHoas.sort((Comparator.comparing(HangHoa::getTenHang)));
    }

    public void findByName(String name) {
        for (HangHoa hoa : hangHoas) {
            if (hoa.getTenHang().contains(name)
            ) {
                System.out.println("" + hoa);
            }
        }
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập mã Hàng ");
            int maHang = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tên Hàng ");
            String tenHang = scanner.nextLine();
            System.out.println("Nhập Số lượng cần thêm");
            int soLuong = scanner.nextInt();
            System.out.println("Nhập đơn giá hàng cần thêm");
            Double donGia = scanner.nextDouble();
            HangHoa hangHoa2 = new HangHoa(maHang,tenHang, soLuong, donGia);
            hangHoas.add(hangHoa2);
            scanner.nextLine();
            System.out.println("có muốn thêm sp k?(y/n)");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void findmax() {
        int max = 0;
        for (int i = 0; i < hangHoas.size(); i++) {
            if (hangHoas.get(i).getDonGia() > max) {
                max = i;
                i = max;
                hangHoas.get(i);
            }
        }
    }
}
