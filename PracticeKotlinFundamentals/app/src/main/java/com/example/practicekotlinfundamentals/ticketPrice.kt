package com.example.practicekotlinfundamentals

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age < 0 || age > 100 -> throw IllegalArgumentException("Invalid age: $age")
        age <= 12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        else -> 20
    }
}