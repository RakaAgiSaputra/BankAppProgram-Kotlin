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

`BankMain.kt`:
```kotlin
package com.example.bankprogramapp

fun main() {
    val dennisUser = BankAccount("Denis Panjagal", 50_000.0)
    dennisUser.deposit(10_000.0)
    dennisUser.deposit(10_000.0)
    dennisUser.withdraw(5_000.0)
    dennisUser.displayTransactionHistory()
}
```


- **Properties:**
  - `accountHolder`: Nama pemegang akun.
  - `balance`: Saldo akun.
  - `transactionHistory`: Riwayat transaksi (bersifat privat).
- **Fitur:**
  - `Deposit`: Menambah saldo ke akun.
  - `Withdraw`: Mengurangi saldo dengan jumlah yang ditentukan, dengan pemeriksaan apakah saldo mencukupi.
  - `Riwayat Transaksi`: Menyimpan dan menampilkan riwayat transaksi.
- **Teknologi**
Proyek ini dibangun menggunakan:
  - `Kotlin`
- **Persyaratan**
  - `Android Studio atau IDE yang mendukung Kotlin.`
  - `Java Development Kit (JDK).`
**Instalasi**
Clone repositori ini:
```bash
git clone https://github.com/RakaAgiSaputra/BankAppProgram-Kotlin.git
```
- Buka proyek di Android Studio atau IDE yang mendukung Kotlin.
- Jalankan aplikasi melalui BankMain.kt.
- Lisensi
- Proyek ini dilisensikan di bawah lisensi MIT. Lihat file LICENSE untuk informasi lebih lanjut.

**Kontribusi**
Terbuka untuk kontribusi! Ikuti langkah-langkah berikut jika ingin berkontribusi:
- `Fork` repositori ini.
- Buat branch fitur Anda `(git checkout -b fitur-anda).`
- Commit perubahan Anda `(git commit -m 'Tambah fitur').`
- `Push` ke `branch` `(git push origin fitur-anda).`
- Buat `Pull Request`.
## Kontak
Raka Agi Saputra
LinkedIn
