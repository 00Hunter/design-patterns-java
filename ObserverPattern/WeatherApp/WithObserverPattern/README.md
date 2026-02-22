# We use this pattern when there is one event and multiple listner are there 
Eg Weather station
Here mobile app, desktop app and dashboard all are waiting for temperature change instead of calling each and everyone one by one to tell the new temp we used observer pattern


# Observer Pattern (Observable–Observer) — Detailed Notes & README

The **Observer Pattern** is a behavioral design pattern used to create a **one-to-many dependency** between objects. When the state of one object changes, all its dependents are notified and updated automatically.

In plain words:

> **An Observable** (also called *Subject*) maintains a list of **Observers** (listeners/subscribers).  
> When the Observable changes state, it **notifies** all Observers.

---

## Table of Contents

- [1. When to Use Observer Pattern](#1-when-to-use-observer-pattern)
- [2. Core Terminology](#2-core-terminology)
- [3. Problem It Solves](#3-problem-it-solves)
- [4. The Design Goal](#4-the-design-goal)
- [5. Two Models: Push vs Pull](#5-two-models-push-vs-pull)
- [6. Without Observer Pattern (Tight Coupling)](#6-without-observer-pattern-tight-coupling)
- [7. With Observer Pattern (Loose Coupling)](#7-with-observer-pattern-loose-coupling)
- [8. Minimal Interfaces](#8-minimal-interfaces)
- [9. Example: Weather App (Pull Model)](#9-example-weather-app-pull-model)
- [10. Example: Weather App (Push Model with Generics)](#10-example-weather-app-push-model-with-generics)
- [11. Event Object Strategy (Best for Real Systems)](#11-event-object-strategy-best-for-real-systems)
- [12. Pros / Cons](#12-pros--cons)
- [13. Common Mistakes](#13-common-mistakes)
- [14. Observer vs Pub-Sub](#14-observer-vs-pub-sub)
- [15. Real-World Places You’ll See Observer](#15-real-world-places-youll-see-observer)
- [16. Interview-Friendly Explanation](#16-interview-friendly-explanation)
- [17. Checklist to Decide Quickly](#17-checklist-to-decide-quickly)

---

## 1. When to Use Observer Pattern

Use Observer when:

- One object changes and **many other objects must react**.
- You want to **add/remove listeners dynamically** at runtime.
- You want to avoid a “God class” that manually calls everything.
- You want the source of changes to be **open for extension** (new listeners) without modification.

Typical scenarios:

- Notifications (YouTube subscribers, alerts)
- UI updates (reactive UI)
- Stock price ticks (dashboards, alerts, analytics)
- Logging/auditing hooks
- System events in backend (Spring events, domain events)

---

## 2. Core Terminology

| Term | Meaning |
|------|---------|
| **Observable** (Subject) | The object being observed. It holds state and notifies changes. |
| **Observer** | The object that wants updates when the Observable changes. |
| **Subscribe/Register** | Observer adds itself to Observable’s list. |
| **Unsubscribe/Unregister** | Observer removes itself from Observable’s list. |
| **Notify** | Observable informs all observers that something changed. |

---

## 3. Problem It Solves

### Without Observer:
Your core object (e.g., WeatherStation) ends up directly calling every dependent:

- Mobile UI update
- Display board update
- Analytics update
- Alert system update

This causes:
- Tight coupling
- Constant modification to core class
- Harder testing
- Harder reuse

---

## 4. The Design Goal

The goal is **loose coupling**:

- ✅ Observable should not know concrete observer classes.
- ✅ Observers can be added/removed without changing Observable.
- ✅ Observable only knows: “I have a list of observers and they have an update method.”

Observer pattern improves:

- Extensibility
- Maintainability
- Testability
- Separation of concerns

---


## 5. Without Observer Pattern (Tight Coupling)

Example (bad design):

- `WeatherStation` depends on concrete classes
- Adding a new consumer forces code changes in WeatherStation

```java
class WeatherStation {
    private MobileApp mobile;
    private DisplayBoard display;
    private AnalyticsService analytics;

    void setTemperature(float t) {
        mobile.updateTemperature(t);
        display.showTemperature(t);
        analytics.record(t);
    }
}