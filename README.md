# Flight Waitlist Simulation

## 📌 Overview

This project simulates an **Airline Booking System** where:
- Passengers can **book flights** if seats are available.
- If the flight is **full**, passengers are placed on a **waitlist (FIFO order)**.
- When a passenger **cancels**, the next person in the **waitlist gets the seat**.

This system **uses Java data structures**:
- **Linked List** (`PassengerList`) for booked passengers.
- **Queue (FIFO)** (`WaitlistQueue`) for waitlisted passengers.

## Features

✅ **Book Flight:** Adds a passenger if space is available.<br> 
✅ **Waitlist Management:** Places extra passengers on a **waitlist** when full.<br>
✅ **Cancellation System:** Automatically **assigns the seat to the next waitlisted passenger**.<br>
✅ **FIFO Handling:** Waitlist follows **First In, First Out (FIFO)** order.<br>
✅ **Dynamic Seat Availability:** Updates seat count when passengers **cancel or get assigned**.<br>

## 📌 Technologies Used

- **Java (JDK 17+)**
- **Object-Oriented Programming (OOP)**
- **Linked Lists**
- **Queues (FIFO)**
- **Custom Data Structures**

## 📌 Setup Instructions

### 1️⃣ Clone the repository

```bash
git clone https://github.com/nannurinirupamreddy/Flight-Waitlist-Simulation.git
cd Flight-Waitlist-Simulation
```

### 2️⃣ Compile the java files

```cmd
javac Main.java
```

### 3️⃣ Run the Program

```cmd
java Main
```

## Code Structure

📦src<br>
|- 📜Passenger.java<br>
|- 📜PassengerList.java<br>
|- 📜WaitlistQueue.java<br>
|- 📜Flight.java<br>
|- 📜Main.java<br>

## Example Usage

### Booking Passengers

```java
Flight flight = new Flight();
flight.makeBooking(new Passenger("Alice", 101));
flight.makeBooking(new Passenger("Bob", 102));
flight.makeBooking(new Passenger("Charlie", 103));
flight.makeBooking(new Passenger("David", 104));
flight.makeBooking(new Passenger("Eve", 105));
flight.makeBooking(new Passenger("Frank", 106)); // Waitlisted
flight.makeBooking(new Passenger("Grace", 107)); // Waitlisted
```

### Cancelling Passengers

```java
flight.cancelBooking(103); // Charlie cancels, Frank gets his seat
flight.cancelBooking(104); // David cancels, Grace gets his seat
```

### Ouput

```java
Passenger: Alice, Ticket Number: 101 booked! Have a nice day!
Passenger: Bob, Ticket Number: 102 booked! Have a nice day!
Passenger: Charlie, Ticket Number: 103 booked! Have a nice day!
Passenger: David, Ticket Number: 104 booked! Have a nice day!
Passenger: Eve, Ticket Number: 105 booked! Have a nice day!
Passenger: Frank, Ticket Number: 106 added to waitlist!
Passenger: Grace, Ticket Number: 107 added to waitlist!

---------------------Cancellation---------------------
Passenger: Bob, Ticket Number: 102 cancelled!
Passenger: Frank, Ticket Number: 106 booked!
Passenger: Alice, Ticket Number: 101
Passenger: Charlie, Ticket Number: 103
Passenger: David, Ticket Number: 104
Passenger: Eve, Ticket Number: 105
Passenger: Frank, Ticket Number: 106
---------------------Cancellation---------------------

---------------------Cancellation---------------------
Passenger: Charlie, Ticket Number: 103 cancelled!
Passenger: Grace, Ticket Number: 107 booked!
Passenger: Alice, Ticket Number: 101
Passenger: David, Ticket Number: 104
Passenger: Eve, Ticket Number: 105
Passenger: Frank, Ticket Number: 106
Passenger: Grace, Ticket Number: 107 
---------------------Cancellation---------------------
```
