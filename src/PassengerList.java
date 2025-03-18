class PassengerList {
    Passenger head;
    Passenger tail;
    int size;

    public PassengerList() {
        head = null;
        tail = null;
    }

    public void addPassenger(Passenger passenger) {
        if (head == null) {
            head = passenger;
            tail = passenger;
            return;
        }
        tail.setNext(passenger);
        tail = passenger;
        return;
    }

    public Passenger removePassenger(int ticketNumber) {
        if (isEmpty()) {
            return null;
        }

        if (head.getTicketNumber() == ticketNumber) {
            Passenger temp = head;
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            return temp;
        }

        Passenger current = head;
        while (current.getNext() != null && current.getNext().getTicketNumber() == ticketNumber) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            Passenger temp = current.getNext();
            current.setNext(current.getNext().getNext());


            if (temp == tail) {
                tail = current;
            }
            return temp;
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display(){
        if (isEmpty()) {
            System.out.println("No passengers found");
            return;
        }
        Passenger current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

}