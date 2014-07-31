package com.rav.insurance.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HTMLToPDF {

	public void getPDF(String html) {
		try {
			Document document = new Document();
			PdfWriter writer;

			writer = PdfWriter.getInstance(document, new FileOutputStream(
					"pdf.pdf"));

			document.open();

			XMLWorkerHelper.getInstance().parseXHtml(writer, document,
					new FileInputStream(html));

			document.close();
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
	}

}
