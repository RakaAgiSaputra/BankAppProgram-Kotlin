# Bank App Program

Sebuah aplikasi sederhana untuk simulasi bank dengan fitur dasar seperti deposit, penarikan, dan melihat riwayat transaksi.

## Package

- **Package:** `com.example.bankprogramapp`

## Kelas Utama

### BankAccount

Kelas ini merepresentasikan akun bank dengan beberapa fitur berikut:

- **Properties:**
  - `accountHolder`: Nama pemegang akun.
  - `balance`: Saldo akun.
  - `transactionHistory`: Riwayat transaksi (bersifat privat).

- **Fungsi:**
  - `deposit(amount: Double)`: Menambah saldo dan mencatat transaksi.
  - `withdraw(amount: Double)`: Mengurangi saldo jika jumlah penarikan tidak melebihi saldo, serta mencatat transaksi.
  - `displayTransactionHistory()`: Menampilkan seluruh riwayat transaksi.

### Contoh Kode

`BankAccount.kt`:
```kotlin
package com.example.bankprogramapp

class BankAccount(
    var accountHolder: String,
    var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            transactionHistory.add("Fail Transaction withdraw $$amount over then balance $$balance")
        } else {
            balance -= amount
            transactionHistory.add("$accountHolder withdraw $$amount, now balance $$balance")
        }
    }

    fun displayTransactionHistory() {
        for (i in transactionHistory.indices) {
            println("${i + 1} : ${transactionHistory[i]}")
        }
    }
}
```


kjl;jk
