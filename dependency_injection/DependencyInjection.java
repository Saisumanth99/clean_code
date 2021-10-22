package dependency_injection;

interface Service{
    void printService();
}

class ServiceA implements Service {
    public void printService(){
        System.out.println("service A");
    }
}

class ServiceB implements Service {
    public void printService(){
        System.out.println("service B");
    }
}

class ServiceProvider {
    Service service;
    ServiceProvider(Service service){
        this.service = service;
    }
    void serviceProvider(){
        this.service.printService();
    }
}


public class DependencyInjection {
    public static void main(String[] args) {
        ServiceProvider sp;
        Service service;

        service = new ServiceA();
        sp = new ServiceProvider(service);
        sp.serviceProvider();

        service = new ServiceB();
        sp = new ServiceProvider(service);
        sp.serviceProvider();
    }
}
