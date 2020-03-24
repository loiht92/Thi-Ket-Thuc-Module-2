import java.io.*;
import java.util.List;

public class XuLiFile {
    public void writeFile(String path, List<Phone> phoneList) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < phoneList.size(); i++) {
                bufferedWriter.write("PhoneNumber:" + phoneList.get(i).getPhoneNumber() + "\n" + "ContactList:" + phoneList.get(i).getContactList() + "\n" + "Name:" + phoneList.get(i).getName() + "\n"
                        + "Gender:" + phoneList.get(i).getGender() + "\n" + "Address:" + phoneList.get(i).getAddress() + "\n" + "DateOfMonth:" + phoneList.get(i).getDateOfMonth() + "\n" + "Email:" + phoneList.get(i).getEmail());
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public void readFile(List<Phone> phoneList) throws IOException {
        File file = new File("contacts.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


    }


}
