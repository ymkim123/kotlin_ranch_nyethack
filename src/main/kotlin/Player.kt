class Player {
    var name = "madrigal"
        get() = field.replaceFirstChar { it.uppercase() }
        private set(value) {
            field = value.trim()
        }

    fun castFireball(numFireballs:Int = 2) {
        narrate("A glass of Fireball springs into existence (x$numFireballs)")
    }
}