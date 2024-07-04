package cl.ravenhill.printermodel

/**
 * Interface representing a printer with the ability to print documents.
 *
 * ## Usage:
 * This interface defines the contract for printing documents, requiring an implementation of the `print` method.
 *
 * ### Example 1: Implementing the Printer Interface
 * ```
 * class CustomPrinter : Printer {
 *     override fun print(document: String) {
 *         println("Custom printing document: $document")
 *     }
 * }
 *
 * val printer = CustomPrinter()
 * printer.print("My Document")  // Output: Custom printing document: My Document
 * ```
 */
interface Printer {
    /**
     * Prints the specified document.
     *
     * @param document The document to be printed.
     */
    fun print(document: String)
}

/**
 * Implementation of the [Printer] interface.
 *
 * ## Usage:
 * This class provides a basic implementation of the `Printer` interface, keeping track of the number of printed pages.
 *
 * ### Example 1: Using PrinterImpl to Print Documents
 * ```
 * val printer = PrinterImpl()
 * printer.print("Document 1")  // Output: Printing document: Document 1
 * printer.print("Document 2")  // Output: Printing document: Document 2
 * ```
 * @property printedPages The number of pages printed by this printer.
 */
class PrinterImpl : Printer {
    private var printedPages = 0

    /**
     * Prints the specified document and increments the printed pages count.
     *
     * @param document The document to be printed.
     */
    override fun print(document: String) {
        println("Printing document: $document")
        printedPages++
    }
}
