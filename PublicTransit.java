public class  PublicTransit {

    public double ticketPrice;
    public int numOfStops;

    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public int getNumOfStops() {
        return numOfStops;
    }
    public void setNumOfStops(int numOfStops) {
        this.numOfStops = numOfStops;
    }

    public PublicTransit(){
        ticketPrice = 3.25;
        numOfStops = 6;

    }

    public PublicTransit(double ticketPrice, int numOfStops){
        this.ticketPrice = ticketPrice;
        this.numOfStops = numOfStops;
    }

    public PublicTransit(PublicTransit otherPT){
        this.ticketPrice = otherPT.ticketPrice;
        this.numOfStops = otherPT.numOfStops;
    }

    public String toString() {
        return "this public transportation has ticket price of " + this.getTicketPrice()  +"$ and it has " + this.getNumOfStops() +" on its route.";
    }

    public boolean equalsTo(PublicTransit otherPT) {
        if (this.numOfStops == otherPT.numOfStops && this.ticketPrice == otherPT.ticketPrice)
            return true;
        else
            return false;
    }

}
