package pdf;

import java.io.IOException;

import org.testng.annotations.Test;

import projectLib.ReadPDF;

public class PDFDemo {

	//public static void main(String[] args) {
	@Test
	public void PDF() throws Exception, Exception{
		String File1, File2;
		File1="C:\\Users\\admin\\Desktop\\Satyaranjan kundu (397333).pdf";
		File2="C:\\Users\\admin\\Desktop\\Satya.pdf";
		ReadPDF.comparePdf(File1, File2);
		

	}

}
