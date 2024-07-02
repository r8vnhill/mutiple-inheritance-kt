package cl.ravenhill.printermodel

class PrinterScanner(
    private val printer: PrinterImpl = PrinterImpl(),
    private val scanner: ScannerImpl = ScannerImpl()
) : Printer by printer, Scanner by scanner
