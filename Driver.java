public class Driver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double cheapestTicket = 999999999999999999999.999999999999999999999;
        int cheapestIndex = 0;
        double expensiveTicket = 0;
        int expensiveIndex = 0;
        System.out.println("Welcome to our different modes of trasnportation!! there are currently 15 different ones available. Here they are!! \n");

        PublicTransit [] transportation = new PublicTransit[15];
        transportation [0] = new PublicTransit(3.25, 7);
        transportation [1] = new PublicTransit(6.25, 7);
        transportation [2] = new CityBus(3.33, 4, 981, 1990, "Downtown", "Lionel");
        transportation [3] = new CityBus(7.53, 12, 211, 1999, "Uptown", "Craig");
        transportation [4] = new CityBus(9.26, 22, 32, 2009, "Uptown", "Sam");
        transportation [5] = new Metro(5.25, 16, 888, 1993, "Arena", "Hommer", 10, "Toronto");
        transportation [6] = new Metro(4.25, 11, 129, 1988, "Port", "Marge", 21, "Montreal");
        transportation [7] = new Metro(3.25, 21, 823, 1965, "lincoln Express", "Bart", 13, "New York");
        transportation [8] = new Tram(3.50, 9, 88, 2002, "Red line", "Sarah", 75);
        transportation [9] = new Tram(0.95, 3, 186, 1998, "Green line", "Smith", 75);
        transportation [10] = new Ferry(13.25, 3, 1978, "Seashell");
        transportation [11] = new Ferry(23.25, 7, 1998, "Mobby");
        transportation [12] = new Ferry(65.75, 3, 2011, "Poseidon");
        transportation [13] = new AirCraft(300.99, 3, AirCraft.ClassType.Airline, AirCraft.MaintenanceType.Weekly);
        transportation [14] = new AirCraft(250.76, 3, AirCraft.ClassType.Balloon, AirCraft.MaintenanceType.Monthly);

        transportation [7].setNumOfStops(9);
        transportation [7].getNumOfStops();


        for (int i = 0; i < transportation.length ; i++) {
            if(transportation[i].getTicketPrice() < cheapestTicket) {
                cheapestTicket = transportation[i].getTicketPrice();
                cheapestIndex = i;
            }
            if(transportation[i].getTicketPrice() > expensiveTicket) {
                expensiveTicket = transportation[i].getTicketPrice();
                expensiveIndex	= i;

            }

            System.out.println(i + ". " + transportation[i]);
        }
        System.out.print("\nlets compare two different ones, the two being selected are the ones indexed at 1 and 14, are they the same? ");
        System.out.println(transportation [8] == transportation [6]);
        System.out.println("the cheapest ticket price is: " + cheapestTicket +"$");
        System.out.println("Which is indexed at " + cheapestIndex + ", its characterrsitics are: " +transportation[cheapestIndex]);
        System.out.println("the most expensive ticket price is: " + expensiveTicket+"$");
        System.out.println("Which is indexed at " + expensiveIndex + ", its characterrsitics are: " +transportation[expensiveIndex]);
    }
}
