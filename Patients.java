
package Sibiya.MH;
import java.util.Date;
import javax.swing.JOptionPane;

public class Patients {
    
    private String firstName;
    private String lastName;
    private String Phone;
    private String PrescriptionMedication;
    private String address;
    private String pirNumber;
    private boolean isAdmitted;
    private Date admissionDate;
    private Date dischargeDate;
     
     public Patients()
     {
         //Default constructor 
     }
     
     // constructor with parameters
    public Patients(String firstName, String lastName, String Phone, 
                   String PrescriptionMedication, String address, String pirNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Phone = Phone;
        this.PrescriptionMedication = PrescriptionMedication;
        this.address = address;
        this.pirNumber = pirNumber;
        this.isAdmitted = false;
        this.admissionDate = null;
        this.dischargeDate = null;
    }

    // Getter and setter methods 
    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    // Helper method for admitting a patient
    public void admit(String firstName,String lastName,String pirNumber) {
        if (!isAdmitted) {
            isAdmitted = true;
            admissionDate = new Date();
            JOptionPane.showMessageDialog(null, firstName + " " + lastName + " with PIR number " + pirNumber + " has been admitted on " + admissionDate,"Admitted",JOptionPane.INFORMATION_MESSAGE );
        } 
    }

    // Helper method for discharging a patient
    public void discharge(String firstName,String lastName,String pirNumber) {
        if (isAdmitted) {
            isAdmitted = false;
            dischargeDate = new Date();
            
            //Displaying a message for discharge patient
            JOptionPane.showMessageDialog(null, firstName + " " + lastName + " with PIR number " + pirNumber + " has been discharged on " + dischargeDate,"Discharged",JOptionPane.INFORMATION_MESSAGE );
           
        } 
    }
}


