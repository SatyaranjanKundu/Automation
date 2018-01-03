package pdf;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class PDFDemoDiff {

	public static void main(String[] args) throws Exception {
		String File1 = "C:\\Users\\admin\\Desktop\\Satyaranjan kundu (397333).pdf";
		String File2 = "C:\\Users\\admin\\Desktop\\Satya.pdf";
		String mismatch = "C:\\Users\\admin\\Desktop\\mismatch";
		new PdfComparator(File1, File2).compare().writeTo(mismatch);

	}

}
