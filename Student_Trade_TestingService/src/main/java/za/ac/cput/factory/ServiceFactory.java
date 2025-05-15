package za.ac.cput.factory;
import za.ac.cput.domain.Service;
import za.ac.cput.util.ServiceHelper;

public class ServiceFactory {

//    public static Service createService(String serviceIdentification, String serviceType, String serviceDescription){
//        if(ServiceHelper.isNullOrEmpty(serviceIdentification)){
//            return null;
//        }
//
//        return new Service.Builder().setServiceIdentification(serviceIdentification).
//                setServiceType(serviceType).setServiceDescription(serviceDescription).build();
//    }

    public static Service createService(String serviceIdentification, String serviceType, String serviceDescription,
                                        double serviceRate, String serviceAvailabilityStatus, String serviceProvider){

        if(ServiceHelper.isNullOrEmpty(serviceIdentification)){
            return null;
        }

        return new Service.Builder().setServiceIdentification(serviceIdentification).setServiceDescription(serviceDescription).
                setServiceType(serviceType).setServiceRate(serviceRate).setServiceProvider(serviceProvider).
                setServiceAvailabilityStatus(serviceAvailabilityStatus).build();

    }
}
