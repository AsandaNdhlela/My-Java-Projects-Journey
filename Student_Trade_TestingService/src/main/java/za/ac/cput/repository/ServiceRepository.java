package za.ac.cput.repository;
import za.ac.cput.domain.Service;
import java.util.List;
import java.util.ArrayList;
import za.ac.cput.repository.IServiceRepository;
import za.ac.cput.repository.IRepository;

public class ServiceRepository implements IServiceRepository{

    private static IServiceRepository repository = null;
    private List<Service> serviceList;

    private ServiceRepository(){
        serviceList = new ArrayList<Service >();
    }

    public static IServiceRepository getRepository(){
        if(repository== null){
            repository = new ServiceRepository();
        }
        return repository;
    }

    @Override
    public Service create(Service service) {
        boolean serviceCreated = serviceList.add(service);

        if(serviceCreated){
            return service;
        }
        return null;
    }



    @Override
    public Service read(String serviceId) {
        if(serviceId == null){
            return null;
        }

        for (Service service: serviceList){
            if (service.getServiceIdentification().equalsIgnoreCase(serviceId)){
                return service;
            }
        }

        return null;
    }

    @Override
    public Service update(Service service) {

        String id = service.getServiceIdentification();
        Service oldService = read(id);

        if(oldService == null){
            return null;
        }

        boolean success = delete(id);
        if(success){
            if (serviceList.add(service)){
                return service;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String serviceId) {
        if(serviceId == null){
            return false;
        }

        Service serviceToDelete = read(serviceId);

        return serviceList.remove(serviceToDelete);
    }

    @Override
    public List<Service> getAll() {
        return serviceList;
    }

    //@Override
//    public Service create(Service service) {
//        return null;
//    }

   // @Override
//    public Object read(Object o) {
//        return null;
//    }

   // @Override
//    public Object update(Object o) {
//        return null;
//    }

    //@Override
//    public boolean delete(Object o) {
//        return false;
//    }
}
