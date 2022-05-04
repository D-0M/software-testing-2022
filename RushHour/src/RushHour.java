

public class RushHour {
    public String TrainTicketFare(double time) {
        // Using military time system (24 Hours)

        String ticketPrice = "";

        // Vague rush hour
        if (time <= 0 || time > 24)
            throw new IllegalArgumentException("Vague rush hour");

        // Rush hour
        if ((time >= 1 && time <= 9.50) || (time > 16 && time <= 19.50))
            ticketPrice = "Rush hour";
        // Light traffic (Not rush hour)
        if ((time > 9.50 && time <= 16) || (time > 19.50 && time <= 24))
            ticketPrice = "Light traffic";
        return ticketPrice;
    }

    public static void main(String[] args) {

        RushHour test = new RushHour();
        double x = 19.50;
        System.out.println(test.TrainTicketFare(x));
    }
}
