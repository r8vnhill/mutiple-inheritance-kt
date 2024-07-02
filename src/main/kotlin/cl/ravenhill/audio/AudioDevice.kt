package cl.ravenhill.audio

class AudioDevice(
    private val speaker: SpeakerImpl = SpeakerImpl(),
    private val recorder: RecorderImpl = RecorderImpl()
) : Speaker by speaker, Recorder by recorder
