package com.example.bankprogramapp

fun main(){
    val dennisUser = BankAccount("Deni Panjagal",50.000)
    dennisUser.deposit(10.000)
    dennisUser.deposit(10.000)
    dennisUser.withdraw(5.000)
    dennisUser.displayTransactionHistory();
}