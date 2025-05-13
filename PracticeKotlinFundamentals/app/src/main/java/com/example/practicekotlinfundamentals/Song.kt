package com.example.practicekotlinfundamentals

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val song = Song("Deer Dance", "System of a Down", 2010, 900)
    song.printDescription()
    println("Is it popular? ${song.isPopular}")
}
