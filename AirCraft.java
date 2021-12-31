public class AirCraft extends PublicTransit {
    public enum ClassType {Helicopter, Airline, Glider, Balloon};
    public enum MaintenanceType {Weekly, Monthly, Yearly};
    ClassType Class;
    MaintenanceType Maintenance;

    public	AirCraft(){
        ticketPrice = 333.33;
        numOfStops = 1;
        Class = ClassType.Airline;
        Maintenance = MaintenanceType.Weekly;
    }

    public AirCraft(double ticketPrice, int numOfStops, ClassType Class, MaintenanceType Maintenance){
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
        this.Maintenance = Maintenance;
        this.Class = Class;
    }

    public AirCraft(AirCraft otherAC) {
        this.ticketPrice = otherAC.ticketPrice;
        this.numOfStops = otherAC.numOfStops;
        this.Maintenance = otherAC.Maintenance;
        this.Class = otherAC.Class;
    }

    public ClassType getClassType() {
        return Class;
    }

    public void setClassType(ClassType classType) {
        Class = classType;
    }

    public MaintenanceType getMaintenanceType() {
        return Maintenance;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        Maintenance = maintenanceType;
    }



    public String toString() {

        return "The price for this AirCraft is " + this.getTicketPrice() + "$, there are " + this.getNumOfStops() +
                " number of stops along its route. The Aircraft type is " + this.getClassType() +" and it is cleaned " + this.getMaintenanceType() ;}

    public boolean equals(AirCraft otherAC) {
        if (this.ticketPrice == otherAC.ticketPrice && this.numOfStops == otherAC.numOfStops &&
                this.Maintenance == otherAC.Maintenance && this.Class == otherAC.Class)
            return true;
        else
            return false;
    }
}
	
	