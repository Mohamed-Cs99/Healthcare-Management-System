
package healthcare_system;
import java.util.Vector ;
public class admin extends User{
    Vector<doctor>doc= new Vector<doctor>(); 
    Vector<patient>pt =new Vector<patient>(); 
    public admin() {
    }

    public admin(String userName, String mail, String password) {
        super(userName, mail, password);
    }
        
   
    public void addDoctor(doctor d){
        doc.add(d); 
    }
    public void addPatient(patient p )
    {
        pt.add(p); 
    }
    public void deleteDoctor(doctor d )
    {
        doc.remove(d); 
    }
    
    public void deletePatient(patient p)
    {
        pt.remove(p); 
    }
    
    public void displayAllDoctors()
    {
        for(int i = 0 ; i<doc.size(); i++)
        {
                
            System.out.println(doc.elementAt(i).getUserName());
            System.out.println(doc.elementAt(i).getPhoneNumber());
            System.out.println(doc.elementAt(i).getSpeciality());
            System.out.println(doc.elementAt(i).getAddress());
            System.out.println(doc.elementAt(i).getMail());         
        }
    }
     public void displayAllPatients()
    {
        for(int i = 0 ; i<pt.size(); i++)
        {
                
            System.out.println(pt.elementAt(i).getUserName());
            System.out.println(pt.elementAt(i).getPhoneNumber());
            System.out.println(pt.elementAt(i).getGender());
            System.out.println(pt.elementAt(i).getAddress());
            System.out.println(pt.elementAt(i).getMail());         
        }
    }
    
}
