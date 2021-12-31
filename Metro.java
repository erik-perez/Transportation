public class Metro extends CityBus {
    public int NumOfVehicules;
    public String NameOfCity;

    public int getNumOfVehicules() {
        return NumOfVehicules;
    }
    public void setNumOfVehicules(int numOfVehicules) {
        NumOfVehicules = numOfVehicules;
    }
    public String getNameOfCity() {
        return NameOfCity;
    }
    public void setNameOfCity(String nameOfCity) {
        NameOfCity = nameOfCity;
    }


    public Metro(){
        ticketPrice = 5.33;
        numOfStops = 19;
        RouteNumber = 39;
        BeginOperationYear =  1976;
        LineName = "Uptown";
        DriverName = "Jess";
        NumOfVehicules = 3;
        NameOfCity = "Montreal";

    }
    public Metro(double ticketPrice, int numOfStops, long RouteNumber, int BeginOperationYear, String LineName, String DriverName,int NumOfVehicules, String NameOfCity){
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
        this.RouteNumber = RouteNumber;
        this.BeginOperationYear = BeginOperationYear;
        this.LineName = LineName;
        this.DriverName = DriverName;
        this.NumOfVehicules = NumOfVehicules;
        this.NameOfCity = NameOfCity;
    }

    public Metro(Metro otherM) {
        this.ticketPrice = otherM.ticketPrice;
        this.numOfStops = otherM.numOfStops;
        this.RouteNumber = otherM.RouteNumber;
        this.BeginOperationYear = otherM.BeginOperationYear;
        this.LineName = otherM.LineName;
        this.DriverName = otherM.DriverName;
        this.NumOfVehicules = otherM.NumOfVehicules;
        this.NameOfCity = otherM.NameOfCity;
    }

    public String toString() {
        return "This Metro ticket price is " + this.getTicketPrice() + "$, the number of stops it takes is " + this.getNumOfStops() + ", the route number is " + this.getRouteNumber()
                +", its first year of operation is " + this.BeginOperationYear + ", this is the " + this.getLineName() +" line, your drivers' name is " + this.getDriverName()
                + ", there are " + this.getNumOfVehicules() + " number of vehicules in this metro, the name of the city is " + this.getNameOfCity();
    }
    public boolean equals(Metro otherM) {
        if (this.ticketPrice == otherM.ticketPrice && this.numOfStops == otherM.numOfStops && this.RouteNumber == otherM.RouteNumber &&
                this.BeginOperationYear == otherM.BeginOperationYear && this.LineName == otherM.LineName && this.DriverName == otherM.DriverName &&
                this.NumOfVehicules == otherM.NumOfVehicules && this.NameOfCity == otherM.NameOfCity)
            return true;
        else
            return false;
    }
}