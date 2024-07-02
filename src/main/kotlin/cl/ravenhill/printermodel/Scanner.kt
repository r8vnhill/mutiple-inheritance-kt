package cl.ravenhill.printermodel

interface Scanner {
    fun scan(document: String)
}

class ScannerImpl : Scanner {
    private var scannedPages = 0

    override fun scan(document: String) {
        println("Scanning document: $document")
        scannedPages++
    }
}
