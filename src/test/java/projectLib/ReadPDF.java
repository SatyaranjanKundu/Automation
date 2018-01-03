package projectLib;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadPDF {

	public static void comparePdf(String File1, String File2) throws Exception, IOException{
		PDDocument pd1, pd2;
		PDFTextStripper pdf1, pdf2;
		pd1 = PDDocument.load(new File(File1));
		pd2 = PDDocument.load(new File(File2));
		System.out.println("Total Pages ="+pd1.getNumberOfPages());	
		pdf1 = new PDFTextStripper();
		pdf2 = new PDFTextStripper();
		String abc = pdf1.getText(pd1);
		System.out.println("Total Pages ="+pd2.getNumberOfPages());	
		String efg = pdf2.getText(pd2);
		Assert.assertEquals(abc, efg);
	}

}
