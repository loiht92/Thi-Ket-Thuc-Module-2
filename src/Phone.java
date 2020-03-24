
public class Phone {
    private String phoneNumber;
    private String contactList;
    private String name;
    private String gender;
    private String address;
    private String dateOfMonth;
    private String email;

    public Phone(){

    }
    public Phone(String phoneNumber, String contactList, String name, String gender, String address, String dateOfMonth, String email){
        this.phoneNumber = phoneNumber;
        this.contactList = contactList;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfMonth = dateOfMonth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactList() {
        return contactList;
    }

    public void setContactList(String contactList) {
        this.contactList = contactList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfMonth() {
        return dateOfMonth;
    }

    public void setDateOfMonth(String dateOfMonth) {
        this.dateOfMonth = dateOfMonth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", contactList='" + contactList + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dateOfMonth='" + dateOfMonth + '\'' +
                ", email='" + email +
                "]";
    }
}
