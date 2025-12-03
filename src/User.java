public class User {
    private String name;
    private String address;
    private String PhoneNumber;

    public User(String name, String address, String PhoneNumber){
        this.name = name;
        this.address = address;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
