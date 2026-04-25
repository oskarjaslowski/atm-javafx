# 🏧 ATM Simulator (JavaFX)

## 📌 Author

Oskar Jasłowski

This project is a graphical **ATM simulator application** written in **Java**, using **JavaFX** for the user interface.

---

## 🎯 Project Overview

The application simulates basic ATM functionality with a modern graphical interface.

Users can:
- log into an account using card number and PIN  
- check account balance  
- deposit money  
- withdraw money  

The project demonstrates:
- object-oriented programming  
- GUI development with JavaFX  
- multi-class project structure  

---

## 🧩 Features

### 🔐 Authentication
- Login using:
  - Card number
  - PIN
- Multiple predefined accounts

---

### 💰 Banking Operations
- Check balance
- Deposit money
- Withdraw money (with validation)

---

### 🎨 User Interface
- Built with JavaFX
- Dark-themed ATM-style design
- Styled using CSS
- Multiple screens (login, menu, transactions)

---

## 🧠 Project Structure
src/
├── atm/
│ ├── Main.java
│ ├── ATMApp.java
│ ├── model/
│ │ ├── Account.java
│ │ ├── Bank.java
│ ├── ui/
│ │ ├── LoginView.java
│ │ ├── MenuView.java
│ │ ├── TransactionView.java
│
├── resources/
│ └── style.css

---

## ⚙️ How to Run

### 1. Requirements
- Java JDK 17+
- JavaFX SDK from Gluon
- IntelliJ IDEA

---

### 2. Add JavaFX VM options

In IntelliJ → Run Configuration → VM options:
--module-path "PATH_TO_JAVAFX/lib" --add-modules javafx.controls

(Optional fix for warnings):
--enable-native-access=ALL-UNNAMED

---

### 3. Run Project

- Open `Main.java`
- Click ▶ Run

---

## 🔑 Demo Accounts

| Card Number | PIN  | Balance |
|-------------|------|---------|
| 1111        | 1234 | 1000    |
| 2222        | 4321 | 500     |

---

## 📦 Technologies

- Java
- JavaFX
- CSS (UI styling)

---

## 💡 Purpose

This project was created to:
- practice Java programming
- learn GUI development with JavaFX
- simulate real ATM banking logic
- improve object-oriented design skills

---

## 🚀 Future Improvements

- Save accounts to file (persistent data)
- Add ATM keypad UI (button input)
- Add transaction history
- Add animations and transitions
- Improve realistic ATM interface design

---

## 📄 License

This project is for educational and personal use.
