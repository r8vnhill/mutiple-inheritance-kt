package cl.ravenhill.audio

interface Recorder {
    fun setDuration(duration: Int)
}

class RecorderImpl : Recorder {
    private var duration = 0

    override fun setDuration(duration: Int) {
        this.duration = duration
        println("Setting duration to $duration")
    }
}
