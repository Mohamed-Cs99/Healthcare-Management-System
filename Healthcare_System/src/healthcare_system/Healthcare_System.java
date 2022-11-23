
package healthcare_system;
import java.util.Vector;
public class Healthcare_System {

    public static void main(String[] args) {
       
       doctor dr1 = new doctor("Cairo",0142154,"Surgery","Gemy","gemy@gmail.com","gemy123"); 
       doctor dr2 = new doctor("Cairo",0142154,"Heart","Do7a","gemy@gmail.com","gemy123"); 
       String []arr1 = {"jfdkl","fdsf","fds"} ;
       String []arr2 = {"dfsf","ert"}; 
       patient p1 = new patient("giza",02544,'M',arr1,arr2,"Yasser","yasser@gmail.com","yasser34");
      
       patient p2 = new patient("Qalioub",02544,'M',arr1,arr2,"ebtsamm","ebtsaam@gmail.com","yasser34");
       patient p3 = new patient("aswan",02544,'M',arr1,arr2,"ebrahim","ebrahim@gmail.com","yasser34");
       admin adm = new admin("Ahmed","ah@cis.asu","113535");
         
//       adm.addDoctor(dr1);
//       adm.addDoctor(dr2);
//       adm.deleteDoctor(dr2);
//       adm.displayAllDoctors();
       adm.addPatient(p1);
       adm.addPatient(p2);
       adm.addPatient(p3);
       adm.deletePatient(p2);
       adm.displayAllPatients();
//      Vector<String>v = new Vector<String>(); 
//      v.add("Ahmed");
//      v.add("Mohammed"); 
//      v.add("Shawky"); 
//      v.remove(0);
//      for(int i = 0 ; i<v.size(); i++)
//      {
//          System.out.println(v.elementAt(i));
//      }
//              
        
        
        
        
        
    }
    
}
