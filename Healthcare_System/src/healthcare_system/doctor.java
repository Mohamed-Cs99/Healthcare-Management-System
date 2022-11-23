
package healthcare_system;

public class doctor extends User {
    
    private String address ;
    private int PhoneNumber ;
    private String Speciality ;

    public doctor() {
    }

    public doctor(String address, int PhoneNumber, String Speciality, String userName, String mail, String password) {
        super(userName, mail, password);
        this.address = address;
        this.PhoneNumber = PhoneNumber;
        this.Speciality = Speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }
    
    
    
    
    
    
}
