package Model;

public class Service {
    private int serviceID;
    private String serviceName;
    private double hourlyRate;

    // Constructor
    public Service(){

    }

    public Service(int sID, String sName, double hRate){
        this.serviceID = sID;
        this.serviceName = sName;
        this.hourlyRate = hRate;
    }

    // Getters and Setters
    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
