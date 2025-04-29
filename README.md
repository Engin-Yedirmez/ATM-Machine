# ATM Machine Project

This is a simple Java console application that simulates an ATM (Automated Teller Machine). It allows users to log in with a user ID, check their account balance, withdraw funds, deposit money, and exit the session. The program loops infinitely so users can continuously access the ATM.

## 🎯 Features

- Supports **10 user accounts** with IDs from `0` to `9`.
- Each account starts with an initial balance of **$100**.
- Menu-driven interface for easy interaction.
- Functionalities:
  - ✅ View current balance
  - 💸 Withdraw money
  - 💰 Deposit money
  - 🚪 Exit to switch users
- If the user tries to withdraw more than their current balance, they are redirected to the deposit menu.
- All balances are stored in a **single array**, and updates are persisted in memory during runtime.

## 🧑‍💻 Requirements

- Java JDK 8 or higher
- Terminal / Command Prompt or an IDE like Eclipse or IntelliJ

### 📄 License
This project was developed for educational purposes and is shared as a sample academic assignment.