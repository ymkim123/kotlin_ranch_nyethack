package com.bignerdranch.nyethack

open class TownSquare : Room("THe Town Square") {
    override val status = "Bustling"
    private var bellSound = "GWONG"

    final override fun enterRoom() {
        narrate("The villagers rally and cheer as the hero enters")
        ringBell()
    }

    fun ringBell() {
        narrate("The bell tower announced the hero's presence: $bellSound")
    }
}