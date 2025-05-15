package za.ac.cput.util;

//import za.ac.cput.domain.Student;

public class ServiceHelper {

    public static boolean isNullOrEmpty(String service){
        if(service.isEmpty() || service == null) {
            return true;
        }
        return false;
    }


    public static String isProvideVerified(String studentIdentificationNumber){
        if(studentIdentificationNumber == null){
            return null;
        }
        return studentIdentificationNumber;
    }
}
