public class Ferry extends PublicTransit {
    public int BuildYear;
    public String ShipName;

    public int getBuildYear() {
        return BuildYear;
    }
    public void setBuildYear(int buildYear) {
        BuildYear = buildYear;
    }
    public String getShipName() {
        return ShipName;
    }
    public void setShipName(String shipName) {
        ShipName = shipName;
    }

    public Ferry(){
        ticketPrice = 65.5;
        numOfStops = 3;
        BuildYear = 2001;
        ShipName = "delilah";

    }

    public Ferry(double ticketPrice, int numOfStops, int BuildYear, String ShipName){
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
        this.BuildYear = BuildYear;
        this.ShipName = ShipName;
    }

    public Ferry(Ferry otherF) {
        this.ticketPrice = otherF.ticketPrice;
        this.numOfStops = otherF.numOfStops;
        this.BuildYear = otherF.BuildYear;
        this.ShipName = otherF.ShipName;
    }

    public String toString() {
        return "This Ferrys' name is " + this.getShipName() + ". The price of the ticket is " + this.getTicketPrice() +"$. It has " + this.getNumOfStops() + " stops along the route."
                + " the ferry was built in " + this.getBuildYear();
    }
    public boolean equals(Ferry otherF) {
        if (this.ticketPrice == otherF.ticketPrice && this.numOfStops == otherF.numOfStops &&
                this.BuildYear == otherF.BuildYear &&this.ShipName == otherF.ShipName)
            return true;
        else
            return false;
    }
}