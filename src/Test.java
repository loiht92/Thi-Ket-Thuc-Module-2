import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
        List<Phone> phoneList = new ArrayList<>();
        PhoneManager phoneManager = new PhoneManager(phoneList);
        int choose;
        String phoneNumber;
        while (true) {
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    phoneManager.show(phoneList);
                    break;
                case 2:
                    phoneManager.addPhone(phoneList);
                    break;
                case 3:
                    phoneNumber = phoneManager.inputPhoneNumber();
                    phoneManager.editPhone(phoneList, phoneNumber);
                    break;
                case 4:
                    phoneNumber = phoneManager.inputPhoneNumber();
                    phoneManager.deletePhone(phoneList, phoneNumber);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Không hợp lệ, bạn vui lòng chọn lại. ");

            }
            showMenu();
        }

    }


    public static void showMenu() {
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ----------");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách: ");
            System.out.println("2.Thêm mới: ");
            System.out.println("3.Cập nhật: ");
            System.out.println("4.Xoá: ");
            System.out.println("5.Tìm kiếm: ");
            System.out.println("6.Đọc từ File: ");
            System.out.println("7.Ghi vào file: ");
            System.out.println("8.Thoát: ");
            System.out.println("Chọn chức năng: ");

    }
}
