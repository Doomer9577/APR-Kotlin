package com.example.practicekotlinfundamentals

fun main() {
    val myFoldablePhone = FoldablePhone()

    myFoldablePhone.checkPhoneScreenLight() // should be off
    myFoldablePhone.fold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight() // still off, because it's folded

    myFoldablePhone.unfold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight() // now it's on
}

open class phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = false) : phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}
