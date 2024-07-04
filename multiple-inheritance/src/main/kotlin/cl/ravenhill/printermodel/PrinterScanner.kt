package cl.ravenhill.printermodel

/**
 * Represents a device that functions as both a printer and a scanner.
 *
 * ## Usage:
 * This class combines the functionalities of a printer and a scanner by delegating the respective operations to
 * instances of [PrinterImpl] and [ScannerImpl].
 *
 * ### Example 1: Creating a PrinterScanner and Using Its Functionalities
 * ```
 * val printerScanner = PrinterScanner()
 * printerScanner.print("Document")  // Output: Printing document: Document
 * printerScanner.scan("Photo")      // Output: Scanning document: Photo
 * ```
 * @property printer The printer implementation used for printing.
 * @property scanner The scanner implementation used for scanning.
 *
 * @see PrinterImpl.print
 * @see ScannerImpl.scan
 */
class PrinterScanner(
    private val printer: PrinterImpl = PrinterImpl(),
    private val scanner: ScannerImpl = ScannerImpl()
) : Printer by printer, Scanner by scanner
