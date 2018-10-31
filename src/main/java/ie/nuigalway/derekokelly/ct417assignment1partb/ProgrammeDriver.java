package ie.nuigalway.derekokelly.ct417assignment1partb;

import ie.nuigalway.derekokelly.ct417assignment1.Module;
import ie.nuigalway.derekokelly.ct417assignment1.Programme;
import ie.nuigalway.derekokelly.ct417assignment1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author derek
 */
public class ProgrammeDriver {
    
    public static void main(String args[]) {
        
        DateTimeFormatter format = DateTimeFormat.forPattern("dd/mm/yyy");
        
        DateTime dob1 = format.parseDateTime("09/12/1997");
        DateTime dob2 = format.parseDateTime("01/08/1997");
        DateTime dob3 = format.parseDateTime("26/02/1996");
        DateTime dob4 = format.parseDateTime("15/05/1997");
        DateTime dob5 = format.parseDateTime("03/11/1998");
        
        Student s1 = new Student("John Smith", "20", "15123456", dob1);
        Student s2 = new Student("Adam Johnson", "21", "15654321", dob2);
        Student s3 = new Student("Mary White Smith", "22", "15734925", dob3);
        Student s4 = new Student("Joe Brown", "21", "15053749", dob4);
        Student s5 = new Student("Matthew Jordan", "19", "15805487", dob5);
        
        ArrayList<Student> ct417StudentList = new ArrayList<>();
        ct417StudentList.add(s1);
        ct417StudentList.add(s2);
        ct417StudentList.add(s3);
        
        ArrayList<Student> ee451StudentList = new ArrayList<>();
        ee451StudentList.add(s1);
        ee451StudentList.add(s3);
        ee451StudentList.add(s5);
        
        ArrayList<Student> ee445StudentList = new ArrayList<>();
        ee445StudentList.add(s2);
        ee445StudentList.add(s4);
        ee445StudentList.add(s5);
        
        Module CT417 = new Module("Software Engineering", "CT417", ct417StudentList);
        Module EE451 = new Module("SOC", "EE451", ee451StudentList);
        Module EE445 = new Module("DSP", "EE445", ee445StudentList);
        
        ArrayList<Module> eceModules = new ArrayList<>();
        eceModules.add(CT417);
        eceModules.add(EE451);
        eceModules.add(EE445);
        
        ArrayList<Module> eeeModules = new ArrayList<>();
        eeeModules.add(EE451);
        eeeModules.add(EE445);
        
        ArrayList<Module> csitModules = new ArrayList<>();
        csitModules.add(CT417);
        
        DateTime startDate = format.parseDateTime("01/09/2018");
        DateTime endDate = format.parseDateTime("31/08/2019");
        
        Programme ECE = new Programme("ECE", eceModules, startDate, endDate);
        Programme EEE = new Programme("EEE", eeeModules, startDate, endDate);
        Programme CSIT = new Programme("CSIT", csitModules, startDate, endDate);
        
        System.out.println(ECE.toString());
        System.out.println(EEE.toString());
        System.out.println(CSIT.toString());
        
    }    
}
