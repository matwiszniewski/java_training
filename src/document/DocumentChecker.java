package document;

public class DocumentChecker {

    public static void main(String[] args) {
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PDFdocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();

    }
}
