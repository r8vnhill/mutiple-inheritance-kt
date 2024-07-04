package cl.ravenhill.printermodel

interface Printer {
    fun print(document: String)
}

class PrinterImpl : Printer {
    private var printedPages = 0

    override fun print(document: String) {
        println("Printing document: $document")
        printedPages++
    }
}
