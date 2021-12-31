public class Tram extends CityBus {
    public int MaxSpeed;

    public int getMaxSpeed() {
        return MaxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public Tram(){
        ticketPrice = 3.33;
        numOfStops = 12;
        RouteNumber = 77;
        BeginOperationYear =  1997;
        LineName = "downtown";
        DriverName = "Dave";
        MaxSpeed = 12345;


    }
    public Tram(double ticketPrice, int numOfStops, long RouteNumber, int BeginOperationYear, String LineName, String DriverName, int MaxSpeed){
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
        this.RouteNumber = RouteNumber;
        this.BeginOperationYear = BeginOperationYear;
        this.LineName = LineName;
        this.DriverName = DriverName;
        this.MaxSpeed = MaxSpeed;
    }

    public Tram(Tram otherT) {
        this.ticketPrice = otherT.ticketPrice;
        this.numOfStops = otherT.numOfStops;
        this.RouteNumber = otherT.RouteNumber;
        this.BeginOperationYear = otherT.BeginOperationYear;
        this.LineName = otherT.LineName;
        this.DriverName = otherT.DriverName;
        this.MaxSpeed = otherT.MaxSpeed;
    }

    public String toString() {
        return "This Tram ticket price is " + this.getTicketPrice() + "$, the number of stops it takes is " + this.getNumOfStops() + ", the route number is " + this.getRouteNumber()
                +", its first year of operation is " + this.getBeginOperationYear() + ", the line name is " + this.getLineName() +", your driver is" +this.getDriverName()
                + ", this Tram max speed is " + this.getMaxSpeed();
    }
    public boolean equals(Tram otherT) {
        if (this.ticketPrice == otherT.ticketPrice && this.numOfStops == otherT.numOfStops && this.RouteNumber == otherT.RouteNumber &&
                this.BeginOperationYear == otherT.BeginOperationYear && this.LineName == otherT.LineName && this.DriverName == otherT.DriverName &&
                this.MaxSpeed == otherT.MaxSpeed)
            return true;
        else
            return false;
    }
}

