package com.bignerdranch.nyethack

open class Room(val name: String) {

    fun description() = name
    open fun enterRoom() {
        narrate("There is nothing to do here")
    }

}