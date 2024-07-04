package cl.ravenhill.printermodel

/**
 * Interface representing a scanner with the ability to scan documents.
 *
 * ## Usage:
 * This interface defines the contract for scanning documents, requiring an implementation of the `scan` method.
 *
 * ### Example 1: Implementing the Scanner Interface
 * ```
 * class CustomScanner : Scanner {
 *     override fun scan(document: String) {
 *         println("Custom scanning document: $document")
 *     }
 * }
 *
 * val scanner = CustomScanner()
 * scanner.scan("My Document")  // Output: Custom scanning document: My Document
 * ```
 */
interface Scanner {
    /**
     * Scans the specified document.
     *
     * @param document The document to be scanned.
     */
    fun scan(document: String)
}

/**
 * Implementation of the [Scanner] interface.
 *
 * ## Usage:
 * This class provides a basic implementation of the `Scanner` interface, keeping track of the number of scanned pages.
 *
 * ### Example 1: Using ScannerImpl to Scan Documents
 * ```
 * val scanner = ScannerImpl()
 * scanner.scan("Document 1")  // Output: Scanning document: Document 1
 * scanner.scan("Document 2")  // Output: Scanning document: Document 2
 * ```
 * @property scannedPages The number of pages scanned by this scanner.
 */
class ScannerImpl : Scanner {
    private var scannedPages = 0

    /**
     * Scans the specified document and increments the scanned pages count.
     *
     * @param document The document to be scanned.
     */
    override fun scan(document: String) {
        println("Scanning document: $document")
        scannedPages++
    }
}
