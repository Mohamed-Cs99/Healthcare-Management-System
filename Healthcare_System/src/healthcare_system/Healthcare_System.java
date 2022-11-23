
package healthcare_system;
import java.util.Vector;
public class Healthcare_System {

    public static void main(String[] args) {
       
       doctor dr1 = new doctor("Cairo",0142154,"Surgery","Gemy","gemy@gmail.com","gemy123"); 
       doctor dr2 = new doctor("Cairo",0142154,"Heart","Do7a","gemy@gmail.com","gemy123"); 
       
       admin adm = new admin("Ahmed","ah@cis.asu","113535");
         
       adm.addDoctor(dr1);
       adm.addDoctor(dr2);
       
       adm.displayAllDoctors();
        
      
        
        
        
        
        
    }
    
}
