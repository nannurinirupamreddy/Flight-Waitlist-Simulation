class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.makeBooking(new Passenger("Alice", 101));
        flight.makeBooking(new Passenger("Bob", 102));
        flight.makeBooking(new Passenger("Charlie", 103));
        flight.makeBooking(new Passenger("David", 104));
        flight.makeBooking(new Passenger("Eve", 105));
        flight.makeBooking(new Passenger("Frank", 106));
        flight.makeBooking(new Passenger("Grace", 107));
        System.out.println();

        System.out.println("---------------------Cancellation---------------------");
        flight.cancelBooking(103);
        flight.displayBookings();
        System.out.println("---------------------Cancellation---------------------");

        System.out.println();

        System.out.println("---------------------Cancellation---------------------");
        flight.cancelBooking(104);
        flight.displayBookings();
        System.out.println("---------------------Cancellation---------------------");

    }
}
