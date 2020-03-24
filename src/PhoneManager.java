import java.util.List;
import java.util.Scanner;

public class PhoneManager {
    private List<Phone> phoneList;
    private Scanner scanner = new Scanner(System.in);

    public PhoneManager(List<Phone> phoneList){

    }

    public void addPhone(List<Phone> phoneList) {
    String phoneNumber = inputPhoneNumber();
    String contactList = inputContactList();
    String name = inputName();
    String gender = inputGender();
    String address = inputAddress();
    String dateOfMonth = inputDateOfMonth();
    String email = inputEmail();

    Phone phone = new Phone(phoneNumber, contactList, name, gender,address, dateOfMonth, email);
    phoneList.add(phone);
    }

    public void editPhone(List<Phone> phoneList, String phoneNumber){
        boolean isExisted = false;
        for (int i =0; i< phoneList.size(); i++){
            if (phoneList.get(i).getPhoneNumber().equals(phoneNumber)){
                isExisted = true;
                phoneList.get(i).setContactList(inputContactList());
                phoneList.get(i).setName(inputName());
                phoneList.get(i).setGender(inputGender());
                phoneList.get(i).setAddress(inputAddress());
                phoneList.get(i).setDateOfMonth(inputDateOfMonth());
                phoneList.get(i).setEmail(inputEmail());
                show(phoneList);
                break;
            }
        }
        if (!isExisted){
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }

    public void deletePhone(List<Phone> phoneList, String phoneNumber){
        Phone phone = null;
        for (int i =0; i< phoneList.size(); i++){
            if (phoneList.get(i).getPhoneNumber().equals(phoneNumber)){
                phone = phoneList.get(i);
                break;
            }

            if (phone != null){
                phoneList.remove(phone);
                show(phoneList);
            }else {
                System.out.println("Số điện thoại không hợp lệ.");
            }
        }
    }

    public void searchPhone(String name){


    }

    public String inputPhoneNumber() {
        System.out.println("Mời bạn nhập vào số điện thoại: ");
        return scanner.nextLine();

    }
    public String inputContactList() {
        System.out.println("Mời bạn nhập vào nhóm danh bạ: ");
        return scanner.nextLine();

    }

    public String inputName() {
        System.out.println("Mời bạn nhập vào họ và tên: ");
        return scanner.nextLine();

    }

    public String inputGender() {
        System.out.println("Mời bạn nhập vào giới tính: ");
        return scanner.nextLine();

    }

    public String inputAddress() {
        System.out.println("Mời bạn nhập vào địa chỉ: ");
        return scanner.nextLine();

    }

    public String inputDateOfMonth() {
        System.out.println("Mời bạn nhập vào ngày sinh: ");
        return scanner.nextLine();

    }

    public String inputEmail() {
        System.out.println("Mời bạn nhập vào email: ");
        return scanner.nextLine();

    }
    public void show(List<Phone> phoneList){
        for (Phone phone : phoneList){
            System.out.println("Phone Number:" +phone.getPhoneNumber());
            System.out.println("ContactList:"+phone.getContactList());
            System.out.println("Name:"+phone.getName());
            System.out.println("Gender:"+phone.getGender());
            System.out.println("Adress:"+phone.getAddress());
            System.out.println("DateOfMonth:" +phone.getDateOfMonth());
            System.out.println("Email:" +phone.getEmail());
        }
    }
}
