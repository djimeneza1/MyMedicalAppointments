import model.*;

import javax.jws.soap.SOAPBinding;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        showMenu();


        /*Doctor myDoctor = new Doctor("Daniel Jimenez","cardiologia");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");



        //System.out.println(myDoctor.getAvailableAppointments());
        for (Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " "+aA.getTime());
        }

        User user=new Doctor("juan","carrasco");
        user.showDataUser();

        User userPa=new Patient("eder","jimenez");
        userPa.showDataUser();

        User user1=new User("paula","gutierrez") {
            @Override
            public void showDataUser() {
                System.out.println("Psicologa\n");
                System.out.println("Hospital: rebagliati");
                System.out.println("departamento: psicologia clinica");
            }
        };

        user1.showDataUser();*/

        /*ISchedulable iSchedulable=new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        ISchedulable iSchedulable1 = new AppointmentDoctor();
        iSchedulable1.schedule();*/

        /*System.out.println();
        System.out.println();
        Patient patient=new Patient("Alejandra","ale@gmail.com");
        System.out.println(patient);*/

        /*
        model.Patient patient = new model.Patient("Daniel","dj@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber()); */

    }


}