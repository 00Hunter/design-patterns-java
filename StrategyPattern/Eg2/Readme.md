# Strategy Pattern – Payment System Example (Java 8)

## 📌 Problem Statement

We want to design a **Payment System** that supports multiple payment methods:

- UPI
- Credit Card
- Crypto

The system should:
- Be easy to extend
- Avoid large if-else blocks
- Follow clean OOP principles
- Be easy to test and maintain

---

# ❌ Implementation Without Strategy Pattern

```java
class PaymentService {

    public void processPayment(String type, int amount) {

        if (type.equals("UPI")) {
            System.out.println("Validating UPI details...");
            System.out.println("Paid " + amount + " using UPI");
        }

        else if (type.equals("CARD")) {
            System.out.println("Validating Card details...");
            System.out.println("Paid " + amount + " using Card");
        }

        else if (type.equals("CRYPTO")) {
            System.out.println("Validating Wallet...");
            System.out.println("Paid " + amount + " using Crypto");
        }

        else {
            System.out.println("Invalid payment type");
        }
    }
}
```
Problems With This Approach

1️⃣ Violates Open/Closed Principle  --- Every time we add a new payment type, we modify the existing class.

2️⃣ If-Else Explosion -- As payment types increase, this method becomes large and messy.

3️⃣ Tight Coupling -- PaymentService directly contains logic for every payment type.

4️⃣ Hard to Test -- Cannot test UPI or Card logic independently.

## How we solved this problem
### We took out the payment methods and modes 
```
interface PaymentStrategy {
    void pay(int amount);
    }
```
Then created Concrete implementation of payment methods

Then created a context class which will take the paymentMode as arg for its constructor and calls pay method with ammount as arg


## How Strategy Pattern Solves the Problem
✅ Open for Extension, Closed for Modification
To add a new payment type:
```declarative
class NetBankingPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid using NetBanking");
    }
}
```
✅ Removes If-Else Logic

Instead of checking payment type manually, behavior is injected at runtime.

✅ Loose Coupling

PaymentService depends only on the PaymentStrategy interface.

✅ Single Responsibility

Each class handles only its own logic.

1.Design Principles Applied
2.Open/Closed Principle
3.Single Responsibility Principle
4.Dependency Inversion Principle
5.Runtime Polymorphism