class WaitlistQueue {
    Passenger front;
    Passenger rear;
    public WaitlistQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public Passenger getFront() {
        return front;
    }

    public Passenger getRear() {
        return rear;
    }

    public void push(Passenger passenger) {
        if (isEmpty()) {
            front = passenger;
            rear = passenger;
            return;
        }
        rear.setNext(passenger);
        rear = passenger;
    }

    public Passenger pop() {
        if (isEmpty()) {
            return null;
        }
        if (front == rear) {
            Passenger temp = front;
            front = null;
            rear = null;
            return temp;
        }
        Passenger temp = front;
        front = front.getNext();
        return temp;
    }

    public Passenger peek() {
        if (isEmpty()) {
            return null;
        }
        return front;
    }

}
