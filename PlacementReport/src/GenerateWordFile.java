import java.io.*;

import javax.swing.JOptionPane;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class GenerateWordFile
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{	
			String regd = args[0];
			String name = args[1];
			String branch = args[2];
			String year = args[3];
			String semester = args[4];
			
			XWPFDocument document = new XWPFDocument();
			String filePath = "C:\\Users\\Sagar\\Desktop\\" + regd + ".docx";
			FileOutputStream out = new FileOutputStream(new File(filePath));
			
			XWPFParagraph paragraphLeftAlign = document.createParagraph();
			XWPFParagraph paragraphCenterAlign = document.createParagraph();
			XWPFParagraph paragraphRightAlign = document.createParagraph();
			
			ParagraphAlignment center = ParagraphAlignment.CENTER;
			paragraphCenterAlign.setAlignment(center);
			
			ParagraphAlignment right = ParagraphAlignment.RIGHT;
			paragraphRightAlign.setAlignment(right);
			
			XWPFRun runLeftAlign = paragraphLeftAlign.createRun();
			XWPFRun runCenterAlign = paragraphCenterAlign.createRun();
			XWPFRun runRightAlign = paragraphRightAlign.createRun();
			
			String content[] = new String[13];
			content[0] = "To,";
			content[1] = "<insert designation here>";
			content[2] = "<insert company name here>";
			content[3] = "<insert address here>";
			content[4] = "Sub: Regarding the Summer Training/Internship Program";
			content[5] = "Dear Sir/Mam,";
			content[6] = "This is to certify that " + name + ", " + "Registration No. " + regd
					+ " is a bonafide student of Hi-Tech College of Engineering, studying in "
					+ year + " year B. Tech (" + semester + " semester) in the Department of "
					+ branch + ".";
			content[7] = "It will be highly appreciated if you can accommodate the student for "
					+ "practical training at your esteemed organization during the semester vacation.";
			content[8] = "The student while on training will submit an undertaking that he/she will "
					+ "perform the training as per rules/regulation of the organization/company.";
			content[9] = "Photograph & signature of " + name + ": ";
			content[10] = "____________________";
			content[11] = "Thanking you";
			content[12] = "Principal";
			
			//New code
			String imageFilePath = "C:\\Users\\Sagar\\Desktop\\" + regd + ".jpeg";
			FileInputStream pic = new FileInputStream(imageFilePath);
			int format = XWPFDocument.PICTURE_TYPE_JPEG;
			
			//New code
			
			runLeftAlign.setText(content[0]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[1]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[2]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[3]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[4]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[5]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[6]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[7]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.addCarriageReturn();
			runLeftAlign.setText(content[8]);
			runLeftAlign.addCarriageReturn();
			runLeftAlign.addCarriageReturn();
			
			runCenterAlign.addPicture(pic, format, "3", Units.toEMU(100), Units.toEMU(100));
			runCenterAlign.addCarriageReturn();
			runCenterAlign.addCarriageReturn();
			runCenterAlign.setText(content[10]);
			
			runLeftAlign.setText(content[9]);
			runLeftAlign.addCarriageReturn();
			
			runRightAlign.addCarriageReturn();
			runRightAlign.setText(content[11]);
			runRightAlign.addCarriageReturn();
			runRightAlign.addCarriageReturn();
			runRightAlign.addCarriageReturn();
			runRightAlign.addCarriageReturn();
			runRightAlign.setText(content[12]);
			
			document.write(out);
			
			out.close();
			
			JOptionPane.showMessageDialog(null, "Word file successfully generated");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
}