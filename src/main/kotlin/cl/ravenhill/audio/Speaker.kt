package cl.ravenhill.audio

interface Speaker {
    fun increaseVolume()
    fun decreaseVolume()
}

class SpeakerImpl : Speaker {
    private var volume = 0

    override fun increaseVolume() {
        volume++
        println("Increasing volume to $volume")
    }

    override fun decreaseVolume() {
        volume--
        println("Decreasing volume to $volume")
    }
}
