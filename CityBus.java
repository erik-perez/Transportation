public class CityBus extends PublicTransit {
    public long RouteNumber;
    public int BeginOperationYear;
    public String LineName;
    public String DriverName;

    public long getRouteNumber() {
        return RouteNumber;
    }
    public void setRouteNumber(long routeNumber) {
        RouteNumber = routeNumber;
    }
    public int getBeginOperationYear() {
        return BeginOperationYear;
    }
    public void setBeginOperationYear(int beginOperationYear) {
        BeginOperationYear = beginOperationYear;
    }
    public String getLineName() {
        return LineName;
    }
    public void setLineName(String lineName) {
        LineName = lineName;
    }
    public String getDriverName() {
        return DriverName;
    }
    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public CityBus(){
        ticketPrice = 13.33;
        numOfStops = 26;
        RouteNumber = 2;
        BeginOperationYear =  1988;
        LineName = "Airport";
        DriverName = "Blane";


    }
    public CityBus(double ticketPrice, int numOfStops, long RouteNumber, int BeginOperationYear, String LineName, String DriverName){
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
        this.RouteNumber = RouteNumber;
        this.BeginOperationYear = BeginOperationYear;
        this.LineName = LineName;
        this.DriverName = DriverName;

    }
    public CityBus(CityBus otherCB) {
        this.ticketPrice = otherCB.ticketPrice;
        this.numOfStops = otherCB.numOfStops;
        this.RouteNumber = otherCB.RouteNumber;
        this.BeginOperationYear = otherCB.BeginOperationYear;
        this.LineName = otherCB.LineName;
        this.DriverName = otherCB.DriverName;

    }

    public String toString() {
        return "This city bus line is the the " + this.LineName + " the ticket for this line  cost " + this.getTicketPrice() + "$, there are " + this.getNumOfStops() +
                " number of spots. The route number is " + this.getRouteNumber() +", and the begining operation year is " + this.BeginOperationYear + ", your driver name is " +this.DriverName;
    }
    public boolean equalto(CityBus otherCB) {
        if (this.ticketPrice == otherCB.ticketPrice && this.numOfStops == otherCB.numOfStops && this.RouteNumber == otherCB.RouteNumber &&
                this.BeginOperationYear == otherCB.BeginOperationYear && this.LineName == otherCB.LineName && this.DriverName == otherCB.DriverName)
            return true;
        else
            return false;
    }
}
