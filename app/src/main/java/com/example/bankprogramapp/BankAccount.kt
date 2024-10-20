package com.example.bankprogramapp

class BankAccount (
    var accountHolder: String,
    var balance: Double){
    private val transactionHistory = mutableListOf<String>()


    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double){
        if(amount > balance){
            transactionHistory.add("Fail Transaction withdraw $$amount over then balance $$balance")
        }else{
            balance -= amount;
            transactionHistory.add("$accountHolder withdraw $$amount, now balance $$balance")
        }
    }

    fun displayTransactionHistory(){
        for(i in transactionHistory.indices){
            println("${i + 1} : ${transactionHistory[i]}")
        }
    }

}