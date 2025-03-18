class Flight {
    private static final int MAX_SEATS = 5;
    private int availableSeats;
    private PassengerList passengerList;
    private WaitlistQueue waitlistQueue;

    public Flight() {
        availableSeats = MAX_SEATS;
        passengerList = new PassengerList();
        waitlistQueue = new WaitlistQueue();
    }

    public void makeBooking(Passenger passenger) {
        if (availableSeats > 0) {
            passengerList.addPassenger(passenger);
            System.out.println(passenger + " booked! Have a nice day!");
            availableSeats--;
        } else {
            waitlistQueue.push(passenger);
            System.out.println(passenger + " added to waitlist!");
        }
    }

    public void cancelBooking(int ticketNumber) {
        if (passengerList.isEmpty()) {
            System.out.println("No passengers available!");
            return;
        }
        if (waitlistQueue.isEmpty()) {
            Passenger cancelledPassenger = passengerList.removePassenger(ticketNumber);
            System.out.println(cancelledPassenger + " cancelled!");
            availableSeats++;
            System.out.println("There are " + availableSeats + " seats available!");
        } else {
            Passenger cancelledPassenger = passengerList.removePassenger(ticketNumber);
            System.out.println(cancelledPassenger + " cancelled!");
            System.out.println(waitlistQueue.peek() + " booked!");
            Passenger waitingPassenger = waitlistQueue.pop();
            waitingPassenger.setNext(null);
            passengerList.addPassenger(waitingPassenger);
            availableSeats--;
        }
    }

    public void displayBookings() {
        passengerList.display();
    }

}
