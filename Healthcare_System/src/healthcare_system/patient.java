
package healthcare_system;

import java.util.logging.Logger;

public class patient extends User{
    
    private String address ; 
    private int phoneNumber ;
    private char gender ;
    private String[]symptoms ;
    private String []diagnoses ;

    public patient() {
    }

    public patient(String address, int phoneNumber, char gender, String[] symptoms, String[] diagnoses, String userName, String mail, String password) {
        super(userName, mail, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.symptoms = symptoms;
        this.diagnoses = diagnoses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public String[] getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(String[] diagnoses) {
        this.diagnoses = diagnoses;
    }
    
    
  
    
}
