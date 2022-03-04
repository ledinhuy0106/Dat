package main;

import model.HangHoa;
import service.HangHoaService;

import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        HangHoaService hangHoaService = new HangHoaService();
        HangHoa hangHoa=new HangHoa();
        int choice;
        do {
            System.out.println("");
            System.out.println(" 1 : Nhập danh sách ");
            System.out.println(" 2 : Xuất danh sách ");
            System.out.println(" 3 : sửa ");
            System.out.println(" 4 : Tìm kiếm");
            System.out.println(" 5 : sắp xếp");
            System.out.println(" 6 : xóa  ");
            System.out.println(" 7 : Hàng kế thừa ");
            System.out.println(" 8 : Đơn hàng có giá lớn nhất ");
            System.out.println(" 9 : thoát");
            choice = scanner.nextInt();
            if (choice < 9 && choice > 0) {
                switch (choice) {
//                    ok
                    case 1:
                        scanner.nextLine();
                        hangHoaService.create();
                       break;
//                        ok
                    case 2:
                        hangHoaService.findAll();
                        break;
                    case 3:
                        break;
//                 ok
                    case 4:
                        scanner.nextLine();
                        System.out.println("Nhập tên cần tìm");
                        String name = scanner.nextLine();
                        hangHoaService.findByName(name);
                        break;
                    case 5:
                        hangHoaService.sort();
                        break;
//                        ok
                    case 6:
                        System.out.println("Nhập vào id cần xóa: ");
                        int id = scanner.nextInt();
                        hangHoaService.delete(id);
                        break;
                    case 7:
                        hangHoaService.findAll2();
                        break;
                    case 8:
                        System.out.print("Đơn hàng có giá lớn nhất là: ");
                        hangHoaService.findmax();
                }

            } else if (choice < 0 || choice > 9) {
                System.out.println("chưa phát triển");
            } else System.out.println("End");

        } while (choice != 9);
    }
}
