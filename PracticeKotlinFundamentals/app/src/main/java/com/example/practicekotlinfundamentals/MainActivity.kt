package com.example.practicekotlinfundamentals

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary("morning", morningNotification)
    printNotificationSummary("evening", eveningNotification)
}

fun printNotificationSummary(timeOfDay: String, numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages $timeOfDay notifications!")
    } else {
        println("Your phone is blowing up! You have 99+ $timeOfDay notifications!!!")
    }
}
