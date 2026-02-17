package com.bignerdranch.nyethack

class TownSquare : Room("THe Town Square") {
    override val status = "Bustling"

    override fun enterRoom() {
        narrate("The villagers rally and cheer as the hero enters")
    }
}