class Passenger {
    private String passengerName;
    private int ticketNumber;
    private Passenger next;

    public Passenger(String passengerName, int ticketNumber) {
        this.passengerName = passengerName;
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Passenger getNext() {
        return next;
    }

    public void setNext(Passenger next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName + ", Ticket Number: " + ticketNumber;
    }

}