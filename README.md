# Design Patterns in Java

A hands-on reference repo of classic Gang of Four (GoF) design patterns implemented in Java, alongside Low-Level Design (LLD) practice problems.

---

## 📂 Repository Structure

```
design-patterns-java/
├── FactoryPattern/
├── StrategyPattern/
├── ObserverPattern/
│   └── WeatherApp/
├── ChainOfResponsiblityPattern/
├── Questions/ 
│   ├── ParkingSpot/
│   ├── TicTacToe/
│   ├── MeetingRoomBooking/
│   └── SnakeAndLadder/
└── Main.java
```

---

## 🧩 Design Patterns Implemented

### 1. Factory Pattern
**Category:** Creational

Creates objects without exposing the instantiation logic to the client. A factory method returns an instance of the appropriate class based on input, promoting loose coupling between the client and concrete classes.

**When to use:** When you need to create objects from a family of related classes and want to defer the decision of which class to instantiate.

---

### 2. Strategy Pattern
**Category:** Behavioral

Defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern lets the algorithm vary independently from clients that use it.

**When to use:** When you want to switch between different behaviors or algorithms at runtime without changing the client code.

---

### 3. Observer Pattern
**Category:** Behavioral  
**Example:** Weather App

Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. Implemented here as a Weather App where multiple display units subscribe to a weather station.

**When to use:** When a change in one object requires updating others, and you don't know how many objects need to change (event-driven systems, pub-sub).

---

### 4. Chain of Responsibility Pattern
**Category:** Behavioral

Passes a request along a chain of handlers. Each handler decides to process the request or pass it to the next handler in the chain.

**When to use:** When more than one object may handle a request, and the handler isn't known a priori (e.g., middleware pipelines, approval workflows).

---

## 🏗️ LLD Practice Problems

### Parking Spot
A Low-Level Design problem modeling a parking lot system — covering spot allocation, vehicle types, and ticketing logic.

### Tic Tac Toe
Models the classic 2-player game with a board, players, and win/draw condition checks.

### Snake and Ladder
Simulates the board game with dice rolling, snakes, ladders, and turn-based player movement.

---

## 🚀 Getting Started

**Prerequisites:** Java 8+

**Clone the repo:**
```bash
git clone https://github.com/00Hunter/design-patterns-java.git
cd design-patterns-java
```

**Compile and run:**
```bash
javac Main.java
java Main
```

Or open the project in your preferred IDE (IntelliJ IDEA / Eclipse / VS Code with Java extension) and run individual pattern classes directly.

---

## 🛠️ Tech Stack

- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)
- **Principles:** SOLID, GoF Design Patterns

---
*Built for learning and LLD interview preparation.*